# 3. 사용성(Usability)

## 3.1 확장 함수(Extension Functions)

> 라이브러리에 멤버 함수만 추가하면 문제해결할 수 있을 것 같은데? 뭐? 그게 쉽다고? 자주 쓴다고? 진짜예요?

- 확장 함수(Extension Functions)는 기존 클래스에 멤버 함수를 추가하는 것과 같은 효과를 얻는다.
    - 확장 대상 타입은 수신 객체 타입(Receiver Type)이라고 한다.
- 정의

```
fun 수신타입.확장함수() { ... }
```

- 확장 함수를 다른 패키지에서 사용하려면 `import`해야 한다.
- `this`키워드를 사용해 멤버 함수나 다른 확장에 접근할 수 있다.
    - 물론, 확장 함수 안에서도 `this`는 생략 가능하다.

유용하다 들었다. 소문 자자하다. 하지만 아직은 타입스크립트(TypeScript) `Symbol`처럼 느껴지는 한없이 먼 친구다.

## 3.2 이름 붙은 인자와 디폴트 인자(Named & Default Arguments)

## 3.3 오버로딩(Overloading)

## 3.4 `when` Expressions
