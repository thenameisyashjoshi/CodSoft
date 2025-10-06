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