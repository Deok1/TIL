package collection.iterable;

import java.util.Iterator;

public class MyArray implements Iterable<Integer> {     //반복 가능한 클래스라고 선언하는 격임

    private int[] numbers;

    public MyArray(int[] numbers) {                     //배열 입력받음
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(numbers);            //반복자에 배열을 넘김
    }
}
