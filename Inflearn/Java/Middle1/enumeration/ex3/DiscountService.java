package enumeration.ex3;

public class DiscountService {

    public int discount(Grade grade , int price) {
        int discountPercent = 0;

        if (grade == grade.BASIC) {
            discountPercent = 10;
        } else if (grade == grade.GOLD) {
            discountPercent = 20;
        } else if (grade == grade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인x");
        }

        // 10000원 * (20 / 100) -> 2000원
        return price * discountPercent / 100;
    }
}
