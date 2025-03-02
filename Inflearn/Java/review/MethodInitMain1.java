package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 15;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "user2";
        member2.age = 16;
        member2.grade = 80;

        MemberInit[] memberInits = {member1, member2};

        for (MemberInit memberInit : memberInits) {
            System.out.println("이름: " + memberInit.name + ", 나이: " + memberInit.age + ", 성적: " + memberInit.grade);
        }
    }

    public static class MemberInit {
        String name;
        int age;
        int grade;
    }
}
