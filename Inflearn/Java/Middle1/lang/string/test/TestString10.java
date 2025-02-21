package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] splitFruits = fruits.split(",");
        for (String part : splitFruits) {
            System.out.println(part);
        }

        String JoinedString = String.join("->", splitFruits);
        System.out.println("JoinedString = " + JoinedString);
    }
}
