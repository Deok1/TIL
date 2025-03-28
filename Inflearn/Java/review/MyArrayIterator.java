package collection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {

    private int currentIndex = -1;              //currentIndex를 -1로 해야 next()메서드가 실행됐을 때 0부터 시작함(전위 증가)
    private int [] targetArr;

    public MyArrayIterator(int[] targetArr) {   //배열을 입력받음
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {                  //currentIndex가 배열의 길이보다 작으면 true반환
        return currentIndex < targetArr.length - 1;
    }

    @Override
    public Integer next() {                     //currentIndex를 증가시키고 배열의 다음 요소를 반환
        currentIndex++;
        return targetArr[currentIndex];
    }
}
