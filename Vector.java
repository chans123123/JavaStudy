import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        //integer 값만 다루는 Vector 객체 생성
        Vector<Integer> v = new Vector<>();
        //add 벡터에 값 삽입
        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2, 100); // index 2번째에 정수 100값 삽입
        System.out.println("백터 내의 요소 객체수 : " + v.size()); // size() : 백터내에 객체수
        System.out.println("백터의 현재 용량 : " +v.capacity()); //capacity() : 백터 크기

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i)); //get() : 백터내 요소 꺼냄
        }
        int sum = 0;
        for (int i = 0; i < v.size(); i++) {
            sum += v.get(i);
        }
        System.out.println("백터에 있는 정수 합 : " + sum);
    }
}
