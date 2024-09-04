package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("안녕하세요");
        a.add("반갑습니다");
        a.add("자바");
        a.add(2, "c언어");

        System.out.println(a.get(1));
        System.out.println(a.size());
        System.out.println(a.remove(2) + " 삭제하겠습니다");
    }
}

