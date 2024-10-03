
class Bank {
    private double amount;

    // Parameterized constructor
    public Bank(double amount) {
        this.amount = amount;
    }

    // Withdraw method with condition
    public void withdraw(double withdrawalAmount) {
        String message = (amount >= withdrawalAmount) ? "Withdraw successful" : "Insufficient funds";
        if (amount >= withdrawalAmount) {
            amount -= withdrawalAmount;
        }
        System.out.println(message);
    }

    // Deposit method
    public void deposit(double depositAmount) {
        amount += depositAmount;
    }

    // Display total balance
    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    public static void main(String[] args) {
        // Initializing with 10000
        Bank account = new Bank(10000);

        // Withdraw 2000
        account.withdraw(2000);

        // Deposit 5000
        account.deposit(5000);

        // Display final balance
        account.displayBalance();
    }
}

