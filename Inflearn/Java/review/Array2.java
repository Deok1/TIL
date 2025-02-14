package array;

public class Array2 {
    public static void main(String[] args) {
        int[] student = new int[]{90, 80, 70, 60, 50};

        for (int i = 0; i < student.length; i++) {
            System.out.println("학생"+i+" 점수: "+ student[i]);
        }
    }
}
