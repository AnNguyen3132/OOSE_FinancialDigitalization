import java.util.ArrayList;

public class UserDatabase {

	private UserDatabase instance;
	private ArrayList<User> users;

	private UserDatabase() {
		// TODO - implement UserDatabase.UserDatabase
		throw new UnsupportedOperationException();
	}

	public UserDatabase getInstance() {
		return this.instance;
	}

	/**
	 * 
	 * @param username
	 * @param password
	 */
	public User login(String username, String password) {
		// TODO - implement UserDatabase.login
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param username
	 */
	public User getUser(String username) {
		// TODO - implement UserDatabase.getUser
		throw new UnsupportedOperationException();
	}

}