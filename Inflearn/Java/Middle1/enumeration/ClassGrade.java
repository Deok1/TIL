package enumeration.ref1;

public class ClassGrade {

    // 회원 등급 클래스가 할인율(discountPercent)을 직접 가지고 관리함
    // 상수를 정의하는 시점에 할인율이 결정됨
    public static final ClassGrade BASIC = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    private final int discountPercent;

    public ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
