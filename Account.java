
import java.util.ArrayList;
import java.util.List;

public class Account {

	private String accountNum;
	private String deliveryFrequency;
	private String customerName;
	private String deliveryPreference;
	private ArrayList<Statement> statements;

	/**
	 * 
	 * @param accountNum
	 * @param deliveryFrequency
	 * @param customerName
	 */
	public Account(String accountNum, String deliveryFrequency, String customerName) {
		this.accountNum = accountNum;
		this.deliveryFrequency = deliveryFrequency;
		this.customerName = customerName;
		deliveryPreference = ""; // TODO: Figure out client preference on default state, and determine if states should be an enum
		statements = new ArrayList<>();
	}

	public String getAccountNum() {
		return this.accountNum;
	}

	public String getDeliveryFrequency() {
		return this.deliveryFrequency;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public String getDeliveryPreference() {
		return this.deliveryPreference;
	}

	/**
	 * 
	 * @param pref
	 */
	public boolean setDeliveryPreference(String pref) {
		deliveryPreference = pref;
		return true;
	}

	/**
	 * 
	 * @param statement
	 */
	public boolean addStatement(Statement statement) {
		statements.add(statement);
		return true;
	}

	public List<Statement> getStatements() {
		return List.copyOf(statements);
	}

}