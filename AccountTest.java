import java.util.List;

public class AccountTest {
    public static void main(String[] args) {
        try {
            CheckArgumentsTest();
            CheckStatementsTest();
            DeliveryPreferenceTest();
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
        Account testAccount = new Account(null, null, null);
        MockStatement[] statements = {new MockStatement(), new MockStatement()};

        // Check to see if we can add at least two statements
        if (!testAccount.addStatement(statements[0])) {
            System.err.println("statements[0] could not be added.");
            return;
        }
        if (!testAccount.addStatement(statements[1])) {
            System.err.println("statements[1] could not be added.");
            return;
        }

        // Check to see if we can get the same statements back
        List<Statement> stmts = testAccount.getStatements();
        for (Statement stmt : statements) {
            if (!stmts.contains(stmt)) {
                System.err.println("Could not find a statement.");
            }
        }

        // All tests passed
        System.out.println("All CheckStatementsTest subtests have passed");
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