package Ptactice;

public class P12 {
    //2
    static <T> T take(T s[], int index) {
        if (index > s.length) {
            System.out.println("인덱스 범위 초과");
            return null;
        }
        return s[index];
    }
}

