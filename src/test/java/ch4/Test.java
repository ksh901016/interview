package ch4;

import org.junit.Assert;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

    @org.junit.Test
    public void sortInts(){
        final int[] numbers = {-3, -5, 1, 7, 4, -2};
        final int[] expected = {-5, -3, -2, 1, 4, 7};

        Arrays.sort(numbers);
        Assert.assertArrayEquals(expected, numbers);
    }

    @org.junit.Test
    public void sortObjects(){
        final String[] strings = {"z", "x", "y", "abc", "zzz", "zazzy"};
        final String[] expected = {"abc", "x", "y", "z", "zazzy", "zzz"};

        Arrays.sort(strings);
        Assert.assertArrayEquals(expected, strings);
    }

    public class ReverserNumericalOrder implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return (o1 - o2) * -1;
        }
    }

    @org.junit.Test
    public void customSorting(){
        final List<Integer> numbers = Arrays.asList(4, 7, 1, 6, 3, 5, 4);
        final List<Integer> expected = Arrays.asList(7, 6, 5, 4, 4, 3, 1);

        Collections.sort(numbers, new ReverserNumericalOrder());
        Assert.assertEquals(expected, numbers);
    }
}
