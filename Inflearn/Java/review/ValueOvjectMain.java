package oop1;

public class ValueOvjectMain {
    public static void main(String[] args) {
        ValueObject value = new ValueObject();
        value.add();
        value.add();
        value.add();
        System.out.println("최종 숫자:" + value.value);
    }
}
