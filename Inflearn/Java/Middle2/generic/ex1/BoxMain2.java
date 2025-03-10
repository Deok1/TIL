package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); //다운캐스팅 Object -> Integer
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        Object object = stringBox.get();
        String str = (String) object;   //다운캐스팅 Object -> String
        System.out.println("str = " + str);

        //잘못된 타입의 인수 전달시
        integerBox.set("문자100");    //Object 타입이다 보니 숫자, 문자 모두 입력 가능 - 실수
        Integer result = (Integer) integerBox.get();    // String -> Integer 캐스팅 예외
        // String을 Integer로 캐스팅 하려니 오류가 터짐
        System.out.println("result = " + result);
    }
}
