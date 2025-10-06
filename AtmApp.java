public class AtmApp {
    public static void main(String[] args) {
        AtmOperation operation = new BankAccount(10000.00);
        Atm atm = new Atm(operation);
        atm.Start();
    }
}
