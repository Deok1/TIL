package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        System.out.println(studentMap);

        studentMap.put("studentA", 100);    //같은 키에 저장시 기존 값 교체, 90 -> 100
        System.out.println(studentMap);

        boolean containKey = studentMap.containsKey("studentA");
        System.out.println("containKey = " + containKey);

        //특정 학생의 값 삭제
        studentMap.remove("studentA");  //value까지 같이 제거됨, entry가 통으로 제거
        System.out.println(studentMap);
    }
}
