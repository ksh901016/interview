package 디자인패턴;

import org.junit.Test;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

public class FlyWeightTest {

    @Test
    public void sameInteger(){
        final Integer a = Integer.valueOf(56);
        final Integer b = Integer.valueOf(56);
        assertSame(a, b);

        final Integer c = new Integer(400);
        final Integer d = new Integer(400);
        assertNotSame(c, d); // 값은 같으나, 같은 인스턴스(주소값)이 아니다.
    }
}
