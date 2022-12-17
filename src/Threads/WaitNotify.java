package Threads;

public class WaitNotify {
    public static int balance =0;

    public static void main(String[] args) {
        WaitNotify obj =new WaitNotify();

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                obj.withdraw(800);
            }
        });
        thread.setName("Withdraw thread");
        thread.start();

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                obj.deposit(500);
            }
        });
        thread1.setName("deposit thread");
        thread1.start();

    }

    public void withdraw(int amount){
        synchronized (this){
            if (balance<=0 || balance <amount){
                System.out.println("Blance değişene kadar beklyirouz");
                try {
                    wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        } // synchronized sonu
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        balance=balance-amount;
        System.out.println("Para çekim işlemi başarıyla gerçekleşmiştir");

    }
    public void deposit(int amount){
        balance=balance+amount;
        System.out.println("para yatırma isleminiz basarıyla gerceklesmistir");
        synchronized (this){
            notify();
        }
    }
}
