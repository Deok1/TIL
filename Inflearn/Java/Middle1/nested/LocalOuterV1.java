package nested.local;

public class LocalOuterV1 {

    private int outInstanceVar = 3; //인스턴스 변수

    public void process(int paramVar) { //지역 변수(매개 변수)

        int localVar = 1;   //지역 변수

        class LocalPrinter {
            int value = 0;  //인스턴스 변수

            public void printData() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData();    //이때까지 모두 GC에 제거되지 않고 존재한다.
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);
    }
}
