package lang.wrapper.test;

public class WrapperTest4 {

    public static void main(String[] args) {
        String str = "100";

        Integer interger1 = Integer.parseInt(str);
        System.out.println("interger1 = " + interger1);

        int intValue = interger1.intValue();
        System.out.println("intValue = " + intValue);

        Integer integer2 = Integer.valueOf(intValue);
        System.out.println("integer2 = " + integer2);
    }
}
