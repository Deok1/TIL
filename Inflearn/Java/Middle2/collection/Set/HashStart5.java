package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //{1, 2, 5, 8, 14, 99, 9}
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {    // buckets의 인덱스마다 list를 생성한다.
            buckets[i] = new LinkedList<>();    // [[], [], [], [], [], [], [], [], [], []]
        }
        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9);
        System.out.println("buckets = " + Arrays.toString(buckets));

        //검색
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("buckets.contains(" + searchValue+ ") = " + contains);


    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);                   //value의 hashIndex를 찾음
        LinkedList<Integer> bucket = buckets[hashIndex];    //buckets들 중 hashIndex위치의 buket을 가져옴  -> 이해는 잘 안되는데 그러려니 해야할듯
        if (!bucket.contains(value)) {                      //value가 중복되는지 체크
            bucket.add(value);                              //bucket에 value를 저장한다.
        }
    }

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
