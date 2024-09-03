import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2, 100);
        System.out.println("백터 내의 요소 객체수 : " + v.size());
        System.out.println("백터의 현재 용량 : " +v.capacity());

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
        int sum = 0;
        for (int i = 0; i < v.size(); i++) {
            sum += v.get(i);
        }
        System.out.println("백터에 있는 정수 합 : " + sum);
    }
}
