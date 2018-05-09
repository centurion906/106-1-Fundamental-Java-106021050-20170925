import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mainframe extends JFrame {
    private JButton jbtunadd = new JButton("大");
    private JButton jbtunadd1 = new JButton("小");
    private JButton jbtunadd2 = new JButton("EXIT");
    private JLabel jib = new JLabel("歐嗨優");
    private int count = 18;
    public Mainframe(){
        ex1();
    }
    private void ex1(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocation(100,100);
        this.setSize(1440,1020);
        jbtunadd.setBounds(100,100,100,100);
        jbtunadd1.setBounds(200,100,100,100);
        jbtunadd2.setBounds(300,100,100,100);
        jib.setBounds(150,200,100,100);
        this.add(jbtunadd);
        this.add(jbtunadd1);
        this.add(jbtunadd2);
        this.add(jib);
        jbtunadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                count+=3;
                jib.setFont(new Font(null,Font.BOLD,count));
            }
        });
        jbtunadd1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                count-=3;
                jib.setFont(new Font(null,Font.BOLD,count));
            }
        });
        jbtunadd2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }
}
