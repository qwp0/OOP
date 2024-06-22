import java.util.HashMap;
import java.util.Scanner;

public class Assignment7_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("** 포인트 관리 프로그램입니다. **");
        HashMap<String, Integer> points = new HashMap<>();

        while (true) {
            System.out.print("이름과 포인트 입력 >> ");
            String name = scanner.next();
            if (name.equals("그만")) break;
            int score = scanner.nextInt();

            points.put(name, points.getOrDefault(name, 0) + score);

            for (String key : points.keySet()) {
                System.out.print("(" + key + "," + points.get(key) + ") ");
            }
            System.out.println();
        }
    }
}