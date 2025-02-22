package lang.wrapper;

public class MyIntegerNullMain1 {

    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1), new MyInteger(2)};
        MyInteger i1 = findValue(intArr, -1);
        MyInteger i2 = findValue(intArr, 0);
        MyInteger i3 = findValue(intArr, 1);
        MyInteger i4 = findValue(intArr, 100);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        System.out.println("i4 = " + i4);
    }

    public static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger value : intArr) {
            if (value.getValue() == target) {
                return value;
            }
        }
        return null;
    }
}
