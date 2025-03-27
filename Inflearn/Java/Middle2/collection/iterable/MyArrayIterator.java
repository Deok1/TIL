package collection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {  //배열을 반복할 수 있는 반복자

    private int currentIndex = -1;  //현재 인덱스를 -1로 해야 next()메서드가 실행되고 난 뒤 0이 되므로 인덱스 처음부터 돌게 됨
    private int [] targetArr;

    public MyArrayIterator(int[] targetArr) {   //순회하고 싶은 배열을 넣어줌
        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {  //다음 요소가 있는지 확인하는 메서드
        return currentIndex < targetArr.length - 1;     //현재index가 배열index의 끝에 도달했는지 여부 반환
    }                                                   //next에서 currentIndex가 증가하고, 배열길이보다 길어지면 false반환

    @Override
    public Integer next() {     //다음 요소를 반환하는 메서드
        currentIndex++;     //-1 -> 0 -> 1 -> 2 ...
        return targetArr[currentIndex];     //다음 요소로 위치 이동
    }
}
