package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        List<Integer> student = new ArrayList<>();
        student.add(90);
        student.add(80);
        student.add(70);
        student.add(60);
        student.add(50);

        int total = 0;
        for (int i = 0; i < student.size(); i++) {
            total += student.get(i);
        }

        double average = (double) total / student.size();
        System.out.println("점수 총합 = " + total);
        System.out.println("점수 평균 = " + average);
    }
}
