package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.productName = "프로틴";
        order1.price = 50000;
        order1.quantity = 3;
        orders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "닭가슴살";
        order2.price = 1300;
        order2.quantity = 30;
        orders[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "계란";
        order3.price = 500;
        order3.quantity = 30;
        orders[2] = order3;

        int totalAmount = 0;
        for (ProductOrder O : orders) {
            System.out.print("상품명:" + O.productName);
            System.out.print(", 가격:" + O.price);
            System.out.println(", 수량:" + O.quantity);
            totalAmount += (O.price * O.quantity);
        }
        System.out.println("총 결재 금액: " + totalAmount);
    }
}
