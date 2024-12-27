# 2. 변수와 타입, 연산자를 다루는 방법

- 불변
- null을 다루는 방법
- 타입 캐스팅과 특이한 타입 3가지
- `compareTo`, 연산자 오버로딩

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
> While certain types have an optimized internal representation as primitive values at runtime (such as numbers,
> characters, booleans and others),
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

## 2.4 연산자를 다루는 방법

1. 단항 연산자, 산술 연산자: 자바와 똑같습니다.
2. 비교 연산자와 동등성, 동일성: 비교 연산자 자바와 똑같다. 다만 객채끼리도 자동 호출되는 `compareTo`를 사용해 비교 연산자를 사용할 수 있다(?)
3. 논리 연산자, 특이한 연산자
    - `in`, `!in`, `a..b`
4. 연산자 오버로딩: 응용이 아직 납득되지 않는다. 심화다.

### 2.4.2 비교 연산자와 동등성, 돌일성

- 자바와 다르게 객체를 비교할 때 비교 연산자를 사용하면 자동으로 `compareTo`를 호출한다.
- 동등성 vs. 동일성
    - 동등성(Equality): 두 객체의 값이 같은가?
    - 동일성(Identity): 완전히 동일한 객체인가? 주소가 같은가?

**동등성, 동일성**

- 자바에서는 동일성에 `==`을 사용, 동등성에 `equals`를 직접 호출했다.
- 코틀린에서는 동일성에 `===`를 사용, 동등성에 `==`를 호출한다.
    - 간접적으로 `equals`를 호출해 준다.

### 2.4.3 논리 연산자, 특이한 연산자

**논리 연산자**

- 자바와 마찬가지로, Lazy 연산을 지원한다. 불필요한 연산을 피한다.
    - *단락 평가 아닌가요?

**특이한 연산자: 반복문에서 만나요**

- `in`, `!in`: 컬렉션 또는 범위에 포함되어 있다. 포함되어 있지 않다. 반복문에서 자주 사용한다.
- `a..b`
    - `a`부터 `b`까지의 범위 객체를 생성한다.

**연산자 오버로딩 ** ✅

> 어떻게 응용하는지 심화라고 한다. 아직 이해가 잘되지 않는다.

객체마다 연산자를 직접 지정할 수 있다.

# 3. 코드를 제어하는 방법

## 3.1 조건문

1. if: 자바와 문법 동일, 단 코틀린은 Expression으로 취급한다. 따라서 삼항 연산자가 없다.
2. Expression, Statement
3. switch, when: switch는 안녕. when의 시대가 도래했다.

**<참고 자료>**

