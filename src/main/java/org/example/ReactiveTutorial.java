package org.example;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;
import reactor.util.function.Tuple3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ReactiveTutorial {


    private Mono<String> testMono(){
        return Mono.empty();
    }

    private Flux<String> testFlux(){
       List<String> all = List.of("hello", "world");
        return Flux.fromIterable(all);
    }

   private Flux<String> testMap(){
        Flux<String> flux = Flux.just("ram","bheem");
        return flux.map(s->s.toUpperCase());
   }


   private Flux<String> testFlatMap(){
        Flux<String> flux = Flux.just("java","reactive","functional");
        return flux.flatMap(s-> Mono.just(s.toUpperCase()));
   }

   private Flux<String> testSkip(){
        Flux<String> flux = Flux.just("java","reactjs","angular","spring","hibernate");
        return flux.skip(2).map(s-> s.toUpperCase());
    }

    private Flux<String> fluxSkipLast(){
        Flux<String> flux  = Flux.just("java","reactjs","angular","Spring");
        return flux.skipLast(2);
    }

    private Flux<String> testSkipForDuration(){
        Flux<String> flux = Flux.just("java","reactjs","angular","spring","hibernate")
                .delayElements(Duration.ofSeconds(1));
        return flux.skip(Duration.ofMillis(3018));
    }

    private Flux<String> testDuration(){
        Flux<String> flux = Flux.just("java","angular");
        return flux.delayElements(Duration.ofSeconds(1)).log();
    }
    private Flux<Integer> fluxMerge(){
        Flux<Integer> fluxOne = Flux.range(1,20)
                .delayElements(Duration.ofSeconds(1));
        Flux<Integer> fluxTwo = Flux.range(21,20)
                .delayElements(Duration.ofSeconds(1));
        return Flux.merge(fluxOne,fluxTwo);
    }
    private Flux<Integer> testFluxRange(){
        Flux<Integer> flux = Flux.range(1,10);
        return flux.log();
    }

    private Flux<Integer> fluxComplexSkip(){
        Flux<Integer> fluxIntegerComplexSkip = Flux.range(1,20);
        return fluxIntegerComplexSkip.skipWhile(s->s>13);
    }

    private Flux<Integer> fluxSkipUntil(){
        Flux<Integer> fluxone = Flux.range(1,10);
        return fluxone.skipUntil(s->s==10);
    }

    private Flux<Integer> fluxConcat(){
        Flux<Integer> fluxOne = Flux.range(1,10);
        Flux<Integer> fluxTwo = Flux.range(11,10);
        Flux<Integer> fluxThree = Flux.range(1001,20);
        return Flux.concat(fluxOne,fluxTwo,fluxThree);
    }

    private Flux<Tuple2<Integer, Integer>> fluxZip(){
        Flux<Integer> fluxOne = Flux.range(1,10);
        Flux<Integer> fluxTwo = Flux.range(11,20);
        return Flux.zip(fluxOne,fluxTwo);
    }

    private Flux<Tuple3<Integer,Integer,Integer>> fluxZipThree(){
        Flux<Integer> fluxOne = Flux.range(1,10)
                     .delayElements(Duration.ofSeconds(1));
        Flux<Integer> fluxTwo = Flux.range(11,10)
                .delayElements(Duration.ofSeconds(1));
        Flux<Integer> fluxThree = Flux.range(21,10)
                .delayElements(Duration.ofSeconds(1));
        return Flux.zip(fluxOne,fluxTwo,fluxThree);
    }

    private Flux<Tuple2<Integer,Integer>> fluxFluxAndMono(){
        Flux<Integer> fluxOne = Flux.range(1,10);
        Mono<Integer> mono = Mono.just(1);
        return Flux.zip(fluxOne,mono);
    }

    private Mono<List<Integer>> testCollect(){
        Flux<Integer> fluxOne = Flux.range(1,10)
                .delayElements(Duration.ofSeconds(1));
        return fluxOne.collectList();
    }

    private Flux<List<Integer>> testBuffer(){
        Flux<Integer> flux = Flux.range(1,10);
        return flux.buffer(4);
    }

    private Flux<List<Integer>> testBuffer2(){
        Flux<Integer> fluxOne = Flux.range(1,30);
        return fluxOne.buffer(5);
    }

    public static void main(String[] args) throws InterruptedException {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(4);

        a.addAll(b);
        System.out.println("a after adding b "+a);

        ReactiveTutorial reactiveTutorial = new ReactiveTutorial();

        System.out.println("skip until checking");
        //reactiveTutorial.fluxSkipUntil().subscribe(System.out::println);

        System.out.println("checing flux concat");
       // reactiveTutorial.fluxConcat().subscribe(System.out::println);

        System.out.println("flux merger");
        //reactiveTutorial.fluxMerge().subscribe(System.out::println);

        System.out.println("flux Zip");
        //reactiveTutorial.fluxZip().subscribe(System.out::println);

        System.out.println("flux Zip Threee");
        //reactiveTutorial.fluxZipThree().subscribe(System.out::println);

        System.out.println("flux Flux and Mono");
        //reactiveTutorial.fluxFluxAndMono().subscribe(System.out::println);

        System.out.println("flux buffer");
        reactiveTutorial.testBuffer().subscribe(System.out::println);

        System.out.println("flux test buffer 2");
        reactiveTutorial.testBuffer2().subscribe(System.out::println);

//        reactiveTutorial.testMono().subscribe(System.out::println);
//
//        reactiveTutorial.testFlux().subscribe(System.out::println);
//
//        reactiveTutorial.testMap().subscribe(System.out::println);
//
//        reactiveTutorial.testFlatMap().subscribe(System.out::println);
//
//        reactiveTutorial.testSkip().subscribe(System.out::println);

        System.out.println("========Checking Skip==========");

        //reactiveTutorial.testSkip().subscribe(System.out::println);

        //reactiveTutorial.testDuration().subscribe(System.out::println);

        System.out.println("========Checking Duration==========");

       // reactiveTutorial.testSkipForDuration().subscribe(System.out::println);

        System.out.println("========Checking SkipLast==========");
        //reactiveTutorial.fluxSkipLast().subscribe(System.out::println);

        System.out.println("========Checking Range==========");
        //reactiveTutorial.testFluxRange().subscribe(System.out::println);

        System.out.println("========Checking Complex Skip==========");
        //reactiveTutorial.fluxComplexSkip().subscribe(System.out::println);

        Thread.sleep(40000);

        Thread thread = new Thread();
        System.out.println("current thread name is "+ thread.getName());
        thread.setName("myThread");
        thread.setPriority(8);
        System.out.println("changed the name of thread , name is "+thread.getName());
        System.out.println("thread" +thread);
//        try{
//            for(int i=0;i<5;i++){
//                System.out.println("i value is "+i);
//                Thread.sleep(1000);
//            }
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }

    }
}


