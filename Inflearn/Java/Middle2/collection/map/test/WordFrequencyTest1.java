package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        Map<String, Integer> map = new HashMap<>();

        String[] words = text.split(" ");

        for (String word : words) {
            Integer count = map.get(words); //map에 단어가 있는지 확인
            if (count == null) {            //없으면, 있으면
                count = 0;                  //count=0으로 세팅, 패스
            }
            count++;                        //count=1, count=2
            map.put(word, count);           //값과 count을 넣어줌
        }
        System.out.println(map);
    }
}
