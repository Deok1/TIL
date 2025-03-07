package exception.ex1;

public class NetworkServiceV1_1 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 clident = new NetworkClientV1(address);
        clident.initError(data);    //추가 : 오류검출

        clident.connect();
        clident.send(data);
        clident.disconnect();
    }
}
