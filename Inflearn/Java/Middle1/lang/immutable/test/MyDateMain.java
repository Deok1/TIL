package lang.immutable.test;

public class MyDateMain {
    public static void main(String[] args) {
        MyDate data1 = new MyDate(2024,1,1);
        MyDate data2 = data1;
        System.out.println("date1 = " + data1);
        System.out.println("date2 = " + data2);

        System.out.println("2025 -> date1");
        data1.setYear(2025);
        System.out.println("date1 = " + data1);
        System.out.println("date2 = " + data2);
    }
}
