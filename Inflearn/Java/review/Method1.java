package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = initStudent("김덕일", 29, 100);

        Student student2 = initStudent("김", 30, 90);

        Student[] students = {student1, student2};

        printStudent(students);

    }

    static Student initStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    static void printStudent(Student[] students) {
        for (int i = 0; i < 2; i++) {
            System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
        }
    }
}
