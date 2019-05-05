package 자료구조;

import org.junit.Assert;

import java.util.LinkedList;
import java.util.Queue;

public class Test {

    @org.junit.Test
    public void arrayCopy(){
        int[] integers = {0, 1, 2, 3, 4};

        int[] newIntegersArray = new int[integers.length + 1];
        System.arraycopy(integers, 0, newIntegersArray, 0, integers.length);
        integers = newIntegersArray;
        integers[5] = 5;
        Assert.assertEquals(5, integers[5]);
    }

    @org.junit.Test
    public void queueInsertion(){
        final Queue<String> queue = new LinkedList<String>();
        queue.add("first");
        queue.add("second");
        queue.add("third");

        Assert.assertEquals("first", queue.remove());
        Assert.assertEquals("second", queue.remove());
        Assert.assertEquals("third", queue.peek());
        Assert.assertEquals("third", queue.remove());
    }

    @org.junit.Test
    public void createTree(){
        final SimpleTree<Integer> tree = new SimpleTree<>(7, null, null);
        tree.insert(3);
        tree.insert(9);
        tree.insert(10);
        Assert.assertTrue(tree.search(10));
        Assert.assertEquals(Integer.valueOf(10), tree.getRight().getRight().getValue());
    }
}
