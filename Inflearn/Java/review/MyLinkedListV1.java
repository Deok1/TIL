package collection.link;

public class MyLinkedListV1 {

    private Node first;
    private int size = 0;

    public void add(Object e) {
        Node newNode = new Node(e);
        if (first == null) {            // 생성된 노드가 없으면 노드를 새로 만듦
            first = newNode;
        } else {                        //생성된 노드가 있고 next가 null이면 next에 새 노드의 참조값을 넣어줌
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {    // node의 next가 null일때까지 계속 loop를 돌림
            x = x.next;             // Node 타입의 변수 x에 마지막 노드의 next를 담음
        }
        return x;
    }

    public Object set(int index, Object element) {
        Node x = getNode(index);    // index의 노드를 받음
        Object oldValue = x.item;   // 이전 노드를 반환하기 위해 사라지기 전에 담아둠
        x.item = element;           // 입력한 Obeject타입의 인자로 대체
        return oldValue;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;           // index위치의 node의 item을 반환
    }

    private Node getNode(int index) {       // O(n) : 성능 최악
        Node x = first;                     // 첫번째 노드
        for (int i = 0; i < index; i++) {   // index까지 loop돌림
            x = x.next;                     // index번째 node를 변수에 담음
        }
        return x;                           // index번째 node반환
    }

    public int indexOf(Object o) {          // 입력한 데이터의 index를 반환하는 메서드
        int index = 0;
        for (Node x = first; x != null; x = x.next) {   // 처음부터 끝까지 루프
            if (o.equals(x.item)) {         // 입력 데이터 == x번째 item의 데이터 이면
                return index;               // 반환
            }
            index++;
        }
        return -1;                          // 못 찾으면 -1
    }
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
}
