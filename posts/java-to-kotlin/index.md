# 2. 코틀린에서 변수와 타입, 연산자를 다루는 방법

## 2.1 변수를 다루는 방법

1. `var`과 `val`의 차이점
2. Primitive Type
3. Nullable 변수
4. 객체 인스턴스화

### 2.1.1 var과 val의 차이점

- [ ] 왜 불변해야 할까?
- [ ] 타입 추론이란?

> 가능한 우선 `val`로 선언하고 필요한 경우 `var`로 변경한다.

- 변수의 수정 가능 여부를 선언한다. 가변, 불변
- 타입을 자동으로 추론한다. 물론 명시적으로 작성할 수 있다.
- 선언과 동시에 초기값 할당을 권장한다.
- 컬렉션에는 `element`를 추가할 수 있다.
  - 불변하지만 참조형이니 가능하다.

**long과 final long의 차이**

가변, 불변(read-only)

### 2.1.2 Primitive Type

- [ ] boxing, unboxing

> In Kotlin, everything is an object in the sense that you can call member functions and properties on any variable. 
> While certain types have an optimized internal representation as primitive values at runtime (such as numbers, characters, booleans and others), 
> they appear and behave like regular classes to you.
> <br>
> 몇몇 타입은 내부적으로 특별하게 처리한다. 실행 시에는 Primitive 값으로 표현하되, 코드에서는 평범한 클래스처럼 보인다.

코틀린은 상황에 따라 내부적으로 primitive type 값으로 변환하여 처리하는 '알잘딱깔센' 면모를 보인다.

개발자가 boxing, unboxing을 고려하지 않아도 된다. 외쳐! Kotlin

[<출처: Kotlin Docs 'Basic types'>](https://kotlinlang.org/docs/basic-types.html)

### 2.1.3 Null safety

코틀린은 기본적으로 `null`을 허용하지 않는다. (설계자의 의도) 따라서 만약 `null`이 필요하다면 다음과 같이 선언한다.

```kotlin
fun main() {
    val book: String? = "Kotlin in Action"
}
```

### 2.1.4 객체 인스턴스화

자바와 달리 코틀린에서 객체를 인스턴스화할 때 `new`를 사용하지 않는다.

**<참고 자료>**

- [Kotlin Docs 'Null safety'](https://kotlinlang.org/docs/null-safety.html)

## 2.2 null을 다루는 방법

1. null 체크: `null`이 들어가면 완전히 다른 친구다.
2. Safe Call, Elvis 연산자: `?.`, `?:`
3. 널 아님 단언: `!!`, 넌 절대 `null` 일 수 없다(단언)
4. 플랫폼 타입: 자바와 함께 사용할 때 유의 바랍니다.

### 2.2.1 null 체크

코틀린에서는 `null`이 가능한 타입을 완전히 다르게 취급한다. 그렇다면 `null`이 가능한 타입만을 위한 기능이 있어야 하지 않을까?

### 2.2.2 Safe Call과 Elvis 연산자

- Safe Call: `?.`, `null`이 아니면 실행한다.
- Elvis 연산자: 앞의 연산 결과가 `null`이면 조건 이후 값을 사용한다.
  - Elvis 연산자를 90도 회전했을 때 엘비스 프레슬리와 비슷하다고 하여 'Elvis 연산자'라고 부른다고 한다.
  - Early Return 패턴에도 사용할 수 있다.

### 2.2.3 널 아님 단언

`nullable type`이지만, 아무리 생각해도 `null` 담을 수 없다.

- `!!`: 넌 절대로 `null`일 수가 없어. 컴파일러 내 눈을 바라봐. *TypeScript가 떠오른다.
  - 혹시나 `null`이 들어오면 `NPE`가 발생한다. **확실하지 않으면 걸지 마라.** 

### 2.2.4 플랫폼 타입

코틀린과 자바의 호환성이 좋아 함께 사용하는 상황이 있다.

- 플랫폼 타입: 피치 못할 사정으로 코틀린이 `null`관련 정보를 알 수 없는 타입

앞서 다뤘듯이 코틀린은 `null`에 예민한 친구다. 코틀린과 자바를 함께 사용한다면 `null` 여부를 조금 더 꼼꼼하게 관리해야 한다.

### ETC

> "null을 만든 걸 후회한다" <출처: Tony Hoare - ALGOL 60 개발자>
