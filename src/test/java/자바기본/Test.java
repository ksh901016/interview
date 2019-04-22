package 자바기본;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class Test {

    @org.junit.Test
    public void objectMemoryAssignment(){
        List<String> list1 = new ArrayList<>(20);

        list1.add("entry in list1");
        Assert.assertTrue(list1.size() == 1);

        List list2 = list1;
        list2.add("entry in list2");
        Assert.assertTrue(list1.size() == 2);
    }

    @org.junit.Test
    public void finalReferenceChanges(){
        final int i = 45;
        // i = 46; 컴파일 에러가 남

        final List<String> list = new ArrayList<>();
        Assert.assertEquals(0, list.size());

        list.add("add");
        Assert.assertEquals(1, list.size());

        list.clear();
        Assert.assertEquals(0, list.size());
    }
}
