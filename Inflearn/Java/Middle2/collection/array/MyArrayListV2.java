package collection.array;

import java.util.Arrays;

public class MyArrayListV2 {

    private static final int DEFAULT_CAPACITY = 5;  // 기본 수용량, 변경 불가

    private Object[] elementData;   // 세상의 모든 자료를 담을 수 있는 object 배열
    private int size = 0;

    public MyArrayListV2() {    // 배열의 크기가 정해진 메서드
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int initialCapacity) { // 배열의 크기를 정하는 메서드
        elementData = new Object[initialCapacity];
    }

    public int size() {     // size의 값을 반환하는 메서드
        return size;
    }

    public void add(Object e) {     // 배열에 순서대로 값을 입력하는 메서드
        // 코드 추가
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    // 코드 추가
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
        // Arrays.copyOf :  배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
        //                  새로운 배열의 참조값도 복사해서 넣어줌 -> 다른 기존 코드를 바꾸지 않아도 됨
    }

    public Object get(int index) {  // 특정 위치의 값을 반환해주는 메서드
        return elementData[index];
    }

    public Object set(int index, Object element) {  // 특정 위치에 값을 세팅해주는 메서드
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;    // 값을 교체하지만 교체 전 값을 반환해줌
    }

    public int indexOf(Object o) {      // 배열을 순회하며 오브젝트를 찾고, 몇번째 인덱스에 위치하는지 반환해주는 메서드
        for (int i = 0; i < size; i++) {    // 값이 들어있는 만큼(size)만 순회
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;  // 못찾으면 -1 반환
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size))    // Arrays.copyof : 배열에서 사이즈 크기만큼만 카피하는 명령어
                + " size= " + size + ", capacity= " + elementData.length;
        // [1, 2, 3, null, null] 이렇게 배열이 있다면
        // [1, 2, 3] 이렇게 출력해줌
    }
}
