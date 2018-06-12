import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame1 extends JFrame {
    Container cp;
//    private JPanel pane = new JPanel();
    private JLabel jib = new JLabel();
    private JTextField jtf = new JTextField();
    private JButton jbtnRUN = new JButton("RUN");
    private JButton jbtnEXIT = new JButton("EXIT");
    private int data [];
    public MainFrame1(){
        ex1();
    }public void ex1() {
        this.setBounds(100, 100, 400, 300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = getContentPane();
        cp.setLayout(new GridLayout(2, 3, 1, 1));
        cp.add(jtf);
        cp.add(jib);
        cp.add(jbtnRUN);
        cp.add(jbtnEXIT);
        jbtnRUN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float v1 = Float.parseFloat(jtf.getText());
                    float v2 = Math.round((v1 * 0.621371192 * 10) / 10f);
                    jib.setText(Float.toString(v2));
                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(MainFrame1.this, "Input Error");
                }
            }
        });
        jbtnEXIT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}