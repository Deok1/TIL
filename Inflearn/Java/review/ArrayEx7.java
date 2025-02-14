package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생수를 입력하세요:");
        int num1 = scanner.nextInt();
        int[][] numbers = new int[num1][3];

        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + "점수:");
                numbers[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < num1; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += numbers[i][j];
            }
            System.out.println((i+1)+"번 학생의 총점:"+ sum +", 평균:" + (double)sum/numbers.length);
        }
    }
}
