package 디자인패턴;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackPredicateTest {
    private Stack stack;

    @Before
    public void createStack(){
        stack = new Stack();
        for(int i=1; i<=10; i++){
            stack.push(i);
        }
    }

    @Test
    public void evenPredicate(){
        // 짝수만 남게 필터링
        final Stack filtered = stack.filter((v)-> (v % 2 == 0));

        assertEquals(Integer.valueOf(10), filtered.pop());
        assertEquals(Integer.valueOf(8), filtered.pop());
        assertEquals(Integer.valueOf(6), filtered.pop());
    }

    @Test
    public void allPredicate(){
        final Stack filtered = stack.filter((v) -> true);

        assertEquals(Integer.valueOf(10), filtered.pop());
        assertEquals(Integer.valueOf(9), filtered.pop());
        assertEquals(Integer.valueOf(8), filtered.pop());
    }
}
