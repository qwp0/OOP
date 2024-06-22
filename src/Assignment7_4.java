import java.util.Scanner;
import java.util.Vector;

public class Assignment7_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> precipitation= new Vector<Integer>();

        while(true){
            System.out.print("강수량 입력 (0 입력시 종료)>> ");
            int input = scanner.nextInt();
            if(input==0){
                break;
            }
            precipitation.add(input);
            int sum=0;
            for(int k : precipitation){
                sum+=k;
                System.out.print(k+" ");
            }
            System.out.println();
            System.out.println("현재 평균"+" "+sum/precipitation.size());
        }
    }
}
