import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;

public class MainFrame extends JFrame {
    private JButton jbtunadd = new JButton("=");   //按鈕
    private JLabel jib = new JLabel("攝氏");//文字輸入
    private JLabel jib1 = new JLabel("華氏");
    private JTextField jtf = new JTextField();
    private JTextField jtf1 = new JTextField();
    private int x = 0;
    private static double num;
    public MainFrame(){
        ex1();
    }
    private void ex1(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//XX = 程式結束
        this.setLayout(null);                     //抓位 紅中  因為沒有抓位 所以null
        this.setLocation(100,100);        //視窗位置
        this.setSize(1440,1020);    //視窗大小
        jbtunadd.setLocation(300,100);     //按紐位置
        jbtunadd.setSize(100,100);   //按鈕大小
        jib.setBounds(100,100,100,100);//Location,Size的合集
        jib1.setBounds(500,100,100,100);//Location,Size的合集
        jtf.setBounds(200,100,100,100);
        jtf1.setBounds(400,100,100,100);
        this.add(jbtunadd);                                   //視窗上建立按鈕
        this.add(jib);
        this.add(jib1);
        this.add(jtf);
        this.add(jtf1);
        jbtunadd.addActionListener(new ActionListener() {      //按鈕接收指令
            @Override
            public void actionPerformed(ActionEvent e) {
                x = Integer.parseInt(jtf.getText());//移動變數
                x = ((x-32)*5)/9;
                jtf1.setText(jtf.getText());
            }
        });
    }
}