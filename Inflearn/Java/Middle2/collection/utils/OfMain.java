package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {

    public static void main(String[] args) {
        //편리한 불변 컬렉션 생성, 데이터 추가나 변경이 불가능하다는 뜻
        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "one", 2, "two");

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);
        System.out.println("list.getClass() = " + list.getClass()); //불변클래스가 넘어옴

        //java.lang.UnsupportedOperationException 예외 발생
        //list.add(4);

    }
}
