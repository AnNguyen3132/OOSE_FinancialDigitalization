from sqlalchemy import Column, Integer, String, DateTime, LargeBinary, ForeignKey
from sqlalchemy.sql import func
from sqlalchemy.orm import declarative_base, relationship

from sqlalchemy import create_engine
from sqlalchemy.orm import sessionmaker

Base = declarative_base()

# Make model for each table
class User(Base):
	__tablename__ = 'User'
	username = Column(String(256), primary_key=True)
	password = Column(String(256))

class Customer(Base):
	__tablename__ = 'Customer'
	username = Column(String(256), primary_key=True)
	ssnDigits = Column(Integer)

class Admin(Base):
	__tablename__ = 'Admin'
	username = Column(String(256), primary_key=True)

class Log(Base):
	__tablename__ = 'Log'
	username = Column(String(256))
	msg = Column(String(256))
	dateTime = Column(DateTime, default=func.now())
	severity = Column(Integer)
	id = Column(Integer, primary_key=True, autoincrement=True) # added for sake of ORM
	
class Account(Base):
	__tablename__ = 'Account'
	username = Column(String(256))
	accountNum = Column(String(256), primary_key=True)
	deliveryFrequency = Column(String(256))
	customerName = Column(String(256))
	deliveryPreferences = Column(String(32))
	
class Statement(Base):
	__tablename__ = 'Statement'
	accountNum = Column(String(256))
	documentID = Column(String(256), primary_key=True)
	data = Column(LargeBinary)
	docDate = Column(DateTime)
	

try:
	#perform CRUD
	engine = create_engine("mysql+pymysql://user:password@localhost/oose")
	Session = sessionmaker(bind=engine)
	session = Session()
	print("Session made successfully")

	#ask for user input
	username = input("Enter a new username: ")
	password = input("Enter a new password: ")

	#Create customer account w/ SQLAlchemy ORM
	new_user = User(username = username, password=password)
	session.add(new_user)
	session.commit()
	print("-user added")

	new_customer = Customer(username = username, ssnDigits = 123456789)
	session.add(new_customer)
	session.commit()
	print("-as customer")

	new_log = Log(username = username, msg = "a customer was created", severity = 0)
	session.add(new_log)
	session.commit()
	print("-and logged")
	
	#Read user databases
	result = session.query(User).all()
	for user in result:
		print("User: " + user.username)
	
	#Update
	newpassword = input("Enter a new password: ")
	user = session.query(User).filter_by(username=username).first()
	user.password = newpassword
	session.commit()
	
	result = session.query(User).filter_by(username=username).first()
	print("new password is: " + result.password)
	
	#Delete
	input("ready to move on? [Enter]")
	print("Oops, need to delete your account!")
	session.delete(new_log)
	session.delete(new_customer)
	session.delete(user)
	session.commit()
	result = session.query(User).all()
	for user in result:
		print("User: " + user.username)
	
except:
	print("An exception ocurred")

session.close()
