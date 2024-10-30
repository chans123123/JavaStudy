import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    public Calculator() {
        setTitle("자바 스윙 계산기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(new NorthPanel(), BorderLayout.NORTH);
        c.add(new CenterPanel(), BorderLayout.CENTER);
        c.add(new SouthPanel(), BorderLayout.SOUTH);
        setSize(330, 400);
        setVisible(true);
    }
    class NorthPanel extends JPanel {
        public NorthPanel() {
            setBackground(Color.pink);
            JLabel jLabel = new JLabel("수식");
            JTextField jTextField = new JTextField(5);
            add(jLabel);
            add(jTextField);
        }
    }
    class CenterPanel extends JPanel {
        public CenterPanel() {
            setLayout(new GridLayout(5,4,5,5));
            String[] buttonLabels = {"C", "UN", "BK", "/",
                                        "7", "8", "9", "x",
                                        "4", "5", "6", "-",
                                        "1", "2", "3", "+",
                                        "0", ".", "=", "%"};
            for (String s : buttonLabels) {
                JButton jButton = new JButton();
                jButton.setText(s);
                add(jButton);
            }
        }
    }
    class SouthPanel extends JPanel {
        public SouthPanel() {
            JLabel jLabel = new JLabel("계산결과");
            JTextField jTextField = new JTextField(10);
            add(jLabel);
            add(jTextField);
            setBackground(Color.YELLOW);
        }
    }
    public static void main (String[] args) {
        new Calculator();
    }
}
