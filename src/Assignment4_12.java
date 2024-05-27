import java.util.Scanner;

class Seat{
    private String seat[];

    public Seat(){
        seat = new String[10];
        for(int i = 0; i < seat.length; i++){
            seat[i] = "---";
        }
    }
    public void print() {
        for (int i = 0; i < seat.length; i++) {
            System.out.print(seat[i] + " ");
        }
        System.out.println();
    }
    public boolean setSeat(String name,int num){
        if (num < 1 || num > seat.length) {
            System.out.println("좌석의 범위가 1-10 사이가 아닙니다.");
            return false;
        }
        if (!"---".equals(seat[num - 1])) {
            System.out.println("이미 예약된 좌석입니다.");
            return false;
        }
        seat[num - 1] = name;
        return true;
    }
    public boolean cancelCheck(String name){
        for(int i=0; i<seat.length; i++) {
            if(name.equals(seat[i])) {
                seat[i] = "---";
                return true;
            }
        }
        return false;
    }
}
class ReserveApp {
    Scanner scanner = new Scanner(System.in);
    private Seat[] s;
    private String[] seatType = {"S", "A", "B"};

    public ReserveApp() {
        s = new Seat[3];
        for (int i = 0; i < s.length; i++) {
            s[i] = new Seat();
        }
    }

    public void run() {
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        while (true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            int category = scanner.nextInt();
            switch (category) {
                case 1:
                    reserve();
                    break;
                case 2:
                    check();
                    break;
                case 3:
                    cancel();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("다시 입력해주세요.");
            }
        }
    }

    public boolean reserve() {
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        int type = scanner.nextInt();
        if (type < 1 || type > s.length) {
            System.out.println("잘못된 좌석 구분입니다. 1, 2, 3 중에서 선택해야 합니다.");
            return false;
        }
        System.out.print(seatType[type - 1] + ">> ");
        s[type - 1].print();
        System.out.print("이름>>");
        String name = scanner.next();
        System.out.print("번호>>");
        int num = scanner.nextInt();
        s[type-1].setSeat(name, num);
        return true;
    }

    public void check() {
        for (int i = 0; i < s.length; i++) {
            System.out.print(seatType[i] + ">> ");
            s[i].print();
        }
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }

    public boolean cancel() {
        System.out.print("좌석 S:1, A:2, B:3>>");
        int type = scanner.nextInt();
        if (type < 1 || type > s.length) {
            System.out.println("잘못된 좌석 구분입니다. 1, 2, 3 중에서 선택해야 합니다.");
            return false;
        }
        System.out.print(seatType[type - 1] + ">> ");
        s[type - 1].print();

        System.out.print("이름>>");
        String name = scanner.next();

        boolean result = s[type - 1].cancelCheck(name);

        if (result == true) {
            System.out.println("<<<취소를 완료하였습니다.>>>");
        } else {
            System.out.println("존재하지 않는 정보입니다.");
        }
        return true;
    }
}

public class Assignment4_12 {
    public static void main(String args[]){
        ReserveApp ra = new ReserveApp();
        ra.run();
    }
}
