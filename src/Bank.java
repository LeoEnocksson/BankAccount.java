public class Bank {

    private BankAccount[] accounts;
    private int numberOfAccounts = 5;

public Bank() {
    accounts = new BankAccount[5];
    numberOfAccounts = 0;
}
public int openNewAccount(String CustomerName, double openingBalance) {
    BankAccount b = new BankAccount(CustomerName, openingBalance);
    accounts[numberOfAccounts] = b;
    numberOfAccounts++; 
    int Acc = b.getAccountNum();
    //int Pass = b.getAccountNum()[1];
    //int[]details = {Acc, Pass};
    //return details;
    return Acc;
}

//TODO: rätt. Kan lägga till fel redan vid fel lösen.
public void withdrawFrom(int accountNum, double amount) {
   for (int i =0; i<numberOfAccounts; i++) {
       int a = accounts[i].getAccountNum();
        if (accountNum == a) {
            accounts[i].withdraw(amount);
            System.out.println("Amount withdrawn successfully");
            System.out.println("You deposited " + amount + " from your account");
            return;
        }
    }
    System.out.println("Account number not found.");
    }
//TODO: denna är fel
public void depositTo(int accountNumber, double amount) {
    for (int i = 0; i<numberOfAccounts; i++) {
        if (accountNumber == accounts[i].getAccountNum()) {
            accounts[i].deposit(amount);
            System.out.println("Deposit successfull");
            System.out.println("You deposited " + amount + " from your account");
            return;
        }
    }
    System.out.println("Account number not found.");
} 
//TODO: denna är fel
public void printAccountInfo(int accountNumber, int n) {
    for (int i=0; i<numberOfAccounts; i++) {
        if(accountNumber == accounts[i].getAccountNum()) {
            return;
        }
    }
    System.out.println("Account number not found.");
}
//TODO: denna är fel
public void printAccountInfo(int accountNum) {
    for (int i =0; i<numberOfAccounts; i++) {
                if (accountNum == accounts[i].getAccountNum()  ) {
                    System.out.println(accounts[i].getAccountInfo());
                    return;
                }
            }
    System.out.println("Account number not found.");
}

}

