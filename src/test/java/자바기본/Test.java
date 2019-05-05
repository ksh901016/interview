package 자바기본;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
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

    @org.junit.Test
    public void stringCreation(){
        String helloString1 = new String("Hello World!");
        String helloString2 = "Hello World!";

        Assert.assertEquals(helloString1, helloString2);
    }

    @org.junit.Test
    public void stringChanges(){
        final String greeting = "Good Morning, Corn";
        final String substring = greeting.substring(0, 4);

        Assert.assertTrue(substring.equals("Good"));
        Assert.assertFalse(greeting.equals(substring));
        Assert.assertTrue(greeting.equals("Good Morning, Corn"));
    }

    @org.junit.Test
    public void intEquality(){
        // new String을 명시적으로 호출해서 인스턴스가 다른 메모리 위치에 있게 함
        final String str1 = new String("100");
        final String str2 = new String("100");

        Assert.assertFalse(str1 == str2);
        Assert.assertTrue(str1.equals(str2));

        final Integer int1 = Integer.valueOf(str1);
        final Integer int2 = Integer.valueOf(str2);
        Assert.assertTrue(int1 == int2);
    }

    @org.junit.Test
    public void testStringEquality(){
        final String literal = "Hello";
        final String object = new String("Hello");

        Assert.assertTrue(literal.equals(object));
        Assert.assertFalse(literal == object);
    }

    @org.junit.Test
    public void testStringIntern(){
        final String literal = "Hello";
        final String object = new String("Hello");
        final String intern = literal.intern();

        Assert.assertTrue(literal.equals(object));
        Assert.assertFalse(literal == object);
        Assert.assertTrue(literal.equals(intern));
        Assert.assertTrue(literal == intern);
    }

    @org.junit.Test
    public void showLinkedHashmapProperties(){
        final LinkedHashMap<Integer, String> linkedHashMap
                = new LinkedHashMap<>();
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(3, "Three");
        linkedHashMap.put(4, "Four");
        linkedHashMap.put(5, "Five");

        Assert.assertEquals("Five", linkedHashMap.get(5)); // map처럼 동작

        // 삽입 순서를 보장
        final Iterator<Integer> keyIterator = linkedHashMap.keySet().iterator();
        Assert.assertEquals("One", linkedHashMap.get(keyIterator.next()));
        Assert.assertEquals("Two", linkedHashMap.get(keyIterator.next()));
        Assert.assertEquals("Three", linkedHashMap.get(keyIterator.next()));
        Assert.assertEquals("Four", linkedHashMap.get(keyIterator.next()));
        Assert.assertEquals("Five", linkedHashMap.get(keyIterator.next()));
    }
}
