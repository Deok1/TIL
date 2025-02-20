package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWhitSpaces = "      Java Programming";

        System.out.println("소문자로 변환: " + strWhitSpaces.toLowerCase());
        System.out.println("대문자로 변환: " + strWhitSpaces.toUpperCase());

        System.out.println("공백 제거(trim): '" + strWhitSpaces.trim() + "'");
        System.out.println("공백 제거(strip): '" + strWhitSpaces.strip() + "'");
        System.out.println("앞 공백 제거(strip): '" + strWhitSpaces.stripLeading() + "'");
        System.out.println("뒤 공백 제거(strip): '" + strWhitSpaces.stripTrailing() + "'");
    }
}
