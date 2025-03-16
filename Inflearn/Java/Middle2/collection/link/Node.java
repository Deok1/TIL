package collection.link;

public class Node {

    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    // IDE 생성 toString()
    /*
    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
    */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node x = this;  // 자기 자신의 참조값 x01
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
