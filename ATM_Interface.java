public interface AtmOperation {
    void deposit(double amount);
    void withdraw(double amount);
    void chackBalance();
}

public class BankAccount implements AtmOperation {
    private double Balance;
    public BankAccount(double InitialBalance){
        this.Balance = InitialBalance;
    }
    
    @Override
    public void deposit(double amount){
        if(amount>0){
            Balance += amount;
            System.out.println("₹"+amount+" Deposited Successfully");
        }
        else{
            System.out.println("Deposite Amount must be Positive :)");
        }
    }

    @Override
    public void withdraw(double amount){
        if(amount>0 && amount<=Balance){
            Balance -= amount;
            System.out.println("₹"+amount+" Withdrawn Successfully");
        }
        else if(amount > Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            System.out.println("Invalid Withdrawn Amount!");
        }
    }



    @Override
    public void chackBalance(){
        System.out.println("Your Balance is ₹"+Balance);
    }
}

import java.util.*;
public class Atm {
    private AtmOperation account;
    private Scanner sc = new Scanner(System.in);

    public Atm(AtmOperation account){
        this.account = account;
    }
    public void Start(){
        int choice;
        do {
             System.out.println("\n"+"----ATM Menu----");
             System.out.println("1. Check Balance");
             System.out.println("2. Deposite");
             System.out.println("3. Withdraw");
             System.out.println("4. Exit");
             System.out.print("Enter Your Choice: ");
             choice = sc.nextInt();

             switch (choice) {
                case 1:
                account.chackBalance();
                    break;

                case 2:
                System.out.print("\nEnter Amount to Deposite: ");
                double deposit = sc.nextDouble();
                account.deposit(deposit);
                    break;
                
                case 3:
                System.out.print("\nEnter Amount to Withdraw: ");
                double withdraw = sc.nextDouble();
                account.withdraw(withdraw);
                    break;

                case 4:
                System.out.print("\nThankyou for using the ATM :)");
                    break;
                
                default:
                System.out.println("Enter Valid Choice");
                    break;
             }   
        } while (choice!=4);
    }
}

public class AtmApp {
    public static void main(String[] args) {
        AtmOperation operation = new BankAccount(10000.00);
        Atm atm = new Atm(operation);
        atm.Start();
    }
}
