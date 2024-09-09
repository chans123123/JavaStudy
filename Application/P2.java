package Application;

import java.util.ArrayList;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
        double total_score = 0;
        for (int i = 0; i < 6; i++) {
            String score = scanner.next();
            arrayList.add(score);
            if (score.equals("A") || score.equals("a")) {
                total_score += 4.0;
            } else if (score.equals("B") || score.equals("b")) {
                total_score += 3.0;
            } else if (score.equals("C") || score.equals("c")) {
                total_score += 2.0;
            } else if (score.equals("D") || score.equals("d")) {
                total_score += 1.0;
            } else if (score.equals("F") || score.equals("f")) {
                total_score += 0.0;
            }
