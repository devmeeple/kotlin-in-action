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

## 2.3 Type을 다루는 방법

1. 기본 타입: 할당된 초깃값을 읽어 타입을 추론한다. 기본 타입 간 변환은 명시적`(to 타입)`으로 이뤄진다.
2. 타입 캐스팅: `is`, `!is`, `as`, `as?`를 이용해 타입을 확인, 캐스팅한다. (도식화 필요)
3. 3가지 특이한 타입: `Any`는 `Object` 아버지다. `Unit`은 `void`, `Nothing`은 정상적이지 않은 친구를 의미한다.
4. String Interpolation, String indexing 
   - 문자열을 효과적으로 가공할 때 `${변수}`, `""""""`를 사용한다.
   - 문자열을 배열처럼 다뤄 값을 가져온다.

### 2.3.1 기본 타입

- Int
- Long
- Float
- Double

코틀린은 할당된 값을 읽어 타입을 추론한다.

**기본 타입 간 변환은 '명시적으로' 이루어져야 한다.** 이는 자바와 결정적인 차이점이다. 타입을 맞춰줘야 한다.

- `to타입` 형식을 사용한다.

만약 변수가 `nullable`이면 어떻게 할까? 적절한 처리가 필요하다. *기억나시나요 `null`을 다루는 방법?

### 2.3.2 타입 캐스팅 ✅

> 도식화를 통해 설명한다.

기본 타입이 아닌 일반 타입은 어떨까?

```kotlin
private fun printAgeIfPerson(obj: Any): Int {
    if (obj is Person) {
        return obj.age
    }

    throw IllegalArgumentException("Person 타입이 아닙니다")
}
```

자바에서는 `instaceof`를 사용하지만 코틀린에서는 `is`를 사용한다. 타입 변환은 `as`를 사용한다.

- 스마트 캐스트를 통해 컨텍스트에서 타입을 추론한다. `if`문에서 타입을 이미 체크했기 때문에 짧게 작성 가능하다.
  - `is`의 반대 `!is`(not is)도 사용 가능하다. 타입이 아니라면...
  - `null`을 고려하여 `as?`도 사용한다. *거듭 반복되는 `null` 다루기. Safe call 기억하시죠?

### 2.3.3 특이한 타입 3가지

> 누구냐 넌?

- Any, Unit, Nothing

**Any**

- 자바의 `Object`, 모든 객체의 최상위 타입
- 모든 Primitive Type의 아버지.
- Any에 `equals`, `hashCode`, `toString` 포함

**Unit**

- 자바의 `void`와 동일한 역할. 하지만 조금 다르다(?) 제네릭에서 계속...
- 함수형 프로그래밍에서 `Unit`은 단 하나의 인스턴스만 갖는 타입을 의미한다. 
  - `Unit`은 실제 존재하는 타입이라는 것을 표현한다.

**Nothing**

- 함수가 정상적으로 끝나지 않았다는 사실을 표현한다.
  - 무조건 예외를 반환하는 함수, 무한 루프 함수 등

### 2.3.4 String interpolation, String indexing

> 문자열을 효과적으로 가공하는 방법

**String interpolation**

> 템플릿 리터럴과 유사하다.

`${변수}` 형식이 가독성, 일괄 변환(리팩터링), 정규식 활용에 유용하다.

```kotlin
val message = """
이렇게도 사용할 수
있다
""".trimIndent()
```

**String indexing**

- 문자열을 배열처럼 사용할 수 있다.

**<참고 자료>**

- [Kotlin Docs 'Strings'](https://kotlinlang.org/docs/strings.html)
