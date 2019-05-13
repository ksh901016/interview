package 간단한알고리즘_01;

public class Factorial {

    public static long recursiveFactorialN(int n){
        if(n < 0){
            throw new IllegalArgumentException("n must be bigger than zero");
        }

        if(n == 1) return 1;

        return n * recursiveFactorialN(n-1);
    }

    public static long iterFactorialN(int n){
        if(n < 0){
            throw new IllegalArgumentException("n must be bigger than zero");
        }

        long toReturn = 1;
        for(int i=1; i<=n; i++){
            toReturn *= i;
        }

        return toReturn;
    }
}
