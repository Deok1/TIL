package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "adf";
        student1.age = 12;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "sfd";
        student2.age = 13;
        student2.grade = 8;

        Student[] students = {student1, student2};

        for (int i = 0; i < 2; i++) {
            System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
        }
    }
}
