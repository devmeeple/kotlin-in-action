package tour.collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ListTest : FunSpec({
    // TODO: 2025.01.06 (1) Kotest, 숙련도 부족 (2) members, 중복 선언이 최선인가? 명료한 테스트.

    test("단체 채팅방 인원수를 조회한다") {
        val members = listOf("조영호", "로이 오셔로브", "블라디미르 코리코프")

        val result = members.count()

        result shouldBe 3
    }

    test("단체 채팅방에 마지막으로 입장한 참가자를 조회한다") {
        val members = listOf("조영호", "로이 오셔로브", "블라디미르 코리코프")

        val result = members.last()

        result shouldBe "블라디미르 코리코프"
    }

    test("단체 채팅방에 첫번째 입장한 참가자를 조회한다") {
        val members = listOf("조영호", "로이 오셔로브", "블라디미르 코리코프")

        val result = members.first()

        result shouldBe "조영호"
    }

    test("단체 채팅방에 포함된 인원을 조회한다") {
        val findMember = "조영호"
        val members = listOf("조영호", "로이 오셔로브", "블라디미르 코리코프")

        val result = findMember in members

        result shouldBe true
    }

    test("변경 가능한 단체 채팅방에 인원을 추가한다") {
        val mutableMembers = mutableListOf("장영희", "정재승", "안희연")

        mutableMembers.add("이문열")

        val result = mutableMembers.count()
        result shouldBe 4
    }
})
