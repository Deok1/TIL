package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + data1.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + data2.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + data3.count);

    }

    public static class Data1 {
        public String name;
        public int count;

        Data1(String name) {
            this.name = name;
            count++;
        }
    }

    public static class Data2 {
        public String name;

        public Data2(String name, Counter counter) {
            this.name = name;
            counter.count++;
        }
    }

    public static class Counter {
        public int count;
    }

    public static class Data3 {
        public String name;
        public static int count;

        public Data3(String name) {
            this.name = name;
            count++;
        }
    }
}
