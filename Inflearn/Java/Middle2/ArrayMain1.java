package collection.array;

import java.util.Arrays;

public class ArrayMain1 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        // index 입력 : O(1) -> 빅O 표기법
        // 이 자료 구조에서 데이터를 몇번의 계산만으로 찾는가를 나타냄
        System.out.println("==index 입력: O(1)==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));   // 그냥 arr라고 하면 참조값이 나옴 -> Arrays.toString을 붙이면 배열이 나옴

        // index 변경: O(1)
        System.out.println("==index 변경: 0(1)==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        // index 조회: O(1)
        // index로 조회하면 자바가 한번에 바로 찾음
        System.out.println("==index 조회: 0(1)==");
        System.out.println("arr[2] = " + arr[2]);

        // 검색: O(n)
        System.out.println("==배열 검색: O(n)==");
        System.out.println(Arrays.toString(arr));   // 데이터 확인
        int value = 10; // 찾을 값
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]: " + arr[i]);    //검색
            if (arr[i] == value) {  // 찾을 값 출력
                System.out.println(value + " 찾음");
                break;  // 종료
            }
        }
    }
}
