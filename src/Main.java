public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // Create one BankAccount object
        BankAccount kensAccount = new BankAccount(50.00);
        System.out.println(kensAccount.getBalance());

        // Create multiple bank accounts
        BankAccount[] accounts = new BankAccount[5];
        accounts[0] = new BankAccount(2023.00);
        accounts[1] = new BankAccount(100.00);
        accounts[2] = kensAccount;
        accounts[3] = new BankAccount(200.00);
        accounts[4] = new BankAccount(10.00);

        accounts[2].withdraw(100);
        System.out.println(accounts[2].getBalance());       // ???
        System.out.println(kensAccount.getBalance());       // ???

        // Create one country
        Country kensCountry = new Country("Kentopia", 1);

        Country[] countries = {
                new Country("USA", 3190432),
                new Country("France", 12345),
                new Country("Japan", 429420),
                new Country("Vietnam", 312032),
                new Country("Mexico", 104020),
                kensCountry
        };

        System.out.println(average(accounts));
    }

    // new method to find the average of a BankAccout array
    public static double average(BankAccount[] theAccounts) {
        double sum = 0.0;
        for (BankAccount single : theAccounts) {
            sum += single.getBalance();
        }

        double result = sum / theAccounts.length;
        return result;
    }
}