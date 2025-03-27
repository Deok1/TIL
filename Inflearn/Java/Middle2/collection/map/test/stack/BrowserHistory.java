package collection.map.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private Deque<String> history = new ArrayDeque<>();
    private String currentPage = null;         //현재 페이지에 대한 정보

    public void visitPage(String url) {
        if (currentPage != null) {
            history.push(currentPage);      //기존 페이지를 history에 넣어줌
        }
        currentPage = url;                  //새 페이지를 currentPage에 넣어줌
        System.out.println("방문: " + url);
    }

    public String goBack() {
        if (!history.isEmpty()) {
            String currentPage = history.pop();
            System.out.println("뒤로가기: " + currentPage);
            return currentPage;
        }
        return null;
    }
}
