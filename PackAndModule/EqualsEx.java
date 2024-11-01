class Point_1 {
  private int x, y;
  public Point_1(int x, int y) {
    this.x = x; this.y = y;
  }
public boolean equals(Object obj) {
  Point_1 p = (Point_1)obj;
    if(x == p.x && y == p.y) 
      return true;
    else 
      return false;
  }
}

public class EqualsEx {
  public static void main(String[] args) {
    Point a = new Point(2,3);
    Point b = new Point(2,3);
    Point c = new Point(3,4);
    if(a == b) // false
      System.out.println("a==b");
    if(a.equals(b)) // true
      System.out.println("a is equal to b");
    if(a.equals(c)) // false
      System.out.println("a is equal to c");
  }
}
