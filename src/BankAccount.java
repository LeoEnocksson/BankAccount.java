import java.util.Random;

public class BankAccount {
    private int accountNumber;
    private String customerName;
    private double balance;
    private static int numberOfAcc = 0;

    public String getAccountInfo() {
        return "Account number: " + accountNumber + "\nCustomer Name: " + customerName + "\nBalance:" + balance +"\n";
    }
    //TODO: denna är fel, i konstruktorn måste man tilldela randomnummber
    public BankAccount(String name, double bal) {
        customerName = name;
        balance = bal;
        numberOfAcc ++;
        //TODO: NEWRANDOM
        accountNumber = NewRandom(1000, 9999);

    }

    public int getAccountNum() {
        
     //   Random randomGenerator = new Random();
       // int accountNumber = randomGenerator.nextInt(10000);       
       //int accountNumber = NewRandom(1000, 9999);
       int account = accountNumber;
        return account;
    }
    
    public static int NewRandom(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
//TODO: göra liknande meddelanden på de andra?
    public void deposit(double amount) {
        if (amount<0) {
            System.out.println("The amount should be positive");
        } else {
            System.out.println("Balance before deposit " + balance);
            balance = balance + amount;
            System.out.println("You just deposited " + amount);
            System.out.println("Current balance " + balance);
            }
        }

        public void withdraw(double amount)
    {
        if (amount<=0){
             System.out.println("Amount to be withdrawn should be positive");
         }
        else
        {
            if (balance < amount) {
                System.out.println("Insufficient balance");
            } else {
                balance = balance - amount;

            }
        }
    }

}