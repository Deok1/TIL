package nested.local;

public class LocalOuterV3 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {

        int localVar = 1;

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                //인스턴스는 지역 변수보다 더 오래 살아남는다
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);

                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        Printer printer = new LocalPrinter();
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);
        printer.print();
    }
}
// 설명
// LocalOuterV3의 객체를 생성하고 Printer 타입에 process를 실행한다.
// 따지고 보면 객체를 생성하고 process가 실행되고 종료되는 동안 스택 영역에 존재하고 사라진다.
// 그렇다면 process에 존재하는 변수들은 지역변수이므로 process가 종료되면 같이 GC에 의해 제거된다.
// 그러나 자바는 process에 있는 지역 변수들을 '캡쳐'해서 '힙 영역'에 추가해둔다.
// 해서 process가 종료 된 후에 객체를 통해 print()에 접근해도 모든 변수를 출력할 수 있게 된다.