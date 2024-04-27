## 자바 프로그램의 구조
- 클래스
    - class 키워드로 선언
  ```java
  public class Hello{
  }
  ```
- main() 메소드
    - 자바 프로그램은 main() 메소드에서부터 실행 시작
    - 한 클래스에는 2개 이상의 main()을 작성하면 안됨
    - String[] args로 실행 인자를 전달 받음
  ```java
  public static void main(String[] args){
  }
  ```
- 메소드
    - 클래스의 멤버 함수
    - static 키워드를 사용하면 객체 생성 전부터 호출 가능
  ```java
  //sum 메소드
  public static int sum(int n, int m){
  	return n + m;
  }
  //호출
  int i = 20;
  s = sum(i,10);
  ```
- 변수 선언
    - 변수의 타입과 변수의 이름 선언
    - 메소드 내에서 선언된 변수는 지역 변수
        - 지역 변수는 메소드 실행이 끝나면 자동 소멸
  ```java
  int i = 20; //선언과 동시에 초기화
  char a;
  ```
- 문장
    - 자바 컴파일러는 ';'를 문장의 끝으로 인식
- 화면 출력
    - 표준 출력 스트림(System.out)에 메시지 출력
  ```java
  System.out.println("Hello");
  ```
## 식별자
`식별자`란 클래스, 변수, 상수, 메소드 등에 붙이는 이름을 말한다.
### 식별자 이름 규칙
- 특수 문자, 공백 또는 탭을 식별자로 사용할 수 없지만 '_','$'는 사용 가능
- 한글 사용 가능
- if, while, class 등 자바 언어의 키워드는 식별자로 사용 불가
- 숫자는 식별자의 첫 번째 문자로 사용 불가
- true, false, null 은 자바의 키워드이므로 식별자로 사용 불가
- 대소문자 구별
- 길이 제한 없음
```java
//사용 가능
int name;
char student_ID;                 //'_'사용 가능
void $func(){}                   //'$'사용 가능
class Monster3{}                 //숫자 사용 가능
int whatsyournamemynameiskitae;  //길이 제한 없음
int barChart; int barchart;      //대소문자 구분
int 가격;                         //한글 이름 사용 가능

//잘못된 예
int 3Chapter;  //식별자의 첫문자로 숫자 사용 불가
class if{}     //예약어 if 사용 불가
char false;    //예약어 false 사용 불가
void null(){}  //예약어 null 사용 불가
class %calc{}  //'%'특수문자 사용 불가
```
> `자바의 키워드` 란 자바에서 이미 용도가 정해진 것으로 예약어라고도 하며, 식별자의 이름으로 사용할 수 없다.

### 좋은 이름 붙이는 관습
- 가독성 높른 리흠
- 클래스 이름의 첫 번째 문자는 대문자로 시작, 각 단어의 첫 번째 문자만 대문자러 시작
- 변수, 메소드 이름은 첫 단어는 소문자로 표기하고 이후 단어의 첫 번째 문자만 대문자로 시작
- 상수 이름은 모든 문자를 대문자로 표시

## 자바의 데이터 타입
`데이터 타입`이란 자바에서 다룰 수 있는 데이터의 종류를 말한다.
- 기본 타입 : 8개
    - boolean,char,byte,short,int,long,float,double
- 레퍼런스 타입 : 1개
    - 래퍼런스 타입은 한 개이지만 용도는 3가지이다
        - 배열에 대한 레퍼런스
        - 클래스에 대한 레퍼런스
        - 인터페이스에 대한 레퍼런스
