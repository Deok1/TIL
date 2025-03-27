package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {

    public static void main(String[] args) {
        Integer[] array = {3, 2, 1};
        System.out.println(Arrays.toString(array));
        System.out.println("Comparator 비교");
        Arrays.sort(array, new AscComparator());
        System.out.println("AscComparator: " + Arrays.toString(array));     //오름차순으로 결과 나옴

        Arrays.sort(array, new DescComparator());
        System.out.println("DescComparator: " + Arrays.toString(array));    //내림차순으로 결과 나옴

        Arrays.sort(array, new AscComparator().reversed());     //DescComparator과 같음
        System.out.println("AscComparator.reversed: " + Arrays.toString(array));
    }

    static class AscComparator implements Comparator<Integer> {     //오름차순으로 변경해주는 메서드
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1=" + o1 + " o2=" + o2);
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);   //반환값이 -1이면 o1이 더 작구나 하고 알게됨
        }
    }

    static class DescComparator implements Comparator<Integer> {     //내림차순으로 변경해주는 메서드
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1=" + o1 + " o2=" + o2);
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1) * -1;   //-1을 곱함으로써 결과값이 반대로 나옴
        }
    }
}
