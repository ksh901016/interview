package 알고리즘;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {

    public static List<Integer> fibonacci(int n){
        if(n < 0){
            throw new IllegalArgumentException("n must be bigger than zero");
        }

        if(n == 0){
            return new ArrayList<>();
        }

        if(n == 1){
            return Arrays.asList(0);
        }

        if(n == 2){
            return Arrays.asList(0, 1);
        }

        final List<Integer> seq = new ArrayList<>(n);
        seq.add(0);
        n--;
        seq.add(1);
        n--;

        while(n > 0){
            int first  = seq.get(seq.size()-2);
            int second = seq.get(seq.size()-1);
            seq.add(first + second);
            n--;
        }

        return seq;
    }
}
