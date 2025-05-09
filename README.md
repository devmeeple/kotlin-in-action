# Kotlin in Action

## 변수

```kotlin
// Long 타입 추론
val numL1 = 10L
val numL2 = 12345678912345
```

- 숫자 끝에 `L`[^1]을 붙이면 `Long` 타입으로 추론한다. 또는 `Int`의 표현 범위[^2]를 넘으면 정수 리터럴을 `Long`으로 추론한다.
- 숫자에 언더바를 사용할 때는, 뒤에서부터 3자리씩 나누는 것이 가독성에 좋다.
- [Numbers](https://kotlinlang.org/docs/numbers.html)

## 조건문

- 코틀린은 `if`가 표현식이기 때문에 삼항 연산자를 제공하지 않는다. 자바나 자바스크립트의 삼항 연산자를 대체한다.
    - 표현식이란 값을 반환하는 코드를 의미한다.
- 조건이 여러 개 일 때는 `when`이 가독성에 좋다.
- [Conditions and loops](https://kotlinlang.org/docs/control-flow.html)
- [Ternary operator](https://discuss.kotlinlang.org/t/ternary-operator/2116)

## 클래스(Class)

1. Data Class
2. Enum Class
3. Sealed Class, Sealed Interface

### 1. Data Class

- DTO(Data Transfer Object)는 데이터의 동등성 비교, 출력이 필요한 상황이 많다. 따라서 `equals`, `hashCode`, `toString` 같은 메서드가 필요하다.
- `Named arguments`를 사용하여 Builder 패턴을 사용했을 때 얻는 이점을 동일하게 얻을 수 있다.

**Java**

- `Record Classes`는 Kotlin `Data Class`와 비슷한 결과를 얻는다.

## 컬렉션을 함수로 다루는 방법

- `filter`, `filterIndexed`,`map`, `mapIndexed`, `mapNotNull`
- `all`, `none`, `any`, `count`, `sortedBy`, `sortedByDescending`, `distinctBy`, `first`, `firstOrNull`, `last`,
  `lastOrNull`
- `groupBy`, `associateBy`
- `flatMap`, `flatten`

**<참고 자료>**

- [『Kotlin in Action: 2/e』(세바스티안 아이그너·로만 엘리자로프·스베트라나 이사코바·드미트리 제메로프, 에이콘출판, 2017)](https://product.kyobobook.co.kr/detail/S000215768644)
- [『코틀린 아카데미: 핵심편』(마르친 모스카와, 인사이트, 2024)](https://product.kyobobook.co.kr/detail/S000213720494)
- [최태현 '자바 개발자를 위한 코틀린 입문(Java to Kotlin Starter Guide)'](https://inf.run/r9oU)
- [Dave Leeds 'Kotlin: An Illustrated Guide'](https://typealias.com/start/)

[^1]: 정수 리터럴 상수
[^2]: -2,147,483,648 ($2^{31}$)