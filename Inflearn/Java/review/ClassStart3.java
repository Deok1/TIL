package pratice;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentName = "학생1";
        student1.studentAge = 15;
        student1.studentGrade = 90;

        Student student2 = new Student();
        student2.studentName = "학생2";
        student2.studentAge = 16;
        student2.studentGrade = 80;

        System.out.println("이름: " + student1.studentName + " 나이: " + student1.studentAge + " 성적: " + student1.studentGrade);
        System.out.println("이름: " + student2.studentName + " 나이: " + student2.studentAge + " 성적: " + student2.studentGrade);
    }

    public static class Student {
        String studentName;
        int studentAge;
        int studentGrade;
    }
}
