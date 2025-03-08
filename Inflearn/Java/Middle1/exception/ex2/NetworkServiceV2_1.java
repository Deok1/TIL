package exception.ex2;

public class NetworkServiceV2_1 {

    public void sendMessage(String data) throws NetworkClientExceptionV2{
        String address = "http://example.com";
        NetworkClientV2 clident = new NetworkClientV2(address);
        clident.initError(data);    //추가 : 오류검출

        clident.connect();
        clident.send(data);
        clident.disconnect();
    }
}
