package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest2 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        Map<String, Integer> map = new HashMap<>();

        String[] words = text.split(" ");

        for (String word : words) {
/*
            Integer count = map.get(words); //map에 단어가 있는지 확인
            if (count == null) {            //없으면, 있으면
                count = 0;                  //count=0으로 세팅, 패스
            }
            count++;                        //count=1, count=2
*/
            //위 과정을 함축해놓은 메서드
            map.put(word, map.getOrDefault(word, 0) +1);
            //word를 집어넣고, 없으면 0을 반환하고 1을 플러스해서 넣기
            //word를 집어넣고, 있으면 있는 값을 반환하고 1을 플러스해서 넣기
        }
        System.out.println(map);
    }
}
