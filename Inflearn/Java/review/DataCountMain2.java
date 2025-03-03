package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count = " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count = " + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count = " + counter.count);

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
}
