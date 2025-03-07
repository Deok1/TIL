package exception.ex0;

public class NetworkServiceV0 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV0 clident = new NetworkClientV0(address);

        clident.connect();
        clident.send(data);
        clident.disconnect();
    }
}
