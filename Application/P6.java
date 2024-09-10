package Generic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

class Location {
    private int gyoeng, wee;
    public Location(int gyoeng, int wee) {
        this.gyoeng = gyoeng;
        this.wee = wee;
    }
    public int getGyoeng() {
        return gyoeng;
    }
    public int getWee() {
        return wee;
    }
}
