package basic.class1.ex

fun main() {
    val reviews = listOf(
        MovieReview("인셉션", "인생은 무한 루프"),
        MovieReview("어바웃 타임", "인생 시간 영화"),
    )

    for (review in reviews) {
        println("영화 제목: " + review.title + ", 리뷰: " + review.review)
    }
}