### 자바의 기본 타입
자바의 기본 타입은 크기가 정해져 있고 CPU나 운영체제에 따라 변하지 않는다.
![](https://velog.velcdn.com/images/qwp_o_/post/1824d74b-c463-40ec-87d9-a79e9b9e765c/image.png)

- unsigned가 없음
- 문자열은 자바의 기본 타입에 속하지 않음

### 문자열
JDK에서 제공하는 `String 클래스`로 문자열을 표현한다.
```java
String string = "래퍼런스타입";
```
문자열과 기본 타입의 + 연산이 실행되면 기본 타입의 값을 문자열로 바꾸어 연결된 새로운 문자열을 만든다.

### 변수와 선언
`변수`는 프로그램 실행 중에 데이터를 저장하기 위한 공간이다.
데이터 타입과 변수 이름으로 변수를 선언함(ex. `int price;`)

### 리터럴
`리터럴`은 프로그램에서 직접 표현한 값으로 정수, 실수, 문자, 논리, 문자열 리터럴이 있다.
- 정수 리터럴
    - 10진수, 8진수, 16진수, 2진수 리터럴
  ```java
  int n = 15;     //10진수
  int m = 015;    //8진수 -> 13
  int k = 0x15;   //16진수 -> 21
  int b = 0b0101; //2진수 -> 5
  ```
    - 정수 리터럴은 int 타입으로 컴파일된다.
    - long 타입으로 지정하려면 숫자 뒤에 l 또는 L을 붙여 표시(ex. `long g = 24L`)

- 실수 리터럴
    - 실수 리터럴은 double 타입으로 컴파일된다.
    - 숫자 뒤에 f나 F를 붙이면 float, d나 D를 붙이면 double 타입으로 강제 변환할 수 있다.
  ```java
  float f = 0.1234f; //f = 0.1234로 하면 컴파일 오류
  double w = .1234D; //.1234D와 .1234는 동일
  ```
- 문자 리터럴
    - ''로 문자 표현
      `'w', 'A', '가', '3', '글' `
    - \u 다음에 2바이트의 유니코드(16진수 4자리 = 4bit * 4 = 2byte)
        - \u0041 -> 문자 'A'의 유니코드
    - 특수문자 리터럴
        - 백슬래시(\) 다음에 특수 기호를 붙여서 표현

- 논리 리터럴
    - 논리 리터럴은 true, false 2개 뿐이다.
    - boolean 타입 변수에 치환하거나 조건문에 이용한다.
    - 자바에서는 1,0을 참,거짓으로 사용 불가능

- 기본 타입 이외의 리터럴
    - null 리터럴 : 기본 타입에 사용될 수 없고 객체 레퍼런스에 대입된다.
  ```java
  int n = null   //오류. 기본 타입에 사용 불가
   String str = null // 현재 str이 아무것도 가리키지 않고 있다는 의미, 비트가 다 0으로 세팅
  ```
    - 문자열 리터럴 : ""로 문자열 표현하며 String 객체로 자동 처리된다.

> - JDK7부터 숫자에 '_' 허용해서 가독성 높임
    하지만 아래와 같은 경우에는 허용 안됨
    ```java
    int x = 15_;                   //리터럴 끝에 사용한 경우  
    double pi = 3_.14;             //소수점 앞뒤에 사용한 경우
    long idNum = 981231_1234567_L; //L,F 앞에 사용한 경우
    int y = 0_x15;                 //0x 중간이나 끝에 사용한 경우
    ```
- var 키워드를 사용하여 변수 타입 생략
    - 지역 변수를 선언에만 사용할 수 있다.
    - 변수 타입 선언을 생략 -> 컴파일러가 변수 타입 추론
  ```java
  var price = 200;         //price는 int 타입으로 결정
  var pi = 3.14;           //pi는 double 타입으로 결정
  var point = new Point(); //point는 Point 타입으로 결정
  ```
    - 변수 선언문에 반드시 초깃값을 지정해야 한다.
  ```java
  var name;  //컴파일 오류. 변수 name의 타입을 추론할 수 없음
  ```

### 상수
- final 키워드를 사용해서 선언
- 선언 시 초기값을 지정
    - 초기화하지 않고 선언만 한 경우도 있을 수 있음
- 실행 중 값 변경 불가(할당을 한 번만 할 수 있음)
```java
final double PI = 3.141592;
```
> final 키워드의 사용 유무와 상관 없이 지역 변수의 경우, 초기화하지 않고 사용하면 컴파일 에러가 난다.
```java
int a;
b = a + 3;  // 초기화하지 않은 변수 사용
```

### 타입 변환
#### 자동 타입 변환
치환문(=)이나 수식 내에서 타입이 일치하지 않을 때, 컴파일러가 작은 타입을 큰 타입으로 자동 변환한다.

byte -> short -> int -> long -> float ->double

> - int 보다 작은 타입은 연산하면 int로 자동형변환 후 계산된다(리턴 타입 int)
```java
short s1 = 10;
short s2 = 20;
short s3 = s1 + s2;  // 컴파일 에러. int를 short에 할당하니깐 컴파일 에러가 남.
```
- byte에서 char로는 자동형변환이 불가능해 강제형변환을 해줘야한다.
```java
byte b;
char c;
(char)b + c;
```
- byte 타입의 범위 내에서는 형변환 연산자 없이 byte 타입에 int형 저장이 가능하다.
```java
byte b = 10;   //문제 발생하지 않음   
byte b = 128;  //컴파일 에러
//변수가 들어가면 허용하지 않는다. 변수는 값이 아닌 타입으로만 바라봐서 강제형변환을 해줘야함
int a = 10;
byte b = a;    //컴파일 에러
```


#### 강제 타입 변환(casting)
자동 타입 변환이 안되는 경우로 큰 타입이 작은타입으로 변환할 때 사용한다.
-> 값의 손실이 일어날 수 있음
```java
int n = 300;
byte b = n ;  //컴파일 오류. int 타입이 byte로 자동 변환 안됨
byte b = (byte)n;  //손실 생김

double d = 1.9;
int n = (int)d;  //n = 1. 강제 타입 변환으로 소숫점 이하 0.9 손실
```
> 타입 변환 예제
```java
public class TypeConversion{
	public static void main(String[] args){
    	byte b = 127;
        int i = 100;
        System.out.println(b + i);
        System.out.println(10 / 4);
        System.out.println(10.0 / 4);
        System.out.println((char)0x12340041);
        System.out.println((byte)(b + i));
        System.out.println((int)2.9 + 1.8);
        System.out.println((int)(2.9 + 1.8));
        System.out.println((int)2.9 + (int)1.8);
    }
}
```
결과
227
2
2.5
A
-29
3.8
4
3

## 자바에서 키 입력
`System.in` : 키보드로부터 직접 읽는 자바의 표준 입력 스트림으로 키 값을 바이트로 리턴한다.
이때 키 값을 바이트 데이터로 넘겨줘서 응용프로그램이 문자 정보로 변환해야한다는 문제점 존재
![](https://velog.velcdn.com/images/qwp_o_/post/4b94d679-6d45-40ab-bd86-e6aff3bb8596/image.png)

### Scanner를 이용한 키 입력
`java.util.Scanner 클래스!` : System.in에서 읽은 바이트를 문자, 정수, 실수, 불린, 문자열 등 사용자가 원하는 타입으로 변환하여 리턴해주는 클래스
![](https://velog.velcdn.com/images/qwp_o_/post/71c44943-161e-4c77-8000-7be6a1fac1fe/image.png)


- 객체 생성

  ```java
  import java.util.Scanner
  ...
  Scanner a = new Scanner(System.in)  //Scanner 객체 생성
  ```
- 키 입력 받기
  ![](https://velog.velcdn.com/images/qwp_o_/post/248e2420-023c-485e-b73d-8edc98a6f2cd/image.png)
1. Scanner는 입력되는 키 값을 공백으로 구분되는 아이템 단위로 읽음
2. Enter 치면 Scanner로 들어감
3. 개발자가 원하는 다양한 타입의 값으로 변환

- 주요 메서드
  ![](https://velog.velcdn.com/images/qwp_o_/post/6bac13cf-4853-413c-bbd8-2663bbe4b254/image.png)

  ```java
  while(scanner.hasNext()){ 
  //hasNext 메소드 blocking 되어있다가 엔터치면 풀리고 true 리턴
      scanner.next();
  }
  ```

## 연산

예제 위주로 공부해보자.
`/와 % 산술 연산자`
```java
//초 단위의 정수를 입력받고 몇 시간, 몇 분, 몇 초인지 출력하는 프로그램
import java.util.Scanner;

public class ArithmeticOperator{
	public static void main(String[] args){
 		Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요:");
        int time = scanner.nextInt();
        int second = time % 60;
        int minute = (time / 60) % 60;
        int hour = (time / 60) / 60;
        
        System.out.print(time + "초는 ");
        System.out.print(hour + "시간, ");
        System.out.print(minute + "분, ");
        System.out.print(second + "초입니다.");
        
        scanner.close();
    }
}
```

`증감 연산자`

```java
public class ArithmeticDecOperator{
	public static void main(String[] args){
 		int a = 3, b = 3, c =3;
        int d = 3;
        
        a = d++;  //a = 3, d = 4
        a = ++d;  //a = 5, d= 5
        a = d--;  //a = 5, d = 4
        a = --d;  //a = 3, d = 3
    }
}
```
`비교 연산과 논리 연산`
```java
//나이가 20대인 경우
(age >= 20) && (age < 30)
20 <= age < 30 //오류가 난다.
```

### 비트 연산
```java
byte x = 10;
```

<img src="https://velog.velcdn.com/images/qwp_o_/post/45968afc-a2b3-4385-8f75-c99d9cebe148/image.png" width="300">

- 논리 연산(AND, OR, XOR, NOT)
  <img src="https://velog.velcdn.com/images/qwp_o_/post/9fb8fd76-308c-4256-b423-8daf7e554ac5/image.png" width="600">
  응용 예제
  <img src="https://velog.velcdn.com/images/qwp_o_/post/092e6d98-2580-44b4-ab95-08e45470eb11/image.png" width="300">

  ```java
  //냉장고에는 8개의 센서가 있고 이들은 flag 변수와 연결되어 있다고 할 때,
  //냉장고의 온도가 0도 이상 -> 비트 3이 1 
  //0도 이하 -> 비트 3이 0 유지

  byte flag = 0b00001010;  //각 비트는 8개의 센서 값을 가리킴
  if(flag & 0b00100000 == 0)
      System.out.print("온도는 0도 이하");
  else
      System.out.print("온도는 0도 이상");
  ```

- 시프트 연산
  <img src="https://velog.velcdn.com/images/qwp_o_/post/8fd0f41b-af77-4384-b520-a8cb9a382218/image.png" width="600">

![](https://velog.velcdn.com/images/qwp_o_/post/22f3e80d-e3ad-43fe-a1c3-3e692d7699f0/image.png)


## 조건문

`if문`

`switch문`
- case 문에 break문이 없으면 break를 만날 때까지 다음 case로 넘어가며 계속 실행.
- case 문의 값은 문자, 정수, 문자열 리터럴만 허용 . 실수 리터럴과 변수 사용은 허용 x

```java
switch(a){
	case a;     //오류. 변수 사용 안됨
    case a > 3:
    case a == 1;
}
```


출처 : 명품 자바 프로그래밍