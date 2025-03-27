package collection.compare;

import java.util.TreeSet;

public class SortMain5 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        TreeSet<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(myUser1);
        treeSet1.add(myUser2);
        treeSet1.add(myUser3);
        System.out.println("Comparable 기본 정렬");
        System.out.println(treeSet1);   //이미 add하는 순간부터 정렬이 다 되어있기 때문에 출력만 하면 됨

        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());   //tree구조에 새로운 정렬기준을 주고 싶으면 객체생성 시점에 정렬기준을 넣어줘야함
        treeSet2.add(myUser1);
        treeSet2.add(myUser2);
        treeSet2.add(myUser3);
        System.out.println("IdComparator 정렬");
        System.out.println(treeSet2);   //문자를 기준으로 정렬됨
    }
}
