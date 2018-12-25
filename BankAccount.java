public class BankAccount {
    int balance;
    BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void putMoney(int money){
        balance += money;
    }

    public void takeMoney(int money){
        balance -= money;
    }
}
