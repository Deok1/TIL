package exception.ex4;


public class NetworkServiceV4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV4 clident = new NetworkClientV4(address);
        clident.initError(data);    //추가 : 오류검출

        try {
            clident.connect();
            clident.send(data);
        } finally {
            clident.disconnect();
        }
    }
}
