package collection.list;

public class BatchProcessor {

    private final MyList<Integer> list;

    // MyList는 MyArrayList, MyLinkedList의 부모이다
    public BatchProcessor(MyList<Integer> list) {   // 결정을 밖에서 결정함 = 의존 관계 주입
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i); //앞에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
