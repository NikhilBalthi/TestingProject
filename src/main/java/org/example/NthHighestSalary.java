package org.example;


public class NthHighestSalary {
    public static void main(String[] args) {
//    String a = null;
//    String b = a.toUpperCase();
//        System.out.println(b);
    String sport = "football";
    String bestPlayer = switch (sport){
        case "football"->"xxx";
        case "cricker"-> "hey";
        default -> "ram";
    };
        System.out.println(bestPlayer);
    String name = "nikhil";
     String result  = switch (name){
         case "nikhil"-> {
             System.out.println("he lives in virginia");
             yield "xxx";
         }
         case "akhil"-> "he is currently in india";
         default -> "hey";
    };
        System.out.println(result);

        Object obj = "java 14 is heres";
        if(obj instanceof String s){
            //String result1 = (String) obj;String result1 = (String) obj;
            System.out.println(s.toUpperCase());
        }
    }

}
