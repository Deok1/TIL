package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar) {

        int localVar = 1;

        Printer printer = new Printer() {   // 익명 클래스 : 클래스 선언과 생성을 하나로 합침
            int value = 0;

            @Override
            public void print() {
                System.out.println("value=" + value);
                System.out.println("localVar=" + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInstanceVar=" + outInstanceVar);
            }
        };
        printer.print();
        System.out.println("printer.getClass() = " + printer.getClass());
        // 익명 클래스의 이름은 따로 없음
        //class nested.anonymous.AnonymousOuter$1 : $1로 표시됨
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
