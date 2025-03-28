package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {

    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});

        Iterator<Integer> iterator = myArray.iterator();
        System.out.println("iterator 사용");
        while (iterator.hasNext()) {                //for-each문이 컴파일 시점에 while반복문으로 변경되고 실행된다.
            Integer value = iterator.next();
            System.out.println("value = " + value);
        }

        System.out.println("for-each 사용");
        for (int value : myArray) {
            System.out.println("value = " + value);
        }
    }
}
