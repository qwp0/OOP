import java.util.Scanner;

public class Assignment3_16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        String str[] = {"가위", "바위", "보"};
        String result="";

        while(true){
            System.out.print("가위 바위 보!>>");
            String user = scanner.next();
            int n = (int)(Math.random()*3);
            if(str[n].equals(user)){
                System.out.println("사용자 = "+ user +" , 컴퓨터 = "+ str[n] +", 비겼습니다.");
            }
            if(user.equals("그만")){
                System.out.println("게임을 종료합니다...");
                break;
            }
            else if(!str[n].equals(user)){
                switch (user){
                    case "가위":
                        result = (n==1?", 사용자가 졌습니다." : ", 사용자가 이겼습니다.");
                        break;
                    case "바위":
                        result = (n==2?", 사용자가 졌습니다." : ", 사용자가 이겼습니다.");
                        break;
                    case "보":
                        result = (n==0?", 사용자가 졌습니다." : ", 사용자가 이겼습니다.");
                        break;
                }
                System.out.println("사용자 = "+ user +" , 컴퓨터 = "+ str[n] + result );
            }
        }
    }
}
