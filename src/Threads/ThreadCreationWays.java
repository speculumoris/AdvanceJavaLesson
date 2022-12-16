package Threads;

public class ThreadCreationWays {
    public static void main(String[] args) {
        //Ilk calisan thread main thread'dir
        System.out.println("Current Thread: " + Thread.currentThread().getName());
        MyThread thread1 = new MyThread();
        thread1.start(); // thread sınıfında run() methodunda yazılanlar işelnmeye baslar.
        //thread1.run();       // thread sınıfında run() metodunda yazılanlar işlenmeye başlar
        // run() diyerekte çağırdığımızda method yine çalışıyor , start() ile çağırmamız
        // arasındaki fark : run() ile çağırıldığında thread değişmez sadece methos çalışır
        // start() da ise önce thread ayağa kalkar daha sonra içindeki run() metodu çalışır

        MyRunnabale runnabale = new MyRunnabale();
        Thread thread2 = new Thread(runnabale);
        thread2.start();

        //!!! isimsiz olarak thread olusturma,anonymous
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


                System.out.println("Current Thread : " + Thread.currentThread().getName());
                System.out.println("Bu isimsiz sınıf yoluyla olusturulan is parcacigidir");
            }
        });

        thread3.setName("Thread3");
        thread3.start();
        //isimsiz olarak method thread olusturalım 2.yol

        Thread thread4 = new Thread(() -> {
            System.out.println("lambda ile yazıldı");
        });
        thread4.start();
        System.out.println("Main methodu bitti");

        Thread thread5 = new Thread(() -> {
            System.out.println("thread5 calisti");
        });
        thread5.start();


    }
}

//1:Yol : Thread classını extend ederek
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread threadi calisiyor");
    }
}

//2.yol
class MyRunnabale implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable Interface'den turetilen thread calisti");
    }
}
