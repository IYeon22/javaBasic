package ClassStart1;

public class MovieReviewMain2 {
    public static void main(String[] args) {

        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
        reviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타입";
        aboutTime.review = "존잼";
        reviews[1] = aboutTime;

        for(int i=0; i<reviews.length; i++){
            System.out.println("영화 제목: " + reviews[i].title + "영화 리뷰 : " + reviews[i].review);
        }
//
//        for(MovieReview review :reviews){
//            System.out.println("영화 제목: " + review.title + "영화 리뷰 : " + review.review);
//        }
    }
}
