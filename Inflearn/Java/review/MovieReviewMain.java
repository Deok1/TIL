package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "더 이퀄라이져";
        movieReview1.review = "good";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "더 이퀄라이져2";
        movieReview2.review = "good2";

        MovieReview[] movieReviews = {movieReview1, movieReview2};

        for (MovieReview movieReview : movieReviews) {
            System.out.println("영화 제목:" + movieReview.title + ", 리뷰:" + movieReview.review);
        }
    }
}
