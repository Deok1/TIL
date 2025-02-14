package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {

        int[] students = {90, 80, 70, 60, 50};
        int count = 0;
        int total = 0;
        double average = 0;

        for (int student : students) {
            total += student;
            count++;
        }

        average = (double) total/count;


        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
