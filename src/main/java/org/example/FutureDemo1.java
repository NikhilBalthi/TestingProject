package org.example;

import java.util.concurrent.*;

public class FutureDemo1 {
    public String getFirstName(){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw  new RuntimeException(e);
        }
        return "nikhil";
    }
    public String getLastName(){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        return "balthi";
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        long startTime = System.currentTimeMillis();

        FutureDemo1 futureDemo1 = new FutureDemo1();

       Callable<String> firstNameCallable = new Callable<String>() {
           @Override
           public String call() throws Exception {
               return futureDemo1.getFirstName();
           }
       };

       Callable<String> lastNameCallable = new Callable<String>() {
           @Override
           public String call() throws Exception {
               return futureDemo1.getLastName();
           }
       };

       ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> firstNameFuture = executorService.submit(firstNameCallable);
        Future<String> lastNameFuture = executorService.submit(lastNameCallable);

        System.out.println(" complete Name "+firstNameFuture.get()+lastNameFuture.get());

        System.out.println(" time taken till now "+(System.currentTimeMillis()-startTime) );

    }
}
