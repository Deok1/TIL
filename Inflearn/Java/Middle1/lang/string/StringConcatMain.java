package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello"; //x001 : new String("hello")가 원래 모습임
        String b = " java"; //x002      자바에서 최적화 해줘서 생략가능

        String result1 = a.concat(b);
        String result2 = a + b; //x001 + x002 -> 참조값은 덧셈이 안됨
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
