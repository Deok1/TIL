package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {

        // 모든 ENUM 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));  // 배열을 출력하기 위해서는 Arrays.toString을 붙여야함.
        for (Grade value : values) {
            //각 인자의 이름, 순서를 반환
            System.out.println("name=" + value.name() + ", ordinal=" + value.ordinal());
        }

        //Stirng -> ENUM 변환, 잘못된 문자면 IllegalArgumentException 발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gole = " + gold);   //name과 동일하게 toString()도 이름을 출력하지만 오버라이딩가능
    }
}
