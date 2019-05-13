package 간단한알고리즘_01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilsTest {

    @Test
    public void reverseTest(){
        final String testStr = "HelloWorld!";
        final String answer = "!dlroWolleH";

        assertEquals(answer, StringUtils.reverse(testStr));
        assertEquals(answer, StringUtils.inPlaceReverse(testStr));
    }
}
