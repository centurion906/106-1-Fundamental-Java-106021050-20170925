import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame1 extends JFrame {
    private JButton jbtn = new JButton("轉換");
    private JButton jbtn1 = new JButton("還原");
    private JButton jbtn2 = new JButton("退出");
    private JTextField jtf = new JTextField();
    private JTextField jtf1 = new JTextField();
    private JTextField jtf2 = new JTextField();
//    private String a;
//    private char [] b = new char[a.length()];
//    private int key, n;

    public MainFrame1() {
        ex1();
    }
    private void ex1() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(100,100,800,500);
        jtf.setBounds(50,100,200,300);
        jtf1.setBounds(450,100,200,300);
        jtf2.setBounds(300,100,100,50);
        jbtn.setBounds(300,200,100,50);
        jbtn1.setBounds(300,300,100,50);
        jbtn2.setBounds(300,400,100,50);
        this.add(jbtn);
        this.add(jbtn1);
        this.add(jbtn2);
        this.add(jtf);
        this.add(jtf1);
        this.add(jtf2);
//        jbtn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                a = Integer.parseInt((int)jtf.getText());
//               for (int i = 0;i<a.length();i++){
//                   key = Integer.parseInt(jtf2.getText());
//                       char ch=a.charAt(i);
//                       int num=(int)ch;
//                       if(num>=48&&num<=57){
//                           num+key=n;
//                           num=num>57?num-10:num;
//                       }else if(num>=65&&num<=90){
//                           num+key=n;
//                           num=num>90?num-26:num;
//                       }else if(num>=97&&num<=122){
//                           num+key=n;
//                           num=num>122?num-26:num;
//                   }
//               }
//            }
//        });
        jbtn2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }
}