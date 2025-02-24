package enumeration.ex3;

public class EnumRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());  //타입은 모두 Grade인 것을 확인 가능
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("ref BASIC = " + Grade.BASIC);   //enum이 toString()을 오버라이딩 해놓았음
        System.out.println("ref GOLD = " + Grade.GOLD);
        System.out.println("ref DIAMOND = " + Grade.DIAMOND);

        System.out.println("ref BASIC = " + refValue(Grade.BASIC));   //참조값을 보기 위해 메서드를 만듦
        System.out.println("ref GOLD = " + refValue(Grade.GOLD));       //참조값은 모두 다름을 확인
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));
    }

    private static String refValue(Object grade) {  //Object는 모든 객체의 부모
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
