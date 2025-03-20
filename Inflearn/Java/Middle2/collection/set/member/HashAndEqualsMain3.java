package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {   //equals와 hashCode를 모두 구현함

    public static void main(String[] args) {
        //중복 등록 안됨
        MyHashSetV2 set = new MyHashSetV2(10);
        Member m1 = new Member("A");
        Member m2 = new Member("A");
        System.out.println("m1.hashCode() = " + m1.hashCode()); //hashCode를 구현함 -> 같은 hashCode가 나옴
        System.out.println("m2.hashCode() = " + m2.hashCode()); //hashCode와 instance(참조값)은 다름
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); //equals를 구현함 -> true 나옴

        System.out.println("System.ref(m1) = " + System.identityHashCode(m1)); //m1의 참조값을 출력하는 코드
        System.out.println("System.ref(m2) = " + System.identityHashCode(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);    //equals가 overriding(재정의) 됨 -> 중복등록 암됨
                                    //Member의 equals를 사용 -> hashCode를 비교하게 됨
        //검색 성공
        Member searchValue = new Member("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);   //contains에서 loop를 돌며 Member의 equals로 비교함
        System.out.println("contains = " + contains);   //hashCode를 비교하게 되고 검색에 성공함
    }
}
