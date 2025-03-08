package exception.ex4.exception;


public class ConnectExceptionV4 extends NetworkClientExceptionV4 {

    private final String address;   //어느 서버의 연결을 실패했는지, 서버의 주소를 담을 변수

    public ConnectExceptionV4(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
