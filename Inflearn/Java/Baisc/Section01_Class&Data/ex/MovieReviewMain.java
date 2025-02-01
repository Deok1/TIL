package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview TheEqulizer1 = new MovieReview();
        TheEqulizer1.title = "더 이퀄라이저1";
        TheEqulizer1.review = "흑인 형아가 나쁜놈들 쓸어주는 영화";

        MovieReview TheEqulizer2 = new MovieReview();
        TheEqulizer2.title = "더 이퀄라이저2";
        TheEqulizer2.review = "흑인 형아가 나쁜놈들 시원하게 쓸어주는 영화";

        System.out.println("영화 제목:" + TheEqulizer1.title + ", 리뷰:" + TheEqulizer1.review);
        System.out.println("영화 제목:" + TheEqulizer2.title + ", 리뷰:" + TheEqulizer2.review);
    }
}
