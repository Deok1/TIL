package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "김덕일";
        member1.age = 29;
        member1.grade = 100;

        MemberInit member2 = new MemberInit();
        member2.name = "덕일";
        member2.age = 2;
        member2.grade = 10;

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("이름:" + member.name);
            System.out.println("나이:" + member.age);
            System.out.println("성적:" + member.grade);
        }
    }
}
