package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 50);
        System.out.println(studentMap);

        // 학생이 없는 경우에만 추가1
        if (!studentMap.containsKey("studentA")) {
            studentMap.put("studentA", 100);
        }
        System.out.println(studentMap);

        // 학생이 없는 경우에만 추가2 (위 경우를 간단하게 해주는 메서드 : putIfAbsent)
        studentMap.putIfAbsent("studentA", 100);    //studentA가 있기 때문에 실행 안됨
        studentMap.putIfAbsent("studentB", 100);    //studentB가 없기 때문에 실행 됨
        System.out.println(studentMap);
    }
}
