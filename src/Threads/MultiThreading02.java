package Threads;

//thread ler aynı kaynağa erişmek isterlerse
public class MultiThreading02 {

    public static int counter=0;
    public static void main(String[] args) {
        // !!! ayrı iki thread olusturup aynı kaynaga erismesini saglayalım
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
            Counter.count();
                System.out.println(" Thread1 calisti");
            }
        });
        thread1.start();

       // thread1.join();


        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                Counter.count();
                System.out.println(" Thread2 calisti");
            }
        });
        thread2.start();
    }

}

class Counter {
    public synchronized static void count(){
        for (int i=1;i<=1000;i++){
            MultiThreading02.counter++;
        }
        System.out.println("Counter : "+ MultiThreading02.counter);
    }
}
