package collection.compare;

import java.util.Arrays;

public class SortMain3 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("id1", 30);
        MyUser myUser2 = new MyUser("id2", 20);
        MyUser myUser3 = new MyUser("id3", 10);

        MyUser[] array = {myUser1, myUser2, myUser3};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(array));     //입력한 순서대로 출력

        System.out.println("Comparator 기본 정렬");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));     //age를 기준으로 오름차순으로 오버라이딩(재정의)한 순서대로 출력

        //추가
        System.out.println("IdComparator 정렬");
        Arrays.sort(array, new IdComparator());         //array와 list의 입력방식이 다름, 조심
        System.out.println(Arrays.toString(array));

        System.out.println("IdComparator().reversed() 정렬");
        Arrays.sort(array, new IdComparator().reversed());
        System.out.println(Arrays.toString(array));
    }
}
