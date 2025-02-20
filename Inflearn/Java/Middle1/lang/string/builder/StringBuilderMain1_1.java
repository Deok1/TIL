package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        sb.reverse();   //불변이 아니기 때문에 반환값을 받지 않아도 됨
        System.out.println("reverse = " + sb);

        //여기까지 가변으로 변경하다가
        //마지막엔 불변으로 변경

        //StringBuilder -> String
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
