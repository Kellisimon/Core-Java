package Threads.ThreadClass;

import Threads.CountDownTimer;

public class ThreadEx1 implements Runnable{
    public void run() {
        System.out.println("Currently executing this thread is: "
        + Thread.currentThread().getName());

        System.out.println("This thread holds lock? " + Thread.holdsLock(this));
        synchronized (this){
            System.out.println("Does thread holds lock? " + Thread.holdsLock(this));
        }
    }

    public static void main(String[] args) {
        ThreadEx1 obj = new ThreadEx1();
        Thread th = new Thread(obj);
        th.start();
    }



}
