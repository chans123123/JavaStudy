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
