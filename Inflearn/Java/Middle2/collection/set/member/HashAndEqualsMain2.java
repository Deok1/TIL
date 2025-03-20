package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {   //equals를 구현하지 않았을 때 문제

    public static void main(String[] args) {
        //중복 등록(되면 안됨..)
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A");    //m1, m2의 instance주소는 다름
        MemberOnlyHash m2 = new MemberOnlyHash("A");
        System.out.println("m1.hashCode() = " + m1.hashCode()); //hashCode를 구현함 -> 같은 hashCode가 나옴
        System.out.println("m2.hashCode() = " + m2.hashCode()); //hashCode와 instance(참조값)은 다름
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); //equals는 아직 구현 안함 -> false가 나옴

        System.out.println("System.ref(m1) = " + System.identityHashCode(m1)); //m1의 참조값을 출력하는 코드
        System.out.println("System.ref(m2) = " + System.identityHashCode(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);    //equals가 overriding(재정의) 되지 않아서 중복등록 됨
                                    //Object의 equals를 사용 -> 인스턴스를 비교하게 됨
        //검색 실패
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);   //contains에서 loop를 돌며 equals로 비교하는데 오버라이딩이 안되어 있으므로
        System.out.println("contains = " + contains);   //Object의 equals를 사용하게 된다. 따라서 인스턴스의 참조값을 비교하게 되고, 검색에 실패한다.
    }
}
