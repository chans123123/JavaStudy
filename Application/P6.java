package Generic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

class Location {
    private int gyoeng, wee;
    public Location(int gyoeng, int wee) {
        this.gyoeng = gyoeng;
        this.wee = wee;
    }
    public int getGyoeng() {
        return gyoeng;
    }
    public int getWee() {
        return wee;
    }
}
public class P6 {
    public static void main(String[] args) throws IOException {
        System.out.println("도시, 경도, 위도를 입력하세요");
        HashMap<String, Location> hashMap = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            System.out.print(">>");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine(), ",");
            String city = st.nextToken().trim();
            int gyeong = Integer.parseInt(st.nextToken().trim());
            int wee = Integer.parseInt(st.nextToken().trim());

            Location location = new Location(gyeong, wee);
            hashMap.put(city, location);
        }//for end
        System.out.println("----------------------");
        Set<String> keys = hashMap.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String city = it.next();
            Location location = hashMap.get(city);
            System.out.println(city + " " + location.getGyoeng() + " " + location.getWee());
        } //while end
        System.out.println("--------------");
        while (true) {
            System.out.print("도시 이름 >> ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String city = br.readLine();
            Location location = hashMap.get(city);
            if (city.equals("그만")) {
                break;
            }
            if (location == null) {
                System.out.println(city + "는 없습니다.");
            }
            else
                System.out.print(city + " " + location.getGyoeng() + " " + location.getWee());
                System.out.println();
        } //while end
    }
}
