package Ptactice;
import java.util.HashMap;

public class P10 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 10);
        hashMap.put("b", 11);
        System.out.println(func(hashMap));
    }

    public static int func(HashMap<String, Integer> hashMap) {
        return hashMap.size();
    }
}
