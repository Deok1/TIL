package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1,"김덕일", 29, 100);
        MemberInit member2 = new MemberInit();
        initMember(member2,"덕일", 9, 10);

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("이름:" + member.name);
            System.out.println("나이:" + member.age);
            System.out.println("성적:" + member.grade);
        }
    }

    static void initMember(MemberInit memberInit, String name, int age, int grade) {
        memberInit.name = name;
        memberInit.age = age;
        memberInit.grade = grade;
    }
}
