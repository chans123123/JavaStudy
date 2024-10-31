import javax.swing.*;

public class myFrame extends JFrame {
    public myFrame() {
        setTitle("300x300");
        //setSize(300,300);
        setVisible(true);
        //setLocation(100,100);
        setBounds(100, 100, 300, 300);
    }
    public myFrame(String s) {
        setTitle(s);
        setBounds(400,400,300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        myFrame myframe = new myFrame();
        myFrame mytitle = new myFrame("두번째 윈도우");
        System.out.println("프로그램 끝");
    }
}