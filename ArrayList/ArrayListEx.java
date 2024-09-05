package ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            System.out.print("이름을 입력하세요>> ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            arrayList.add(name);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        int longestIndex = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(longestIndex).length() < arrayList.get(i).length()) {
                longestIndex = i;
            }
        }
        System.out.println("\n가장 긴 이름은 : " + arrayList.get(longestIndex));
    }
}
