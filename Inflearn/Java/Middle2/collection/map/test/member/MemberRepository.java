package collection.map.test.member;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    private Map<String, Member> memberMap = new HashMap<>();

    public void save(Member member1) {
        memberMap.put(member1.getId(), member1);
    }

    public void remove(String id) {
        memberMap.remove(id);
    }

    public Member findById(String id) {
        return memberMap.get(id);
    }

    public Member findByName(String name) {
        for (Member member : memberMap.values()) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }
}
