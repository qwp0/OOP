## 반복문

### for문
- 주로 처음부터 반복 횟수 알 수 있는 경우에 이용
  ```java
  //기본 형태
  for(i = 0; i < 10; i++){
      System.out.print(i); //0에서 9까지 출력
  }
  //특이한 형태
  for(초기작업; true; 반복 후 작업){ //반복 조건이 true이면 무한 반복
  ...
  }
  for(초기작업;; 반복 후 작업){ //반복 조건이 비어있으면 컴파일러가 true로 간주, 무한 반복
  ...
  }
  ```
  > `for-each문`(향상된 for문)
  배열이나 나열(enumeration)의 각 원소를 순차적으로 접근하는데 유용한 for문으로 읽기 전용이다.
  아래 예제는 배열을 이해한 후 읽어보자.
  ```java
  int[] num = {1,2,3,4,5};
  int sum = 0;
  for(int k : num){ //int는 num배열의 요소의 타입. 반복할 때마다 k는 num[0],num[1],.num[4] 값으로 설정된다.
  	sum += k;
  }
  System.out.print("합은" + sum);
  
  ```



### while문
- 반복 횟수를 알 수 없는 경우에 적합
- 반복 조건이 없으면 컴파일 오류
  ```java
  //기본 형태
  int i = 0;
  while(i < 10){
      System.out.print(i);
      i++;
  }
  ```

### do-while문
- 무조건 최소 한 번 작업문 실행
  ```java
  int i = 0;
  do{
      System.out.print(i);
      i++;
  }while(i < 10)
  ```

### 중첩 반복

- 반복문이 다른 반복문을 내포하는 구조
- 레이블을 사용해서 제어 가능하다.
  ```java
  LABEl이름 :
  for(){
  	for(){
    	continue LABEL이름;
    }
  }
  ```
> `continue문`
반복문을 빠져나가지 않으면서 다음 반복으로 진행
`break문`
반복문 하나를 완전히 빠져 나갈 때 사용하며 하나의 반복문만 벗어난다.

## 배열
`배열`이란 인덱스와 인덱스에 대응하는 데이터로 이루어진 자료구조로서, 같은 타입의 데이터들이 순차적으로 저장된다.

### 배열 선언 및 생성
배열을 생성하면 객체가 만들어지고 그 안에 배열이 생긴다. 객체는 heap에 생성되고 모든 비트가 0으로 채워진다.(래퍼런스 타입은 null)

