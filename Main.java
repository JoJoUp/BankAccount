public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10_000);
        PutMoney putMoney = new PutMoney(bankAccount);
        TakeMoney takeMoney = new TakeMoney(bankAccount);
        putMoney.start();
        takeMoney.start();
    }
}