- [Kotlin Docs 'Conditions and loops'](https://kotlinlang.org/docs/control-flow.html)

### 3.1.1 if

```kotlin
fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없다")
    }
}
```

> 코틀린에서는 void형이 없고 대신 Unit이 존재한다. 반환 타입을 생략했다.

### 3.1.2 Expression, Statement ✅

```kotlin
fun getPassOrFail(score: Int): String {
    if (score >= 50) {
        return "P"
    }

    return "F"
}
```

**삼항 연산자를 찾아서**

자바에서 `if-else`는 `Statement`지만 코틀린에서는 `Expression`이다. 따라서 삼항 연산자가 없다.

- Statement: 프로그램의 문장, 하나의 값으로 도출되지 않는다.
- Expression: 하나의 값으로 도출되는 문장

```kotlin
fun getGrade(score: Int): String {
    if (score >= 90) {
        return "A"
    }
    if (score >= 80) {
        return "B"
    }
    if (score >= 70) {
        return "C"
    }
    return "D"
}
```

- `if (score in 0..100)` 범위 연산자를 통해 값이 특정 범위에 포함되어 있는지 여부 확인 가능하다.

### 3.1.3 switch, when

```
when (값) {
    조건부 -> 어떠한 구문
    조건부 -> 어떠한 구분
    else -> 어떠한 구문
}
```

- 조건부는 여러 조건을 동시에 검사할 수 있다.
- 값이 없을 때, 유사 Early Return처럼 동작 가능하다.

```kotlin
// in 으로 리팩터링 가능하다
fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}
```

우리는 `switch`문을 잊었다. 늘 그랬듯이. `when`의 시대가 도래했다. 시스템 가동. 준비 완료.

**스마트 캐스트를 사용한 예제**

```kotlin
fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}
```

**조건부: 여러 조건 검사**

```kotlin
fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자입니다")
        else -> println("1, 0, -1이 아닙니다")
    }
}
```

**값 없이 사용: 유사 Early Return**

```kotlin
fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어진 숫자는 홀수입니다")
    }
}
```

놀라운 사실, `when`은 `Enum Class`, `Sealed Class`와 함께 사용할 때 진가가 나타난다. ✅

## 3.2 반복문

1. foreach: `in`을 사용
2. for: 등차수열과 `in`을 사용
3. Progression, Range
4. while: 동일

**<참고 자료>**

- [Kotlin Docs 'Conditions and loops'](https://kotlinlang.org/docs/control-flow.html)

### 3.2.1 foreach

숫자가 들어 있는 리스트, 컬렉션, 배열 등(Iterable)을 다룬다.

### 3.2.2 for

> Iterable에 구현되어 있다.

- `for in n..n`: 기존 방식
- `for in n downTo n`: 역순
- `step`: 건너뛰기

### 3.2.3 Progression, Range

> 코틀린에서 전통적인 for문은 등차수열을 활용한다.

- `.. 연산자`: 범위를 만든다.
    - 예) `1..3`
- 사실 `downTo`, `step`은 함수다. *중위함수

### 3.2.4 while

> 기존과 동일하다.

## 3.3 예외

1. try catch finally: 문법적으로 완전히 동일, 단 `try catch`는 `Exression`이다.
2. Checked Exception, Unchecked Exception: 모든 예외는 `Unchecked Exception`이다.
3. try with resources: 구문이 없다. 대신 코틀린의 언어 특징을 활용해 `close`를 호출한다.

**<참고 자료>**

- [Kotlin Docs 'Exceptions'](https://kotlinlang.org/docs/exceptions.html)

### 3.3.1 try catch finally

**주어진 문자열을 정수로 변경한다**

```kotlin
fun parseIntThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다")
    }
}
```

**주어진 문자열을 정수로 변경하고 실패하면 `null`을 반환한다**

```kotlin
fun parseIntThrow2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}
```

### 3.3.2 Checked Exception, Unchecked Exception

**프로젝트 파일의 내용을 읽는다**

```kotlin
fun readFile() {
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}
```

코틀린은 `Checked Exception`과 `Unchecked Exception`을 구분하지 않는다. 모두 `Unchecked Exception`이다.

### 3.3.3 try with resources

**프로젝트 파일 내용을 읽는다**

```kotlin
import java.io.BufferedReader
import java.io.FileReader

class FilePrinter {

    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}
```

`try with resources`구문은 `use`로 대체됐다.

## 3.4 함수

1. 함수 선언: 자바와 다르다. body가 하나의 값으로 간주되면 block을 없앨 수 있고 block이 없다면 반환 타입을 없앨 수 있다.
2. Default arguments: 기본값을 설정한다.
3. Named arguments: 특정 파라미터를 지정해 넣어주다.
4. 같은 타입의 여러 파라미터 받기(가변인자): `vararg`를 사용하고, 배열을 사용할 땐 `*`를 사용한다.

**<참고 자료>**

- [Kotlin Docs 'Functions'](https://kotlinlang.org/docs/functions.html)

### 3.4.1 함수 선언 ✅

**두 정수를 받아 더 큰 정수를 반환한다**

```kotlin
fun max(a: Int, b: Int) = if (a > b) a else b
```

- `block {}`을 사용할 때, 반환 타입이 `Unit`이 아니면 반환 타입을 명시적으로 작성한다.
    - `=`을 사용하는 경우 반환 타입 생략 가능
- 함수는 클래스 안 또는 파일 최상단에 있을 수 있다.
    - 파일 안에 여러 함수가 있을 수 있다.

### 3.4.2 Default arguments

**주어진 문자열을 N번 출력한다**

```kotlin
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}
```

- 인자로 값을 넣어주지 않으면 기본값을 사용한다.
    - 물론 오버로딩도 가능하다.

### 3.4.3 Named arguments

```kotlin
fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

printNameAndGender(name = "서머싯 몸", gender = "MALE")
```

- 매개변수 이름을 통해 직접 지정한다. 지정되지 않은 매개변수는 기본값 사용
    - `Builder`를 직접 만들지 않고 `builder`의 장점을 가진다.

### 3.4.4 같은 타입의 여러 파라미터 받기(가변인자)

**문자열을 N개 받아 출력한다**

```kotlin
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}

printAll("A", "B", "C")

val array = arrayOf("A", "B", "C")
printAll(*array)
```

가변인자를 사용할 때 `vararg`를 사용한다. 배열을 바로 넣는 대신 스프레드 연산자 `*`를 사용해야 한다.