1. 선언
```java
int intArray [];
int [] intArray;  
```
2. 생성
```java
intArray = new int[10];
char charArray[] = new char[20];
```
3. 선언과 함께 초기화
```java
int intArray[] = {0,1,2,3,4,5,6,7,8,9}; //초기화된 값의 개수만큼의 배열 생성(new가 아닌 리터럴로 초기화 가능)
```
- 초기화 전에 배열을 인덱스 이용해서 출력하면 기본타입은 0, 래퍼런스타입은 null이 출력됨
> 선언 시 배열의 크기를 지정하면 안됨
```java
int intArray[10];   //컴파일 오류
```
### 배열의 인덱스와 원소 접근
- 인덱스의 범위를 잘못 쓰면 실행 오류 발생
```java
int[] intArray = new int[5];
n = intArray[-2] //실행 오류. 인덱스로 음수 사용 불가능
n = intArray[5]  //실행 오류. 인덱스 범위 초과
```
- 원소에 접근할 때 반드시 배열 생성 후에 접근해야 함
```java
int[] intArray;
intArray[1] = 8;  //실행 오류. 메모리에 배열 생성 전, 생성되지 않은 배열 사용
```
### 레퍼런스 치환과 배열 공유
하나의 배열을 다수의 레퍼런스가 참조 가능하다.
![](https://velog.velcdn.com/images/qwp_o_/post/e0c1da7c-e3ed-43c6-a7c0-f84311b5a156/image.png)

```java
// 흐름 살펴보는 예제. 실제 코드와는 다름
int[] f(int[] b){
	b[1] = 2;
    return b;
}
int[] a;
a = new int[3];
int[] c = f(a);
System.out.print(a[1]);    //2 출력
System.out.print(c[1]);    //2 출력
```
- 배열의 크기, length 필드
  자바에서는 배열을 객체로 관리하고 배열 객체 내에는 배열의 저장 공간과 함께 배열의 크기 값을 가진 length 필드가 존재한다.
```java
int[] intArray;
intArray = new int[5];

int size = intArray.length;  //5
```

## 다차원 배열
### 2차원 배열

![](https://velog.velcdn.com/images/qwp_o_/post/a80e0f90-e58c-4ff3-b4c8-99b1a4f91a33/image.png)
i.length -> 2차원 배열의 행의 개수
i[0].length -> 0번째 행에 있는 열의 개수
i[1].length -> 1번째 행에 있는 열의 개수

```java
//선언과 함께 초기화
int intArray[][] = {{0,1,2},{3,4,5},{6,7,8}}; // 3*3 배열 생성
```
#### 정방형 배열
- 각 행의 열의 개수가 같은 배열
  ![](https://velog.velcdn.com/images/qwp_o_/post/9d99a9a1-14f9-494c-892a-e3badba49469/image.png)

#### 비정방형 배열
- 각 행의 열의 개수가 다른 배열
- 2차원 배열을 만들 때, 각 행에 따로 배열을 생성해주면 비정방향 배열을 만들 수 있음
  ![](https://velog.velcdn.com/images/qwp_o_/post/bae25351-03a9-43e0-a270-adc87db683e5/image.png)
  ```java
  int[][] intArray = new int[3][];  //null로 세팅해놓음
  intArray[0] = new int[1];
  intArray[1] = new int[2];
  intArray[2] = new int[3];
  ```
## main() 메소드
### main() 메소드의 특징
```java
public static void main(String[] args){
...
}
```
- 자바 응용프로그램의 실행 시작 메소드
- public 속성
- static 속성
- 리턴 타입 void
- 문자열 배열이 매개변수로 전달됨

### main 메소드의 매개변수
명령행 인자들이 main() 메소드의 매개변수로 전달된다.
`C:\> java Hello abc 3 5.7`
인자들이 각각 문자열로 만들어지고 문자열 배열에 저장
-> 문자열 배열에 대한 래퍼런스가 args에 전달됨
  ```java
  //Hello 클래스 안의 main
  public static void main(String[] args){
  	String a = args[0];  // a는 "abc"
    String b = args[1];  // b는 "3"
    String c = args[2];  // c는 "5.7"
    args.length;  //3
  }
  ```

## 자바의 예외 처리
`예외(Exception)`란 오동작이나 결과에 악영향을 미칠 수 있는 실행 중 발생한 오류를 말한다.(제어 가능)
실행 중 발생한 오류에는 예외가 아닌 오류도 존재한다.

### 예외의 전파 과정
1. Jvm이 에러 인지(에러 정보를 담은 데이터 생성됨)
2. 에러 발생한 함수로 에러 전달되고 함수가 비정상 종료되며, 리턴 값 대신 에러 데이터를 건네줌
3. main 함수에 에러 데이터 전달되면 main 함수도 비정상 종료되고 에러데이터를 다시 JVM에 전달
4. JVM이 프로그램이 비정상 종료되었다는 걸 파악하고 사용자에게 에러 뿌려줌

### try-catch-finally 문
예외처리를 할 때 if문으로 예외 상황 예방하는 코드를 추가할 수 있지만 if문이 많아짐에 따라 가독성이 떨어진다.
`try-catch-finally 문` 은 예외가 발생하면 사후처리하는 코드로 가독성 측면에서 더 낫다.
```java
try{
      예외가 발생할 가능성이 있는 실행문 (try 블록)
}
catch(처리할 예외 타입 선언){ // catch 블록은 여러개 올 수 있음
      예외 처리문(catch 블록)
//catch가 실행되면 전달되던 예외 데이터가 없어져 강제종료가 아닌 정상종료가 가능해짐
finally{ // 예외 처리 때문에 추가된 코드
      예외 발생 여부와 상관없이 무조건 실행되는 문장

//catch문에 return문이 있어도 finally{..} 를 실행 후에 catch 블록내의 리턴문 수행
//catch문이 여러개일 때 중복된 부분이나 예외발생과 상관없이 균일하게 하는 작업
}


```
### 자바의 예외 클래스
- 자주 발생하는 예외
  ![](https://velog.velcdn.com/images/qwp_o_/post/c8a59103-1766-48bd-b157-1bf714ea4521/image.png)


### 예외 처리 예시코드
- 0으로 나눌 때 (ArithmeticException)
```java
import java.util.Scanner;

public class DevideByZeroHandling {
	public static void main(String[] args) { 
    	Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.print("나뉨수를 입력하시오:");
			int dividend = scanner.nextInt(); // 나뉨수 입력 
            System.out.print("나눗수를 입력하시오:");
			int divisor = scanner.nextInt(); // 나눗수 입력
			try{
				System.out.println(dividend + "를 " + divisor + 
                "로 나누면 몫은 " + dividend/divisor + "입니다.");
				break; // 정상적인 나누기 완료 후 while 벗어나기
			}
            // ArithmeticException 예외 처리 코드
			catch(ArithmeticException e) { 
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요");
            }
		}
		scanner.close();
	}
}
```
- 범위를 벗어난 배열의 접근 (ArrayIndexOutOfBoundsException)
```java
public class ArrayException {
	public static void main (String[] args) {
    	int[] intArray = new int[5];    
        intArray[0] = 0;
		try {
			for (int i=0; i<5; i++) { 
            	intArray[i+1] = i+1 + intArray[i];
				System.out.println("intArray["+i+"]"+"="+intArray[i]); 
        	}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다."); 
       }
	} 
}
```
- 입력 오류 시 발생하는 예외 (InputMismatchException)
```java
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("정수 3개를 입력하세요"); 
		int sum=0, n=0;
		
		for(int i=0; i<3; i++) {
			System.out.print(i+">>");
			try {
				n = scanner.nextInt(); // 정수 입력 -> 사용자가 문자를 입력하면 예외 발생
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!"); 
				scanner.next(); // 입력 스트림에 있는 정수가 아닌 토큰을 버린다.(입력 스트림에서 다음 토큰을 읽어서 소비)
				i--;// 인덱스가 증가하지 않도록 미리 감소
				continue; // 다음 루프
			}
			sum += n; // 합하기 
		}
		System.out.println("합은 " + sum);
		scanner.close(); 
	}
}
```
- 정수가 아닌 문자열을 정수로 변환할 때 예외 발생(NumberFormatException)
```java
public class NumException {
	public static void main (String[] args) {
		String[] stringNumber = {"23", "12", "3.141592", "998"};
		
		int i=0;
		try {
			for (i=0; i<stringNumber.length; i++){
				int j = Integer.parseInt(stringNumber[i]); 
				//“3.141592”를 정수로 변환할 때 NumberFormatException 예외 발생
				System.out.println("숫자로 변환된 값은 " + j); 
			}
		}
		catch (NumberFormatException e) {
			System.out.println(stringNumber[i] + "는 정수로 변환할 수 없습니다."); 
		}
	} 
}
```

출처 : 명품 자바 프로그래밍