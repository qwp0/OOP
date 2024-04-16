import java.util.Scanner;

public class Assignment1_12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("연산>>");

        int num1 = scanner.nextInt();
        String operator = scanner.next();
        int num2 = scanner.nextInt();
        int result=0;

        //java 에서 문자열 비교는 equals() 메서드 사용해야 함
        if(operator.equals("/") && num2 == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        else {
            switch(operator) {
                case "+":
                    result=num1+num2;
                    break;
                case "-":
                    result=num1-num2;
                    break;
                case "*":
                    result=num1*num2;
                    break;
                case "/":
                    result=num1/num2;
                    break;
            }
            System.out.println(num1+operator+num2+"의 계산 결과는 "+result);
        }
    }
}
