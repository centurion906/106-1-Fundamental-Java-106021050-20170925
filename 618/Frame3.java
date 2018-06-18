import javax.swing.*;

public class Frame3 extends JFrame{
    private JLabel jib = new JLabel("成功!");
    public Frame3(){
        ex2();
    }
    private void ex2(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(100,100,300,300);
        jib.setBounds(100,100,100,100);
        this.add(jib);
    }
}
