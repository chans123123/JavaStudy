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
            setLayout(new BorderLayout());
            setBackground(Color.pink);
            JLabel jLabel = new JLabel("수식");
            add(jLabel, BorderLayout.CENTER);
            JTextField jTextField = new JTextField(5);
            add(jTextField, BorderLayout.CENTER);
            add(jLabel);
            add(jTextField);
        }
    }
    class CenterPanel extends JPanel {
        public CenterPanel() {
            setBackground(Color.WHITE);
            setLayout(new GridLayout(5,4,5,5));
            String[] buttonLabels = {"C", "UN", "BK", "/",
                                        "7", "8", "9", "x",
                                        "4", "5", "6", "-",
                                        "1", "2", "3", "+",
                                        "0", ".", "=", "%"};
            for (int i = 0; i < buttonLabels.length; i++) {
                JButton jButton = new JButton();
                jButton.setText(buttonLabels[i]);
                add(jButton);
                if (i == 18) {
                    jButton.setBackground(Color.CYAN);
                }
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
