package collection.list;

public class MyLinkedList<E> implements MyList<E> {

    private Node<E> first;
    private int size = 0;

    @Override
    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (first == null) {            // 생성된 노드가 없으면 노드를 새로 만듦
            first = newNode;
        } else {                        //생성된 노드가 있고 next가 null이면 next에 새 노드의 참조값을 넣어줌
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) {    // node의 next가 null일때까지 계속 loop를 돌림
            x = x.next;             // Node 타입의 변수 x에 마지막 노드의 next를 담음
        }
        return x;
    }

    @Override
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);     // 신규 노드 생성
        if (index == 0) {               // 신규 노드를 제일 앞에 추가
            newNode.next = first;       // 신규 노드의 next에 기존 첫번째 노드의 참조값을 넣어 연결
            first = newNode;            // first에 newNode를 넣어서 first를 바꿈
        } else {
            Node<E> prev = getNode(index - 1);  // 추가될 노드의 직전 노드를 찾음
            newNode.next = prev.next;              // 추가될 노드와 다음 노드를 연결
            prev.next = newNode;                   // 직전 노드와 추가될 노드 연결
        }
        size++;     // 한개 늘어났으니 size 증가
    }

    @Override
    public E set(int index, E element) {
        Node<E> x = getNode(index);    // index의 노드를 받음
        E oldValue = x.item;   // 이전 노드를 반환하기 위해 사라지기 전에 담아둠
        x.item = element;           // 입력한 Obeject타입의 인자로 대체
        return oldValue;
    }

    @Override
    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next;                // 삭제할 node의 다음 노드를 first에 연결
        } else {
            Node<E> prev = getNode(index - 1);   // 삭제할 node의 직전 node를 찾음
            prev.next = removeNode.next;            // 직전 node와 삭제할 node의 다음 node와 연결
        }
        removeNode.item = null;                     // item을 비움
        removeNode.next = null;                     // next를 비움
        size--;                                     // size를 줄임
        return removedItem;                         // 삭제된 node의 item 기존값을 반환

    }

    @Override
    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;           // index위치의 node의 item을 반환
    }

    private Node<E> getNode(int index) {       // O(n) : 성능 최악
        Node<E> x = first;                     // 첫번째 노드
        for (int i = 0; i < index; i++) {   // index까지 loop돌림
            x = x.next;                     // index번째 node를 변수에 담음
        }
        return x;                           // index번째 node반환
    }

    @Override
    public int indexOf(E o) {          // 입력한 데이터의 index를 반환하는 메서드
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next) {   // 처음부터 끝까지 루프
            if (o.equals(x.item)) {         // 입력 데이터 == x번째 item의 데이터 이면
                return index;               // 반환
            }
            index++;
        }
        return -1;                          // 못 찾으면 -1
    }

    @Override
    public int size() {
            return size;
    }

    @Override
    public String toString() {              // IDE의 toString()
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }


    private static class Node<E> {

        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        // [A->B->C]
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this;  // 자기 자신의 참조값 x01
            sb.append("[");
            while (x != null) {
                sb.append(x.item);
                if (x.next != null) {   // 조건을 안넣으면 [A->B->C->]이렇게 나옴
                    sb.append("->");
                }
                x = x.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
