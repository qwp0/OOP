import java.util.Scanner;

public class Quiz_06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하시오>>");

        int num = Integer.parseInt(scanner.nextLine());

        if(num>=10){
            int tens = num/10;
            int units= num%10;
            if(tens%3==0 && units%3==0){
                System.out.println("박수짝짝");
            }
            else if(tens%3==0||units%3==0){
                System.out.println("박수짝");
            }
            else{
                System.out.println("3,6,9를 포함하고 있지 않습니다.");
            }
        }
        else if(num<10){
            int units = num%10;
            if(units%3==0){
                System.out.println("박수짝");
            }
            else{
                System.out.println("3,6,9를 포함하고 있지 않습니다.");
            }
        }
    }
}
