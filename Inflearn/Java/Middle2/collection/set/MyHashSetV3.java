package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E> {

    static final int DEFUALT_INITIAL_CAPACITY = 16;

    private LinkedList<E>[] buckets;       //모든 타입을 받을 수 있는 list생성

    private int size = 0;
    private int capacity = DEFUALT_INITIAL_CAPACITY;

    public MyHashSetV3() {                      //capacity가 정해져있음
        initBuckets();
    }

    public MyHashSetV3(int capacity) {          //capacity를 내가 정함
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];     //buckets에 capacity길이의 list를 만들어줌
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();    //buckets의 인덱스마다 list를 만들어줌
        }
    }

    public boolean add(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        if (bucket.contains(value)) {
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(E searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<E> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    public boolean remove(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        boolean result = bucket.remove(value);  //Object이기 때문에 우리가 원하는 값을 지워줌
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

    private int hashIndex(Object value) {
        // -1, -10 -> 1, 10 음수가 들어오면 절대값을 사용해서 양수로 바꿔줌
        return Math.abs(value.hashCode()) % capacity;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
