package extends1.ex;

public class Item {

    private String name;
    private int price;

    public Item(String nema, int price) {
        this.name = nema;
        this.price = price;
    }

    public void print() {
        System.out.println("이름:" + name + ", 가격:" + price);
    }

    public int getPrice() {
        return price;
    }
}
