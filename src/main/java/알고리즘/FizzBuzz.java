package 알고리즘;


import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> fizzBuzz(int n){
        final List<String> toReturn = new ArrayList<>(n);
        for(int i=1; i<=n; i++){
            if(i % 15 == 0){
                toReturn.add("FizzBuzz");
            }else if(i % 5 == 0){
                toReturn.add("Buzz");
            }else if(i % 3 == 0){
                toReturn.add("Fizz");
            }else{
                toReturn.add(String.valueOf(i));
            }
        }
        return toReturn;
    }

    public static List<String> betterFizzBuzz(int n){
        final List<String> toReturn = new ArrayList<>(n);
        for(int i=1; i<=n; i++){
            final String word = toWord("Fizz", 3, i) + toWord("Buzz", 5, i);
            if("".equals(word)){
                toReturn.add(String.valueOf(i));
            }else{
                toReturn.add(word);
            }
        }
        return toReturn;
    }

    private static String toWord(final String word, final int divisor, final int value) {
        return value % divisor == 0 ? word : "";
    }
}
