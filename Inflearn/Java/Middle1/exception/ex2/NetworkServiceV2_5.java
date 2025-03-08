package exception.ex2;

public class NetworkServiceV2_5 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 clident = new NetworkClientV2(address);
        clident.initError(data);    //추가 : 오류검출

        try {
            clident.connect();
            clident.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
        } finally {
            clident.disconnect();
        }
    }
}
