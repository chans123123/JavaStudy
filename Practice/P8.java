package Ptactice;

import java.util.ArrayList;

public class P8 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(10);
        arrayList.add("Java");
        arrayList.add("C++");
        System.out.println(arrayList.size());
        arrayList.remove(arrayList.size()-1);
    }
}
