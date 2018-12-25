public class TakeMoney extends Thread{
    private final BankAccount bankAccount;
    TakeMoney(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }


    public void run(){
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (bankAccount) {

                while (bankAccount.getBalance() < 2000) {
                    try {
                        bankAccount.wait();
                        System.out.println("Нечего снимать");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                bankAccount.takeMoney(2000);
                System.out.println("С вас сняли 2000");

            }
        }
    }
}


