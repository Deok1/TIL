package collection.iterable;

import java.util.Iterator;

public class MyArray implements Iterable<Integer> {     //Iterable을 붙임으로써 반복가능함을 명시함

    private int[] numbers;

    public MyArray(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(numbers);    //자료 구조에 사용할 반복자(Iterator)를 반환
    }
}
