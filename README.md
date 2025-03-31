# Kotlin in Action

## 변수

```kotlin
// Long 타입 추론
val numL1 = 10L
val numL2 = 12345678912345
```

- 숫자 끝에 `L`[^1]을 붙이면 `Long` 타입으로 추론한다. 또는 `Int`의 표현 범위[^1]를 넘으면 정수 리터럴을 `Long`으로 추론한다.
- 숫자에 언더바를 사용할 때는, 뒤에서부터 3자리씩 나누는 것이 가독성에 좋다.
- [Numbers](https://kotlinlang.org/docs/numbers.html)

**<참고 자료>**

- [『Kotlin in Action: 2/e』(세바스티안 아이그너·로만 엘리자로프·스베트라나 이사코바·드미트리 제메로프, 에이콘출판, 2017)](https://product.kyobobook.co.kr/detail/S000215768644)
- [『코틀린 아카데미: 핵심편』(마르친 모스카와, 인사이트, 2024)](https://product.kyobobook.co.kr/detail/S000213720494)
- [최태현 '자바 개발자를 위한 코틀린 입문(Java to Kotlin Starter Guide)'](https://inf.run/r9oU)
- [Dave Leeds 'Kotlin: An Illustrated Guide'](https://typealias.com/start/)

[^1]: 정수 리터럴 상수
[^2]: -2,147,483,648 ($2^{31}$)