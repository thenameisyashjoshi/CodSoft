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
