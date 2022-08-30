
public class RyanAndMonicaJob implements Runnable{

    public static void main (String [] args){
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();
        Thread t1 = new Thread(theJob);
        Thread t2 = new Thread(theJob);
        t1.setName("Ryan");
        t2.setName("Monica");
        t1.start();
        t2.start();
    }
    private BankAccount account = new BankAccount();

    public void run() {

        for(int i = 0; i < 10; i++){
            makeWithdrawl(10);
            if (account.getBalance() < 0) {
                System.out.println("OverDrawn!");
            }
        }
    }

    private synchronized void makeWithdrawl(int amount){
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " is about to withdraw");
            try{
                System.out.println(Thread.currentThread().getName() + " is going to sleep");
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " woke up");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " completes withdrawal");
        }
        else {
            System.out.println("Sorry, not enough for " + Thread.currentThread().getName());
        }
    }

}
