package lang.wrapper.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate() {   //생성된 번호 6개를 배열로 반환하는 메서드
        lottoNumbers = new int[6];  //실행하는 순간 배열 6개 생성
        count = 0;  //실행할때마다 초기화

        while (count < 6) {
            // 1~45 사이의 숫자 생성
            int number = random.nextInt(45) + 1;
            // 중복되지 않은 경우에만 배열에 추가
            if (isUnique(number)) {
                lottoNumbers[count] = number;
                count++;
            }
        }
        return lottoNumbers;
    }

    // 이미 생성된 번호와 중복되는지 검사
    private boolean isUnique(int number) {  //중복을 체크하는 메서드
        for (int i = 0; i < count; i++) {
            if (lottoNumbers[i] == number) {
                return false;
            }
        }
        return true;
    }
}
