package condition;

public class If6 {

    public static void main(String[] args) {
        int price = 20000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount += 1000;
            System.out.println("10살 이하, 1000원 할인");
        }

        price -= discount;
        System.out.println("총 할인 금액: " + discount);
        System.out.println("구매가격: " + price);
    }
}
