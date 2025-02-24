package enumeration.ex2;

public class ClassGradeEx2_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
/*
        ClassGrade newClassGrade = new ClassGrade();    //생성자 private로 막아야 함
        //완전히 새로운 객체 생성, discount의 if문 안의 객체와는 겹치지 않는다.
        int result = discountService.discount(newClassGrade, price);
        System.out.println("newClassGrade 등급의 할인 금액: " + result);
*/
    }
}
