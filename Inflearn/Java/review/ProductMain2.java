package ref.ex;

public class ProductMain2 {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];
        productOrders[0] = creatOrder("두부", 1000, 2);
        productOrders[1] = creatOrder("김치", 2000, 3);
        productOrders[2] = creatOrder("깍두기", 500, 5);

        int totalPrice = getTotalAmount(productOrders);

        printOrders(productOrders);
        getTotalAmount(productOrders);

        System.out.println("총 결제 금액:" + totalPrice);

    }

    public static ProductOrder creatOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    public static int getTotalAmount(ProductOrder[] orders) {
        int totalPrice = 0;
        for (ProductOrder p : orders) {
            totalPrice += p.price*p.quantity;
        }
        return totalPrice;
    }

    static void printOrders(ProductOrder[] productOrders) {
        for (ProductOrder p : productOrders) {
            System.out.println("상품명:" + p.productName + ", 가격:" + p.price + ", 수량:" + p.quantity);
        }
    }



}
