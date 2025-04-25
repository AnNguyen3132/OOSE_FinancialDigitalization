

public class AccountTest {
    public static void main(String[] args) {
        try {
            CheckArgumentsTest();
            CheckStatementsTest();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        

    }

    public static void CheckArgumentsTest() {
        boolean passedChecks = true;

        String accountNumber = "111110";
        String deliveryFrequency = "Monthly";
        String customerName = "John Smith";
        Account testAccount = new Account(accountNumber, deliveryFrequency, customerName);

        // Check if constructor properly added arguments
        if (!testAccount.getAccountNum().equals(accountNumber)) {
            passedChecks = false;
            System.err.println("The accountNumber did not return successfully.");
        }
        if (!testAccount.getDeliveryFrequency().equals(deliveryFrequency)) {
            passedChecks = false;
            System.err.println("The deliveryFrequency did not return successfully.");
        }
        if (!testAccount.getCustomerName().equals(customerName)) {
            passedChecks = false;
            System.err.println("The customerName did not return successfully.");
        }

        if (passedChecks) {
            System.out.println("All CheckArgumentsTest subtests have passed");
        }
    }

    public static void CheckStatementsTest() {
        // TODO: implement
    }

    public static void DeliveryPreferenceTest() {
        // TODO: implement

    }
}

class MockStatement extends Statement {
    public MockStatement() {
        super(0, null, null);
    }
}