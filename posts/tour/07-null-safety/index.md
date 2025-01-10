# Null safety

- Nullable types: 기본적으로 `null`을 허용하지 않는다. `null`이 필요하면 `Type?`형태로 선언한다.
- Check for null values: 조건식으로 검증한다.
- Use safe calls: `?.`, `null`로 평가되면 프로퍼티에 접근하지 못한다. 안전하게 호출하도록 돕는다.
- Use Elvis operator: `safe call`과 함께 주로 사용한다. `null`을 반환할 때 기본값을 할당한다.
