package Ptactice;

import java.util.Iterator;
import java.util.Vector;

public class P9 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        for (int i = 0; i < 5; i++) {
            vector.add(i);
        }
        Iterator<Integer> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }
}

