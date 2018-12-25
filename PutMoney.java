public class PutMoney extends Thread {
    private final BankAccount bankAccount;

    PutMoney(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }


    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i % 5 == 1) {

                synchronized (bankAccount) {

                    bankAccount.putMoney(1000);
                    bankAccount.notifyAll();
                }
            }
        }
    }
}

