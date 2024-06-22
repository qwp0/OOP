import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Location{
    private int latitude, longitude;
    public Location(int latitude, int longitude) {this.latitude = latitude; this.longitude = longitude;}
    public void find_location(String city){System.out.println(city + " " + latitude + " " + longitude); }
}

public class Assignment7_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("도시,경도,위도를 입력하세요.");
        HashMap<String, Location> cityLocation = new HashMap<>();

        for(int i = 0; i < 4; i++){
            System.out.print(">>");
            String str = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(str, ",");
            String name = st.nextToken();
            int latitude = Integer.parseInt(st.nextToken().trim());
            int longitude = Integer.parseInt(st.nextToken().trim());
            cityLocation.put(name, new Location(latitude, longitude));
        }
        System.out.println("----------------------------------");
        Set<String> key = cityLocation.keySet();
        Iterator <String> it = key.iterator();
        while(it.hasNext()){
            String temp = it.next();
            Location s = cityLocation.get(temp);
            s.find_location(temp);
        }
        System.out.println("----------------------------------");
        while(true) {
            System.out.print("도시 이름 >> ");
            String city = scanner.next();
            if(city.equals("그만"))
                break;
            Location s = cityLocation.get(city);
            if( s == null)
                System.out.println(city+"는 없습니다.");
            else
                s.find_location(city);
        }
    }
}
