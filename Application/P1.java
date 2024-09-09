package Application;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class P1 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수(-1이 입력될 때가지)>> ");
        while (true) {
            int input = scanner.nextInt();
            vector.add(input);
            if (input == -1) {
                break;
            } //if end
        }// while end
        System.out.println("가장 큰 수는 " + Collections.max(vector));
    }
}

