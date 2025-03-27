package collection.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {

    public static void main(String[] args) {
        //불변 리스트 생성
        List<Integer> list = List.of(1, 2, 3);

        //가변 리스트로 변경
        ArrayList<Integer> mutableList = new ArrayList<>(list); //list의 자리는 Collection이 들어올 수 있는 자리임.
                                                                //따라서 Collection의 자식인 List가 들어오는건 가능.
        mutableList.add(4);     //list는 불변이지만 ArrayList인 mutableList는 가변이므로 데이터 변경 가능
        System.out.println("mutableList = " + mutableList);
        System.out.println("mutableList.getClass() = " + mutableList.getClass());   //ArrayList클래스

        //다시 불변리스트로 변경
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        System.out.println("unmodifiableList = " + unmodifiableList);
        System.out.println("unmodifiableList.getClass() = " + unmodifiableList.getClass()); //Unmodifialbe 수정불가능한 클래스

        //예외 발생 : java.lang.UnsupportedOperationException
        //unmodifiableList.add(5);

    }
}
