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
