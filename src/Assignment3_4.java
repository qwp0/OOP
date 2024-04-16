import java.util.Scanner;

public class Assignment3_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        char alphabet = scanner.next().charAt(0);
        int num = (int)alphabet;
        int numCopy = num;

        for(int i = 0;i<=num-97;i++){
            for(int j = 97;j<=numCopy;j++) {
                System.out.print((char)j);
            }
            numCopy--;
            System.out.println();
        }
    }

}
