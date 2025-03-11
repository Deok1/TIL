package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);
        // Object object = (Integer)GenericMethod.objMethod(i);
        // Object 타입으로 반환되기에 다운캐스팅을 해줘야하는게 맞음
        // 근데 이게 싫으니 '밑의 방법'으로 하면 된다


        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);   // <- '밑의 방법'
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        System.out.println("타입 추론");
        Integer result2 = GenericMethod.genericMethod(i);   // 타입 추론 : 자바가 알아서 추론함
        Integer integerValue2 = GenericMethod.numberMethod(10);
        Double doubleValue2 = GenericMethod.numberMethod(20.0);
    }
}
