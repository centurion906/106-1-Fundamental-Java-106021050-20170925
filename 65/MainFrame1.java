import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.security.Key;

public class MainFrame1 extends JFrame{
    Container cp;
    private JLabel jib = new JLabel();
    private JLabel jib1 = new JLabel();
    private Timer t1 ;
    private ImageIcon icon = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\untitled\\src\\125.png");
    private ImageIcon icon1 = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\untitled\\src\\126.png");//ball
    private ImageIcon icon2 = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\untitled\\src\\127.png");
    public MainFrame1(){
        ex1();
    }public void ex1(){
        this.setBounds(100,100,1000,800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = getContentPane();
        cp.setLayout(null);

        jib.setBounds(100,600,150,150);

        jib.setIcon(icon);
        Image img = icon.getImage();
        Image img2 = img.getScaledInstance(150,150,50);
        icon.setImage(img2);

        jib.setIcon(icon2);
        Image img5 = icon2.getImage();
        Image img6 = img5.getScaledInstance(150,150,50);
        icon2.setImage(img6);

        jib1.setIcon(icon1);
        Image img3 = icon1.getImage();
        Image img4 = img3.getScaledInstance(80,80,50);
        icon1.setImage(img4);

        cp.add(jib);

        t1 = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jib1.setLocation(jib1.getX(),jib1.getY()-5);
                if (jib1.getY()<0){
                    t1.stop();
                }
            }
        });
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                switch (e.getKeyCode()){
                    case 37:
                        jib.setIcon(icon);
                        jib.setLocation(jib.getX()-5,jib.getY());
                        break;
                    case 39:
                        jib.setIcon(icon2);
                        jib.setLocation(jib.getX()+5,jib.getY());
                        break;
                    case 40:
                        jib.setLocation(jib.getX(),jib.getY()+5);
                        break;
                    case 38:
                        jib.setLocation(jib.getX(),jib.getY()-5);
                        break;
                    case 32:
                        jib1.setBounds(jib.getX()+40,jib.getY(),100,100);
                        cp.add(jib1);
                        t1.start();
                        break;
                }
            }
        });
    }
}
