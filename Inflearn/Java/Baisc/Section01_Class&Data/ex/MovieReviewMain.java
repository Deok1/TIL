package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview TheEqualizer1 = new MovieReview();
        TheEqualizer1.title = "더 이퀄라이저1";
        TheEqualizer1.review = "good";

        MovieReview TheEqualizer2 = new MovieReview();
        TheEqualizer2.title = "더 이퀄라이저2";
        TheEqualizer2.review = "better";

        System.out.println("영화 제목:" + TheEqualizer1.title + ", 영화 리뷰:" + TheEqualizer1.review);
        System.out.println("영화 제목:" + TheEqualizer2.title + ", 영화 리뷰:" + TheEqualizer2.review);
    }
}


