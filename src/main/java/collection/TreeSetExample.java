package collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(90);
        scores.add(50);
        scores.add(60);
        scores.add(70);
        scores.add(80);

        Integer score = null;
        System.out.println("가장 낮은 점수 : " + scores.first());
        System.out.println("가장 높은 점수 : " + scores.last());
        System.out.println("90점 아래 점수 : " + scores.lower(90));
        System.out.println("80점 아래 점수 : " + scores.higher(80));
        System.out.println("90점 이거나 바로 아래 점수 : " + scores.floor(90));
        System.out.println("80점 이거나 바로 위 점수 : " + scores.ceiling(80));

        /**
         * 정렬관련 메소드
         * descendingIterator() : 내림차순으로 정렬된 Iterator를 리턴
         * descendingSet() : 내림차순으로 정렬된 NavigableSet을 반환 (두번 호출하면 오름차순)
         */

        System.out.println();
        NavigableSet<Integer> descendingSet = scores.descendingSet();
        for(Integer s : descendingSet){
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println();
        NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
        for(Integer s : ascendingSet){
            System.out.print(s + " ");
        }
    }
}
