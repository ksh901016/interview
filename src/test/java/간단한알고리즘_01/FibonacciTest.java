package 간단한알고리즘_01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class FibonacciTest {

    @Test
    public void largeFib(){
        final long nonCachedStart = System.nanoTime();
        assertEquals(1134903170, Fibonacci.fibN(45));
        final long nonCachedFinish = System.nanoTime();
        assertEquals(1134903170, Fibonacci.cacheFibN(45));
        final long cachedFinish = System.nanoTime();

        System.out.printf("Non cached time : %d nanoseconds\n", nonCachedFinish - nonCachedStart);
        System.out.printf("cached time :  %d nanoseconds\n", cachedFinish - nonCachedFinish);
    }
}

