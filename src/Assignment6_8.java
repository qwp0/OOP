import java.util.Scanner;

public class Assignment6_8 {
    public static void main(String args[]){
        System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for(int i = 0; i <input.length(); i++){
            input = input.substring(1,input.length())+input.charAt(0);
            System.out.println(input);
        }
    }
}
