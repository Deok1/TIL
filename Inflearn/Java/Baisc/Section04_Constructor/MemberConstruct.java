package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct() {
        this("", 0, 0);
    }
    MemberConstruct(String name, int age) {
        this(name, age, 0);
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name:" + name + ", age:" + age + ", grade:" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
