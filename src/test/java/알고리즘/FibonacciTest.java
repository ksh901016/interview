package 알고리즘;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void fibonacciList(){
        assertEquals(0, Fibonacci.fibonacci(0).size());
        assertEquals(Arrays.asList(0), Fibonacci.fibonacci(1));
        assertEquals(Arrays.asList(0, 1), Fibonacci.fibonacci(2));
        assertEquals(Arrays.asList(0, 1, 1), Fibonacci.fibonacci(3));
        assertEquals(Arrays.asList(0, 1, 1, 2), Fibonacci.fibonacci(4));
        assertEquals(Arrays.asList(0, 1, 1, 2, 3), Fibonacci.fibonacci(5));
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5), Fibonacci.fibonacci(6));
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8), Fibonacci.fibonacci(7));
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13), Fibonacci.fibonacci(8));
    }

    @Test(expected = IllegalArgumentException.class)
    public void fibonacciException(){
        Fibonacci.fibonacci(-1);
    }
}
