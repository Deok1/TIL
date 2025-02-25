package time;

import java.time.LocalDate;

public class LocalDataMain {

    public static void main(String[] args) {
        LocalDate nowData = LocalDate.now();    // 현재 날짜를 알려줌
        System.out.println("오늘 날짜 = " + nowData);

        LocalDate ofData = LocalDate.of(2013, 11, 21);  //지정 날짜를 알려줌
        System.out.println("지정 날짜 = " + ofData);

        //계산(불변)
        //날짜 클래스는 불변이다. 변경이 발생하는 경우 새로운 객체를 생성해서 반환값을 받아야 한다.
        ofData.plusDays(10);    // 지정날짜(불변)에 10일을 더하는 코드
        System.out.println("지정날짜 + 10d = " + ofData);   //변화 없음

        ofData = ofData.plusDays(10);    // 반환값을 받아야 함.
        System.out.println("지정날짜 + 10d = " + ofData);
    }
}
