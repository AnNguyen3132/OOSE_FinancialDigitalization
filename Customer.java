
import java.util.ArrayList;
import java.util.List;

public class Customer extends User {

	private String ssnDigits;
	private ArrayList<Account> accounts;

	/**
	 * 
	 * @param username
	 * @param password
	 * @param ssnDigits
	 * @param accountNumber
	 */
	public Customer(String username, String password, String ssnDigits, String accountNumber) {
		// TODO - implement Customer.Customer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param account
	 */
	public boolean updateAccountNumber(Account account) {
		// TODO - implement Customer.updateAccountNumber
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param otherSsn
	 */
	public boolean compareSsn(String otherSsn) {
		// TODO - implement Customer.compareSsn
		throw new UnsupportedOperationException();
	}

	public List<Account> getAccounts() {
		// TODO - implement Customer.getAccounts
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param account
	 */
	public List<Statement> getStatements(Account account) {
		// TODO - implement Customer.getStatements
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param newPassword
	 */
	public boolean updatePassword(String newPassword) {
		// TODO - implement Customer.updatePassword
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param account
	 * @param preference
	 */
	public void updatePreference(Account account, boolean preference) {
		// TODO - implement Customer.updatePreference
		throw new UnsupportedOperationException();
	}

}