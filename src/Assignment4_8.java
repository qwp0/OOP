import java.util.Scanner;

class Phone{
    private String name,tel;
    public String getName(){
        return name;
    }
    public String getTel(){
        return tel;
    }
    public Phone(String name,String tel){
        this.name=name;
        this.tel=tel;
    }
}
class PhoneBook{
    private int num;
    Scanner scanner = new Scanner(System.in);
    Phone [] p;

    public void setArrNum(){
        System.out.print("인원수>>");
        this.num = scanner.nextInt();
        p = new Phone[num];
    }
    public void setInfo(){
        for(int i = 0; i < num; i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
            String name = scanner.next();
            String tel = scanner.next();
            p[i] = new Phone(name,tel);
        }
        System.out.println("저장되었습니다...");
    }
   public void search(){
        boolean isExist = false;
        while(true){
            System.out.print("검색할 이름>>");
            String searchName = scanner.next();
            if(searchName.equals("그만")){
                break;
            }
            for(int i = 0; i < num; i++){
                if(p[i].getName().equals(searchName)) {
                    isExist = true;
                    System.out.println(searchName + "의 번호는 " + p[i].getTel() + " 입니다.");
                    break;
                }
                else{
                    isExist = false;
                }
            }
            if(isExist==false){
                System.out.println(searchName+" 이 없습니다.");
            }
        }
   }
}
public class Assignment4_8 {
    public static void main(String args[]){
        PhoneBook pb = new PhoneBook();
        pb.setArrNum();
        pb.setInfo();
        pb.search();
    }
}
