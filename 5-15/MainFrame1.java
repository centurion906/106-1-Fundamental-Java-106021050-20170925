import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame1 extends JFrame {
    Container cp;   //這是容器
    private JLabel jib = new JLabel("",JLabel.RIGHT);
    private JButton[][] jbtn = new JButton[4][5];
    private JPanel jpanN = new JPanel(new GridLayout(1,1,3,3));  //行列 上下間距
    private JPanel jpanC = new JPanel(new GridLayout(4,5,3,3));
    private int op = -1;
    private double v1, v2;
    public MainFrame1(){
        ex1();
    }
    public void ex1(){
        this.setBounds(300,300,400,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = getContentPane();
        cp.add(jpanN,BorderLayout.NORTH);   //加入容器
        cp.add(jpanC,BorderLayout.CENTER);
        jpanN.add(jib);
        jib.setFont(new Font(null,Font.BOLD,40));
        jbtn[0][0]=new JButton("7");
        jbtn[1][0]=new JButton("8");
        jbtn[2][0]=new JButton("9");
        jbtn[3][0]=new JButton("+");
        jbtn[0][1]=new JButton("AC");
        jbtn[1][1]=new JButton("4");
        jbtn[2][1]=new JButton("5");
        jbtn[3][1]=new JButton("6");
        jbtn[0][2]=new JButton("-");
        jbtn[1][2]=new JButton("PI");
        jbtn[2][2]=new JButton("3");
        jbtn[3][2]=new JButton("2");
        jbtn[0][3]=new JButton("1");
        jbtn[1][3]=new JButton("*");
        jbtn[2][3]=new JButton("Sqrt");
        jbtn[3][3]=new JButton("0");
        jbtn[0][4]=new JButton(".");
        jbtn[1][4]=new JButton("=");
        jbtn[2][4]=new JButton("/");
        jbtn[3][4]=new JButton("EXIT");
        for(int i=0;i<=4;i++) {
            for (int j = 0; j <= 3; j++) {
                jpanC.add(jbtn[j][i]);
            }
        }
        for (int i = 0; i<=3; i++){
            for (int j = 0; j<=3; j++){
                jbtn[j][i].addActionListener(new ActionListener() {     //抓數字進容器
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton jb = (JButton)e.getSource();
                        jib.setText(jib.getText()+jb.getText());
                        if (jib.getText().equals(" ")){
                            jib.setText(jb.getText());
                        }else {
                            jib.setText(jib.getText());
                        }
                    }
                });
                jbtn[j][i].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton tmpBtn = (JButton)e.getSource();
                        switch (tmpBtn.getText()){
                            case "AC":
                                jib.setText("0");
                                op =-1;
                                break;
                            case "PI":
                                jib.setText(Double.toString(Math.PI));
                                op = -1;
                                break;
                            case "Sqrt":
                                jib.setText(Double.toString(Math.sqrt(v1)));
                                op = -1;
                                break;
                            case "EXIT":
                                System.exit(0);
                                break;
                            case "+":
                                op = 0;
                                v1 = Double.parseDouble(jib.getText());
                                break;
                            case "-":
                                op = 1;
                                v1 = Double.parseDouble(jib.getText());
                                break;
                            case "*":
                                op = 2;
                                v1 = Double.parseDouble(jib.getText());
                                break;
                            case "/":
                                op = 3;
                                v1 = Double.parseDouble(jib.getText());
                                break;
                            case "=":
                                v2 = Double.parseDouble(jib.getText());
                                double v3 = 0;
                                switch (op){
                                    case 0:
                                        v3 = v1 + v2;
                                        break;
                                    case -1:
                                       v3 = Math.sqrt(v1);
                                       break;
                                    case 1:
                                        v3 = v1-v2;
                                        break;
                                    case 2:
                                        v3 = v1*v2;
                                        break;
                                    case 3:
                                        v3 = v1/v2;
                                }
                                break;
                        }
                    }
                });
            }
        }
    }
}