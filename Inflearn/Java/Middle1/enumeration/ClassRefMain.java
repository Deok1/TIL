package enumeration.ex2;

public class ClassRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC = " + ClassGrade.BASIC.getClass());     //getClass는 클래스 정보를 얻어온다.
        System.out.println("class GOLD = " + ClassGrade.GOLD.getClass());       //실행시켜보면 모두 ClassGrade에서
        System.out.println("class DIAMOND = " + ClassGrade.DIAMOND.getClass()); //온걸 확인할 수 있다.

        System.out.println("ref BASIC = " + ClassGrade.BASIC);      //참조값을 불러온다.
        System.out.println("ref GOLD = " + ClassGrade.GOLD);        //객체를 각각 생성했기에
        System.out.println("ref DIAMOND = " + ClassGrade.DIAMOND);  //참조값이 모두 다르다. (타입은 모두 같음)
    }
}
