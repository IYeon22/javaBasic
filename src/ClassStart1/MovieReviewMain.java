package ClassStart1;

public class MovieReviewMain {
    public static void main(String[] args) {

        MovieReview movieReview = new MovieReview();

        movieReview.title = "인셉션";
        movieReview.review = "인생은 무한 루프";

        MovieReview movieReview2 = new MovieReview();

        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화!";

        System.out.println("영화 제목: " + movieReview.title + "영화 리뷰 : " + movieReview.review);
        System.out.println("영화 제목: " + movieReview2.title + "영화 리뷰 : " + movieReview2.review);
    }
}
