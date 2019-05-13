package 간단한알고리즘_01;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static int fibN(int n){
        if(n < 0){
            throw new IllegalArgumentException("n must be bigger than zero");
        }

        if(n == 1) return 1;
        if(n == 0) return 0;

        return fibN(n-1) + fibN(n-2);
    }

    private static Map<Integer, Integer> fibCache = new HashMap<>();

    public static int cacheFibN(int n){
        if(n < 0){
            throw new IllegalArgumentException("n must be bigger than zero");
        }
        fibCache.put(0, 0);
        fibCache.put(1, 1);
        return recursiveCachedFibN(n);
    }

    private static int recursiveCachedFibN(int n){
        if(fibCache.containsKey(n)){
            return fibCache.get(n);
        }

        int value = recursiveCachedFibN(n-1) + recursiveCachedFibN(n-2);
        fibCache.put(n, value);

        return value;
    }
}
