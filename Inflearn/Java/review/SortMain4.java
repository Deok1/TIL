package collection.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortMain4 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("id1", 30);
        MyUser myUser2 = new MyUser("id2", 20);
        MyUser myUser3 = new MyUser("id3", 10);

        List<MyUser> list = new ArrayList<>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);
        System.out.println("기본 데이터 출력");    //입력 순서대로 출력
        System.out.println(list);

        System.out.println("Comparable 기본 출력");
        list.sort(null);                     //list의 경우는 null을 입력해야 한다.
        System.out.println(list);               //자연적인 순서로 비교

        System.out.println("Comparator 정렬");
        list.sort(new IdComparator());          //array와 list의 입력방식이 다름, 조심
        System.out.println(list);
    }
}
