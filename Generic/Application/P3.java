package Application;

import java.util.HashMap;
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("나라 이름, 인구>> ");
            String nation = scanner.next();
            if (nation.equals("그만")) {
                break;
            }
            int population = scanner.nextInt();
            hashMap.put(nation, population);
        } // while end
        while (true) {
            System.out.print("인구 검색>> ");
            String nation = scanner.next();
            if (nation.equals("그만")) {
                break;
            }
            if (hashMap.get(nation) == null) {
                System.out.println(nation + " 나라는 없습니다.");
            }
            else {
                System.out.println(nation + "의 인구는 " + hashMap.get(nation));
            }
        }//while end
    }
}
