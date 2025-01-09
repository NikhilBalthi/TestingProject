package org.example;

public class NewThreadDemo {
    public static void main(String[] args) {
        new NewThread();
        try{
            for(int i=0;i<5;i++){
                System.out.println("main thread i value is "+i);
                Thread.sleep(3000);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
