package enumeration.ref1;

public class DiscountService {

    public int discount(ClassGrade grade , int price) {
        return price * grade.getDiscountPercent() / 100;

        /*
        int discountPercent = grade.getDiscountPercent();
        return price * discountPercent / 100;
        */
        // Ctrl+Alt+N 하면 변수가 합쳐짐
    }
}
