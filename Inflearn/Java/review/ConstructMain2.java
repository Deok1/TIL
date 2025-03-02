package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);
        MemberConstruct member3 = new MemberConstruct("user3", 17);


        MemberConstruct[] members = {member1, member2, member3};
        for (MemberConstruct memberInit : members) {
            System.out.println("이름: " + memberInit.name + ", 나이: " + memberInit.age + ", 성적: " + memberInit.grade);
        }
    }

    private static class MemberConstruct {
        private String name;
        private int age;
        private int grade;

        public MemberConstruct(String name, int age, int grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        public MemberConstruct(String name, int age) {
            this(name, age, 50);
        }
    }
}
