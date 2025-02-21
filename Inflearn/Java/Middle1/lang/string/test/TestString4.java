package lang.string.test;

public class TestString4 {

    public static void main(String[] args) {
        String str = "hello.txt";

        String filename = str.substring(0, 5);
        String extnName = str.substring(5, 9);

        System.out.println("filename = " + filename);
        System.out.println("extnName = " + extnName);
    }
}
