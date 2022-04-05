#### 🤔 문제 설명

- 매개 변수로받은 `list`(lst)에서 가장 큰 값과 가장 작은 값의 차이를 반환하는 함수 `maxDiff`를 구현해야합니다.
- `list`(lst)에는 정수가 포함되어 있으므로 음수가 포함될 수 있습니다.
- 목록이 비어 있거나 단일 요소를 포함하는 경우 0을 반환합니다.
- 목록(lst)은 정렬되지 않습니다.


#### 🎯 TestCase

```javascript
maxDiff([1, 2, 3, 4]);    //return 3, because 4 - 1 == 3
maxDiff([1, 2, 3, -4]);   //return 7, because 3 - (-4) == 7
maxDiff([ 1, 2, 3, 4, 5, 5, 4]) // return 4
maxDiff([-4, -5, -3, -1, -31])  // return 30
maxDiff([1000000])  // return 0
maxDiff([])         // return 0
```