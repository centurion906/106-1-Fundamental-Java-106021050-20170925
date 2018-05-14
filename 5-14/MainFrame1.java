import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame1 extends JFrame {
    private JButton jbtunadd0 = new JButton("0");
    private JButton jbtunadd1 = new JButton("1");
    private JButton jbtunadd2 = new JButton("2");
    private JButton jbtunadd3 = new JButton("3");
    private JButton jbtunadd4 = new JButton("4");
    private JButton jbtunadd5 = new JButton("5");
    private JButton jbtunadd6 = new JButton("6");
    private JButton jbtunadd7 = new JButton("7");
    private JButton jbtunadd8 = new JButton("8");
    private JButton jbtunadd9 = new JButton("9");
    private JButton jbtunadd10 = new JButton("+");
    private JButton jbtunadd11 = new JButton("-");
    private JButton jbtunadd12 = new JButton("*");
    private JButton jbtunadd13 = new JButton("/");
    private JButton jbtunadd14 = new JButton(".");
    private JButton jbtunadd15 = new JButton("=");
    private JButton jbtunadd16 = new JButton("EXIT");
    private JLabel jib = new JLabel();
    private JTextField jtf = new JTextField();
    public MainFrame1(){
        ex1();
    }
    private void ex1(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocation(100,100);
        this.setSize(1440,1020);
        jbtunadd0.setBounds(100,400,200,100);
        jbtunadd1.setBounds(100,300,100,100);
        jbtunadd2.setBounds(200,300,100,100);
        jbtunadd3.setBounds(300,300,100,100);
        jbtunadd4.setBounds(100,200,100,100);
        jbtunadd5.setBounds(200,200,100,100);
        jbtunadd6.setBounds(300,200,100,100);
        jbtunadd7.setBounds(100,100,100,100);
        jbtunadd8.setBounds(200,100,100,100);
        jbtunadd9.setBounds(300,100,100,100);
        jbtunadd10.setBounds(400,100,100,200);
        jbtunadd11.setBounds(400,0,100,100);
        jbtunadd12.setBounds(300,0,100,100);
        jbtunadd13.setBounds(200,0,100,100);
        jbtunadd14.setBounds(300,400,100,100);
        jbtunadd15.setBounds(400,300,100,200);
        jbtunadd16.setBounds(100,0,100,100);
        jib.setBounds(500,0,300,300);
        jtf.setBounds(500,0,300,300);
        this.add(jbtunadd0);
        this.add(jbtunadd1);
        this.add(jbtunadd2);
        this.add(jbtunadd3);
        this.add(jbtunadd4);
        this.add(jbtunadd5);
        this.add(jbtunadd6);
        this.add(jbtunadd7);
        this.add(jbtunadd8);
        this.add(jbtunadd9);
        this.add(jbtunadd10);
        this.add(jbtunadd11);
        this.add(jbtunadd12);
        this.add(jbtunadd13);
        this.add(jbtunadd14);
        this.add(jbtunadd15);
        this.add(jbtunadd16);
        this.add(jib);
        this.add(jtf);
        jbtunadd0.setText(Long.toString(Long.parseLong(jbtunadd0.getText())));
        jbtunadd1.setText(Long.toString(Long.parseLong(jbtunadd1.getText())));
        jbtunadd2.setText(Long.toString(Long.parseLong(jbtunadd2.getText())));
        jbtunadd3.setText(Long.toString(Long.parseLong(jbtunadd3.getText())));
        jbtunadd4.setText(Long.toString(Long.parseLong(jbtunadd4.getText())));
        jbtunadd5.setText(Long.toString(Long.parseLong(jbtunadd5.getText())));
        jbtunadd6.setText(Long.toString(Long.parseLong(jbtunadd6.getText())));
        jbtunadd7.setText(Long.toString(Long.parseLong(jbtunadd7.getText())));
        jbtunadd8.setText(Long.toString(Long.parseLong(jbtunadd8.getText())));
        jbtunadd9.setText(Long.toString(Long.parseLong(jbtunadd9.getText())));
        jbtunadd16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }
}
