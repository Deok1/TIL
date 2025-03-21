package collection.set.javaset;

import java.util.*;

public class JavaSetMain {

    public static void main(String[] args) {
        run(new HashSet<>());           //무작위 순서
        run(new LinkedHashSet<>());     //입력한 순서
        run(new TreeSet<>());           //데이터의 순서
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();     //순서대로 데이터를 순회할 수 있게 해주는 iterator(뒤에서 다룸)
        while (iterator.hasNext()) {                    //true, false로 값이 나옴
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
