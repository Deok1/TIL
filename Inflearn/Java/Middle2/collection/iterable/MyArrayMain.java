package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {

    public static void main(String[] args) {

        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});
        Iterator<Integer> iterator = myArray.iterator();
        System.out.println("iterator 사용");

        while (iterator.hasNext()) {
            int value = iterator.next();
            System.out.println("value = " + value);
        }
        
        //추가
        System.out.println("for-each 사용");
        for (int value : myArray) {     //반복하려는 객체가 iterable을 가지고 있으면 향상된 for문 사용 가능
            System.out.println("value = " + value);
        }
    }
}
