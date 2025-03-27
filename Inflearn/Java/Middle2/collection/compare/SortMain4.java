package collection.compare;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortMain4 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        List<MyUser> list = new LinkedList<>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);
        System.out.println("기본 데이터");
        System.out.println(list);

        System.out.println("Comparable 기본 정렬");
        list.sort(null);        //Comparator를 안쓸꺼면 null을 꼭 써야함
        //Collections.sort(list);   //list.sort가 나중에 나온거라 더 좋음
        System.out.println(list);

        System.out.println("IdComparator 정렬");
        list.sort(new IdComparator());    //문자를 기준으로 오름차순 정렬
        //Collections.sort(list, new IdComparator());
        System.out.println(list);
    }
}
