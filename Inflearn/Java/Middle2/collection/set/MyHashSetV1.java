package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {
    
    static final int DEFUALT_INITIAL_CAPACITY = 16;

    LinkedList<Integer>[] buckets;
    
    private int size = 0;
    private int capacity = DEFUALT_INITIAL_CAPACITY;

    public MyHashSetV1() {                      //capacity가 정해져있음
        initBuckets();
    }

    public MyHashSetV1(int capacity) {          //capacity를 내가 정함
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];     //buckets에 capacity길이의 list를 만들어줌
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();    //buckets의 인덱스마다 list를 만들어줌
        }
    }

    public boolean add(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if (bucket.contains(value)) {
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        boolean result = bucket.remove(Integer.valueOf(value)); //그냥 숫자를 넣으면 숫자의 index위치에 있는걸 지움
                                                                //-> 래퍼타입으로 변경해줘야 해당 숫자를 지움
        if (result) {
            size--;     //제거 됐으면 사이즈 줄여줌
            return true;
        } else {
            return false;
        }
    }

    public int getSize() {
        return size;
    }

    private int hashIndex(int value) {
        return value % capacity;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
