import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Bank myBank = new Bank();

       int userChoice = 2;

      do  {
        System.out.println("");
        System.out.println("____________________________________");
        System.out.println("");
        System.out.println("1) Open a new bank account");
        System.out.println("2) Deposit to a bank account");
        System.out.println("3) Withdraw to bank account");
        System.out.println("4) Print account balance");
        System.out.println("5) Quit");
        System.out.println();
        System.out.print("Enter choice: ");
        userChoice =scanner.nextInt();

        switch (userChoice) {
            case 1:
            System.out.print("Enter name: ");
            String name = scanner.next();
            System.out.println("Enter your opening balance: ");
            double bal = scanner.nextDouble();
            System.out.println("Account was created");
            System.out.println("Account Number: " + myBank.openNewAccount(name, bal));
            break;
            case 2: System.out.println("Enter a account number: ");
                    int an = scanner.nextInt();
                    System.out.println("Enter a deposit amount: ");
                    double da = scanner.nextDouble();
                    myBank.depositTo(an, da);
                    break;
            case 3: System.out.println("Enter a account number: ");
                    int acn = scanner.nextInt();
                    System.out.println("Enter a withdraw amount: ");
                    double wa = scanner.nextDouble();
                    myBank.withdrawFrom(acn, wa);
                    break;
            case 4: System.out.println("Enter a account number: ");
                    int anum = scanner.nextInt();
                    myBank.printAccountInfo(anum);
                    break;
            case 5:
                    System.out.println("Until next time!");
            case 6:
            System.out.println("");
            System.out.println("____________________________________");
            System.out.println("");
                System.exit(0);
        }
       }
       while (userChoice !='6');
    }
}

