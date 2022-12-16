package Threads;

public class MultiThreading01 {

    public static void main(String[] args) {
        Long startTime = System.currentTimeMillis();

        CounterWithoutMultiThread counter1 = new CounterWithoutMultiThread(1);
        CounterWithoutMultiThread counter2 = new CounterWithoutMultiThread(2);
        counter1.countMe();
        System.out.println("-------------------");
        counter2.countMe();
        Long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        Long startTime2 = System.currentTimeMillis();

        CounterWithMultiThread counter3 = new CounterWithMultiThread(1);
        CounterWithMultiThread counter4 = new CounterWithMultiThread(2);
        counter3.start();
        System.out.println("-------------------");
        counter4.start();
        Long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2 - startTime2);


    }
}

class CounterWithoutMultiThread {
    private int threadNum;

    public CounterWithoutMultiThread(int threadNum) {
        this.threadNum = threadNum;
    }

    public void countMe() {
        for (int i = 1; i < 11; i++) {
            try {
                Thread.sleep(500); //0.5 saniye yavaslatti
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("i " + i + " Thread number : " + threadNum);
        }
    }
}

class CounterWithMultiThread extends Thread {
    private int threadNum;

    public CounterWithMultiThread(int a) {
        this.threadNum = a;
    }

    @Override
    public void run() {
        countMe();
    }

    public void countMe() {
        for (int i = 1; i < 11; i++) {
            try {
                Thread.sleep(500); //0.5 saniye yavaslatti
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("i " + i + " Thread number : " + threadNum);
        }
    }
}