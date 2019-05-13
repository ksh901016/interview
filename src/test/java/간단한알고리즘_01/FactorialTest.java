package 간단한알고리즘_01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void recursiveFactorial(){
        assertEquals(Factorial.recursiveFactorialN(5), 120);
        assertEquals(Factorial.recursiveFactorialN(10), 3628800);
        assertEquals(Factorial.recursiveFactorialN(15), 1307674368000L);
    }

    @Test
    public void iterFactorial(){
        assertEquals(Factorial.iterFactorialN(5), 120);
        assertEquals(Factorial.iterFactorialN(10), 3628800);
        assertEquals(Factorial.iterFactorialN(15), 1307674368000L);
    }
}
