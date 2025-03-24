package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();  //Map은 key와 value 두 가지 값의 타입을 정해줘야 한다.

        //학생의 성적 데이터 추가
        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 80);
        studentMap.put("studentD", 100);
        System.out.println(studentMap);

        //특정 학생의 값 조회
        Integer result = studentMap.get("studentD");
        System.out.println("result = " + result);


        System.out.println("keySet 활용");
        Set<String> keySet = studentMap.keySet();   //key들만 반환하는 메서드, set 구조로 반환됨
        for (String key : keySet) {                 //key의 특징을 살펴보면
            Integer value = studentMap.get(key);    //순서보장X, 중복X -> Set의 특징과 동일
            System.out.println("key=" + key + ", value=" + value);
        }


        System.out.println("values 활용");
        Collection<Integer> values = studentMap.values();   //value들만 반환하는 메서드, collection 구조로 반환됨
        for (Integer value : values) {                      //중복이 발생할 수도 있기 때문에 Set구조 사용X
            System.out.println("value = " + value);         //입력 순서를 보장하지 않기 때문에 List구조 사용X
        }                                                   //따라서 Set,List의 상위 인터페이스 Collection 사용O


        System.out.println("entrySet 활용");
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();    //key와 value를 묶어서 반환하는 메서드, set 구조로 반환됨
        for (Map.Entry<String, Integer> entry : entries) {                  //entry는 key, value를 저장하는 객체라고 보면 된다.
            String key = entry.getKey();                                    //key가 있기에 set구조로 반환됨(중복허용X)
            Integer value = entry.getValue();
            System.out.println("key=" + key + ", value=" + value);
        }
    }
}
