import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame1 extends JFrame{
    private JButton jbtn1= new JButton("RUN");
    private JButton jbtn2= new JButton("↑");
    private JButton jbtn3= new JButton("↓");
    private JButton jbtn4= new JButton("←");
    private JButton jbtn5= new JButton("→");
    private JButton jbtn6= new JButton("EXIT");
    private JLabel jib = new JLabel();
    private JLabel jib2 = new JLabel();
    private Timer t1 ;
    private Timer t2 ;
    private int tarX,tarY;
    private float m = 0.0f;
    private boolean jibFlag = false;
    private int dirFlag = 1, objx = 50, objy = 50, objw = 50, obje = 50;
    private ImageIcon icon = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\untitled1\\src\\123.png");
    private ImageIcon icon2 = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\untitled1\\src\\123.png");
    public MainFrame1(){
        ex1();
    }public void ex1(){
        this.setBounds(300,300,800,700);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jbtn1.setBounds(30,600,100,50);
        jbtn2.setBounds(150,600,100,50);
        jbtn3.setBounds(270,600,100,50);
        jbtn4.setBounds(390,600,100,50);
        jbtn5.setBounds(510,600,100,50);
        jbtn6.setBounds(630,600,100,50);
        jib.setBounds(100,100,97,116);
        jib2.setBounds(200,200,97,116);
        jib.setIcon(icon);
        jib2.setIcon(icon);
        this.add(jbtn1);
        this.add(jbtn2);
        this.add(jbtn3);
        this.add(jbtn4);
        this.add(jbtn5);
        this.add(jbtn6);
        this.add(jib);
        this.add(jib2);
        jbtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.start();
            }
        });
        jbtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dirFlag = 1;
            }
        });
        jbtn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dirFlag = 2;
            }
        });
        jbtn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dirFlag = 3;
            }
        });
        jbtn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dirFlag = 4;
            }
        });
        jib2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jibFlag = true;
            }
        });
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                tarX = e.getX();
                tarY = e.getY();
                if (jibFlag){
                    jibFlag = false;
                    m = (float)(tarX-jib2.getX())/(float)(tarY-jib2.getY());
                    t2.start();
                }
            }
        });
        t2 = new Timer(30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Math.abs(jib2.getX()-tarX)<30&&Math.abs(jib2.getY()-tarY)<30){
                    t2.stop();
                }else {
                    int newjib2X,newjib2Y;
                    if (jib2.getX()-tarX<0){
                        newjib2X = jib2.getX()+3;
                    }else {
                        newjib2X = jib2.getX()-3;
                    }
                    newjib2Y = Math.round(m*(float)(newjib2X-jib2.getX())+jib2.getY());
                    jib2.setLocation(newjib2X,newjib2Y);
                    System.out.println(newjib2X+","+newjib2Y);
                }
                System.out.println(tarX+","+tarY+"\t=>"+(jib.getX()-tarX)+"\t=>"+(jib2.getY()-tarY));
            }
        });
        t1 = new Timer(20, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (dirFlag){
                    case 1:
                        if (objy-2>0){
                            objy-=2;
                            break;}
                    case 2:
                        if (objy+2<310){
                            objy+=2;
                            break;}
                    case 3 :
                        if (objx-2>0){
                            objx-=2;
                            break;}
                    case 4:
                        if (objx+2<626){
                            objx+=2;
                            break; }
                }
                jib.setLocation(objx,objy);
            }
        });
        jbtn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}