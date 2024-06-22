import java.util.ArrayList;
import java.util.Scanner;

public class Assignment7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>> ");

        ArrayList<Character> grades = new ArrayList<Character>();
        double sum = 0;

        for (int i = 0; i < 6; i++) {
            grades.add(scanner.next().charAt(0));
        }

        for (int i = 0; i < grades.size(); i++) {
            switch (grades.get(i)) {
                case 'A':
                    sum += 4.0;
                    break;
                case 'B':
                    sum += 3.0;
                    break;
                case 'C':
                    sum += 2.0;
                    break;
                case 'D':
                    sum += 1.0;
                    break;
                case 'F':
                    sum += 0;
                    break;
                default:
                    System.out.println("Invalid grade: " + grades.get(i));
                    break;
            }
        }

        double result = sum / grades.size();
        System.out.println("평균: " + result);
    }
}