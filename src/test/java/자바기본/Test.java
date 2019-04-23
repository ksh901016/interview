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

    @org.junit.Test
    public void staticVariableAccess(){
        Assert.assertEquals(ExampleClass.EXAMPLE_VALUE, 6);

        ExampleClass c1 = new ExampleClass();
        ExampleClass c2 = new ExampleClass();
        c2.EXAMPLE_VALUE = 22; // 가능하지만 추천x
        Assert.assertEquals(ExampleClass.EXAMPLE_VALUE, 22);
        Assert.assertEquals(c2.EXAMPLE_VALUE, 22);
    }

    @org.junit.Test
    public void polymorphicList(){
        List<Rectangle> rectangles = new ArrayList<>(3);
        rectangles.add(new Rectangle(5, 1));
        rectangles.add(new Rectangle(2, 10));
        rectangles.add(new Square(9));

        Assert.assertEquals(rectangles.get(0).area(), 5);
        Assert.assertEquals(rectangles.get(1).area(), 20);
        Assert.assertEquals(rectangles.get(2).area(), 81);
    }
}
