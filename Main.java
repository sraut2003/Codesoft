import java.util.*;

class BankAccount{
    private double balance;

    public BankAccount(double initialBalance){
        this.balance=initialBalance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Deposit successful.New balance:Rs"+balance);
        }
        else
        {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount<=balance)
        {
            balance-=amount;
            System.out.println("Withdraw successful.New balance:Rs"+balance);
   
        }
        else
        {
            System.out.println("Invalid Withdrawal amount or insufficient balance");
        }
    }
}

class ATM{
    private BankAccount userAccount;

    public ATM(BankAccount account){
        this.userAccount=account;
    }

    public void displayMenu(){
        System.out.println("1.Withdraw");
        System.out.println("2.Deposit");
        System.out.println("3.Check Balance");
        System.out.println("4.Exit");
    }

    public void processOption(int option){
        Scanner scanner=new Scanner(System.in);
        double amount;

        switch(option){
            case 1:System.out.println("Enter withdrawal amount:Rs");
                   amount=scanner.nextDouble();
                   userAccount.withdraw(amount);
                   break;

            case 2:System.out.println("Enter Deposit amount:Rs");
                   amount=scanner.nextDouble();
                   userAccount.deposit(amount);
                   break;

            case 3:System.out.println("Current Balance:Rs"+userAccount.getBalance());
                   break;

            case 4:System.out.println("Exiting ATM. Thank you!");
                   System.exit(0);
                   break;

            default:System.out.println("Invalid option.Please try again.");
        }
    }
}
public class Main{
     public static void main(String args[]){
        BankAccount userAccount=new BankAccount(1000.0);
        ATM atmMachine=new ATM(userAccount);

        while(true){
            atmMachine.displayMenu();
            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter option (1-4):");
            int option=scanner.nextInt();
            atmMachine.processOption(option);
        }
    }
}
