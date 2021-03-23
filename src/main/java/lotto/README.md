# Step2 - 로또(자동)

---

## 기능 요구사항

- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
- 로또 1장의 가격은 1000원이다.

```
구입금액을 입력해 주세요.
14000
14개를 구매했습니다.
[8, 21, 23, 41, 42, 43]
[3, 5, 11, 16, 32, 38]
[7, 11, 16, 35, 36, 44]
[1, 8, 11, 31, 41, 42]
[13, 14, 16, 38, 42, 45]
[7, 11, 30, 40, 42, 43]
[2, 13, 22, 32, 38, 45]
[23, 25, 33, 36, 39, 41]
[1, 3, 5, 14, 22, 45]
[5, 9, 38, 41, 43, 44]
[2, 8, 9, 18, 19, 21]
[13, 14, 18, 21, 23, 35]
[17, 21, 29, 37, 42, 45]
[3, 8, 27, 30, 35, 44]

지난 주 당첨 번호를 입력해 주세요.
1, 2, 3, 4, 5, 6

당첨 통계
---------
3개 일치 (5000원)- 1개
4개 일치 (50000원)- 0개
5개 일치 (1500000원)- 0개
6개 일치 (2000000000원)- 0개
총 수익률은 0.35입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)
```

### 힌트

- 로또 자동 생성은 Collections.shuffle() 메소드 활용한다.
- Collections.sort() 메소드를 활용해 정렬 가능하다.
- ArrayList의 contains() 메소드를 활용하면 어떤 값이 존재하는지 유무를 판단할 수 있다.

## 구현 기능 목록

### view

1. InputView
    - 구입 금액을 입력받는다.
    - 당첨 번호를 입력받는다.
2. ResultView
    - 로또 번호들을 출력한다.
    - 당첨 통계를 출력한다.
    - 총 수익률을 출력한다.

### domain

- 로또 번호
    - 1 ~ 45의 값을 가진다.
        - 그 외의 값을 생성하려고 할 경우, 예외를 던진다.
- 로또 티켓
    - 6개의 로또 번호를 가진다.
        - 각 번호는 중복되면 안 된다.
    - 로또 번호를 오름차순으로 반환한다
    - 당첨 번호를 입력받아 몇 개를 포함하는지 반환한다
- 로또 상점
    - 로또 티켓 1장의 가격을 가진다.
    - 입력한 금액에 맞는 로또 티켓들을 반환한다.
- 로또 판별기
    - 6개의 당첨 번호를 가진다.
    - 로또 티켓들과 일치하는 개수를 입력받아 해당하는 티켓의 개수를 반환한다.
    - 수익률을 계산한다.