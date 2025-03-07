package exception.ex1;

public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        NetworkClientV1 client = new NetworkClientV1("http://example.com");
        client.initError(data);

        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            }
        }
        //connect를 호출하면 무조건 diconnect가 호출하게 만듦
        client.disconnect();    //return을 안하게 만듦 -> 무조건 종료가 됨.
    }
    private static boolean isError(String resultCode) {
        return !resultCode.equals("success");
        //resultCode가 success가 나오면 true이지만 !를 붙임으로써 false가 나옴
    }
}
