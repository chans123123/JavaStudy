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
        }
