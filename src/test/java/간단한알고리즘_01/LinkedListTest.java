package 간단한알고리즘_01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    @Test
    public void reverseLinkedList(){
        final MyLinkedList<String> three = new MyLinkedList<>("3", null);
        final MyLinkedList<String> two = new MyLinkedList<>("2", three);
        final MyLinkedList<String> one = new MyLinkedList<>("1", two);

        final MyLinkedList<String> reversed = MyLinkedList.reverse2(one);
        assertEquals("3", reversed.getElement());
        assertEquals("2", reversed.getNext().getElement());
        assertEquals("1", reversed.getNext().getNext().getElement());
    }
}
