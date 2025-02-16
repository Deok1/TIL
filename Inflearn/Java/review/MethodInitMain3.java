package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("김덕일", 29, 100);
        MemberInit member2 = new MemberInit();
        member2.initMember("김", 20, 20);

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("이름:" + member.name);
            System.out.println("나이:" + member.age);
            System.out.println("성적:" + member.grade);
        }
    }
}
