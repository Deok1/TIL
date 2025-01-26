package array;

public class ArrayDi2 {
    public static void main(String[] args) {
        // 2*3 2차원 배열을 만든다.
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };    //2행, 3열


        for (int row = 0; row < arr.length; row++) {    // 행의 개수를 찾음
            for (int column = 0; column < arr[row].length; column++) {      //행안에 배열 개수를 찾음
                System.out.print(arr[row][column] + " ");  //0열 출력
            }
            System.out.println();
        }
    }
}
