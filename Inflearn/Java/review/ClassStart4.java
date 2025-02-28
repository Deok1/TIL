package pratice;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentName = "학생1";
        student1.studentAge = 15;
        student1.studentGrade = 90;

        Student student2 = new Student();
        student2.studentName = "학생2";
        student2.studentAge = 16;
        student2.studentGrade = 80;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름: " + students[0].studentName + " 나이: " + students[0].studentAge + " 성적: " + students[0].studentGrade);
        System.out.println("이름: " + students[1].studentName + " 나이: " + students[1].studentAge + " 성적: " + students[1].studentGrade);
    }

    public static class Student {
        String studentName;
        int studentAge;
        int studentGrade;
    }
}
