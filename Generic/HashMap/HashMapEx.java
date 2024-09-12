package HashMap;

import java.util.HashMap;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("apple", "사과"); // key: apple value: 사과
        hashMap.put("banana", "바나나"); // key: banana value: 바나나
        hashMap.put("lemon", "레몬"); // key : 레몬 value: 레몬

        String kor = hashMap.get("apple");
        String kor2 = hashMap.get("banana");
        String kor3 = hashMap.get("lemon");

        System.out.println(kor);
        System.out.println(kor2);
        System.out.println(kor3);
    }
}

