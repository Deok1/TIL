package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;     //참조값 대입을 막을 수 있는 방법이 없다.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //b.setValue("부산");   //b의 값을 부산으로 변경해야함, 허나 안되는걸 알고
        b = new ImmutableAddress("부산"); //새로운 객체를 생성함
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
