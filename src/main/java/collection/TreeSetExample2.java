package collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("description");
        treeSet.add("candy");
        treeSet.add("ever");
        treeSet.add("zoo");
        treeSet.add("base");
        treeSet.add("cherry");

        System.out.println("c~f 사이의 단어 검색");
        NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
        for(String word: rangeSet){
            System.out.print(word + " ");
        }
    }
}
