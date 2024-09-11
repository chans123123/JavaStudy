import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<String, Double> hashMap = new HashMap<>();
        System.out.println("미래장학금관리시스템입니다.");
        for (int i = 0; i < 5; i++) {
            System.out.print("이름과 학점>> ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            Double avg = Double.parseDouble(st.nextToken());
            hashMap.put(name, avg);
        }
        System.out.print("장학생 선발 학점 기준 입력>> ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double standard = Double.parseDouble(st.nextToken());
        System.out.print("장학생 명단 : ");
        Set<String> keys = hashMap.keySet();
        for (String name : keys) {
            double score = hashMap.get(name);
            if (score > standard) {
                System.out.print(name + " ");
            }
        }
    }
}
