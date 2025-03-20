package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {   //equals와 hashCode를 구현하지 않았을 때 문제

    public static void main(String[] args) {
        //중복 등록(되면 안됨..)
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");
        System.out.println("m1.hashCode() = " + m1.hashCode()); //hashCode를 구현하지 않았기 때문에
        System.out.println("m2.hashCode() = " + m2.hashCode()); //다른 참조값이 나온다.
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); //m1과 m2는 다르다는 false가 나옴

        set.add(m1);
        set.add(m2);
        System.out.println(set);    //중복 등록 되어버림

        //검색 실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
