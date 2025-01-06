package tour.collections

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.maps.shouldContainKey
import io.kotest.matchers.maps.shouldContainValue

class MapTest : FunSpec({
    test("Map, 키와 값으로 값을 저장한다.") {
        val books = mapOf("객체지향의 사실과 오해" to 20000, "단위 테스트의 기술" to 36000, "CODE" to 25000)

        books shouldContainKey "객체지향의 사실과 오해"
        books shouldContainValue 20000
    }
})
