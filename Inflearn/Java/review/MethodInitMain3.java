package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("user1", 15, 90);

        MemberInit member2 = new MemberInit();
        member1.initMember("user2", 16, 80);

        MemberInit[] memberInits = {member1, member2};

        for (MemberInit memberInit : memberInits) {
            System.out.println("이름: " + memberInit.name + ", 나이: " + memberInit.age + ", 성적: " + memberInit.grade);
        }
    }

    public static class MemberInit {
        String name;
        int age;
        int grade;

        void initMember(String name, int age, int grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }
    }
}
