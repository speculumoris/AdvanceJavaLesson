package Threads;

public class WaitInterrupt {
    static public int balance=0;
    public static void main(String[] args) {

        WaitInterrupt obj =new WaitInterrupt();

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
            obj.withdraw(800);
            }
        });
        thread1.setName("Withdraw thread");
        thread1.start();

        //deposit
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                obj.deposit(2000);
                thread1.interrupt();//thread2 burada kibarca thread1',i sonlandırıyor
            }
        });
        thread2.setName("thread dposit");
        thread2.start();

    }
    public void withdraw(int amount){

        synchronized (this){
            if (balance <=0 || balance<amount){
                System.out.println("bekleme");
                try {
                    wait();
                } catch (InterruptedException e) {
                    balance=balance-amount;
                    System.out.println("basarili");
                    throw new RuntimeException(e);
                }
            }

        }

    }

    public void deposit(int amount){
        balance=balance+amount;
        System.out.println("Basarili");
    }
}



