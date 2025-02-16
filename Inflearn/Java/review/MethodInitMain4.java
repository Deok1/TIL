package construct;

public class MethodInitMain4 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("김덕일", 29, 100);
        MemberConstruct member2 = new MemberConstruct("김", 20, 20);
        MemberConstruct member3 = new MemberConstruct();

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름:" + member.name);
            System.out.println("나이:" + member.age);
            System.out.println("성적:" + member.grade);
        }
    }
}
