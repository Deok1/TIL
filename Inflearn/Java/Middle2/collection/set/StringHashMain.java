package collection.set;

public class StringHashMain {   //문자 데이터로 해쉬 인덱스를 구하는 클래스

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int) charA);
        System.out.println("charB = " + (int) charB);

        //hashCode
        System.out.println("hashCode('A') = " + hashCode("A"));
        System.out.println("hashCode('B') = " + hashCode("B"));
        System.out.println("hashCode('AB') = " + hashCode("AB"));

        //hashIndex
        System.out.println("hashIndex(hashCode('A')) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(hashCode('B')) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(hashCode('AB')) = " + hashIndex(hashCode("AB")));
    }

    static int hashCode(String str) {           //문자를 입력하면 숫자로 바꿔줌
        char[] charArray = str.toCharArray();   //문자열을 위해서 배열 생성
        int sum = 0;
        for (char c : charArray) {              //문자열의 문자들을
            sum += c;                           //합산해줌
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
