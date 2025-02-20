package lang.immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate data1 = new ImmutableMyDate(2024,1,1);
        ImmutableMyDate data2 = data1;
        System.out.println("date1 = " + data1);
        System.out.println("date2 = " + data2);

        System.out.println("2025 -> date1");
        data1 = data1.withYear(2025);
        System.out.println("date1 = " + data1);
        System.out.println("date2 = " + data2);
    }
}
