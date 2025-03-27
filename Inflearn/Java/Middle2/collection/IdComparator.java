package collection.compare;

import java.util.Comparator;

public class IdComparator implements Comparator<MyUser> {

    @Override
    public int compare(MyUser o1, MyUser o2) {
        return o1.getId().compareTo(o2.getId());    //자바 String에서 문자끼리 대소비교를 위해 compareTo를 구현해놓음
    }
}
