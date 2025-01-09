package org.example;

public class NewThread implements Runnable{

    Thread t;
    public NewThread() {
        t= new Thread(this,"Demo Thread");
        t.start();
    }
    @Override
    public void run() {
        try{
            for(int i=0;i<5;i++){
                System.out.println("child thread i value is "+i);
                t.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
