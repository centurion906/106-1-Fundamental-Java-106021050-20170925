import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton jbtunadd = new JButton("add");   //按鈕
    private JButton jbtunadd1 = new JButton("low");
    private JLabel jib = new JLabel("ヽ（・∀・）ノ");//文字輸入
    private JTextField jtf = new JTextField();
    private int x = 50;
    public MainFrame(){
        ex1();
    }
    private void ex1(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//XX = 程式結束
        this.setLayout(null);                     //抓位 紅中  因為沒有抓位 所以null
        this.setLocation(100,100);        //視窗位置
        this.setSize(1440,1020);    //視窗大小
        jbtunadd.setLocation(200,200);     //按紐位置
        jbtunadd1.setLocation(400,200);
        jbtunadd.setSize(100,100);   //按鈕大小
        jbtunadd1.setSize(100,100);
        jib.setBounds(100,100,100,100);//Location,Size的合集
        jtf.setBounds(300,300,100,100);
        this.add(jbtunadd);                                   //視窗上建立按鈕
        this.add(jbtunadd1);
        this.add(jib);
        this.add(jtf);
        jbtunadd.addActionListener(new ActionListener() {      //按鈕接收指令
            @Override
            public void actionPerformed(ActionEvent e) {
                x = Integer.parseInt(jtf.getText());             //移動變數
                jib.setLocation(x,100);                    //移動方向跟位移程度
            }
        });
        jbtunadd1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = Integer.parseInt(jtf.getText());
                jib.setLocation(x,100);
            }
        });
    }
}
