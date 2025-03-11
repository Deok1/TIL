package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {

    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    // 와일드 카드는 이미 만들어진 제네릭을 더 편리하게 사용할 수 있도록 도와주는 도구
    // 정의하는 단계에서는 Object의 기능만 사용 가능함
    // Box<Dog>, Box<Cat>, Box<Object> 등이 들어올 수 있음
    static void printWildcardV1(Box<?> box) {   // ?는 아무거나 다 들어올 수 있다는 뜻임
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) { // 값을 출력
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildCardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {    // 값을 출력하고 T 타입 반환까지
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
