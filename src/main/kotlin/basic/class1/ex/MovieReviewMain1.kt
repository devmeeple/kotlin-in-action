package basic.class1.ex

fun main() {
    val inception = MovieReview("인셉션", "인생은 무한 루프")
    val aboutTime = MovieReview("어바웃 타임", "인생 시간 영화")

    println("영화 제목: " + inception.title + ", 리뷰: " + inception.review)
    println("영화 제목: " + aboutTime.title + ", 리뷰: " + aboutTime.review)
}