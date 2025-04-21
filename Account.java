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
	public Account(String accountNum, DeliveryFrequency deliveryFrequency, String customerName) {
		// TODO - implement Account.Account
		throw new UnsupportedOperationException();
	}

	public String getAccountNum() {
		return this.accountNum;
	}

	public DeliveryFrequency getDeliveryFrequency() {
		// TODO - implement Account.getDeliveryFrequency
		throw new UnsupportedOperationException();
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public DeliveryPreference getDeliveryPreference() {
		// TODO - implement Account.getDeliveryPreference
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pref
	 */
	public boolean setDeliveryPreference(DeliveryPreference pref) {
		// TODO - implement Account.setDeliveryPreference
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param statement
	 */
	public boolean addStatement(Statement statement) {
		// TODO - implement Account.addStatement
		throw new UnsupportedOperationException();
	}

	public List<Statement> getStatements() {
		// TODO - implement Account.getStatements
		throw new UnsupportedOperationException();
	}

}