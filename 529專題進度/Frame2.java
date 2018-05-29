import javax.swing.*;
import java.awt.*;

public class Frame2 extends JFrame{
    static int mapHeight = 9, mapWidth = 9;
    static int frameWidth = 400, frameHeight = 400;
    private JButton [][] jbtn;
    private JPanel centerButtonPanel;
    public Frame2(){
        ex2();
    }public void ex2(){
        this.setBounds(100,100,frameWidth,frameHeight);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        jbtn = new JButton[mapHeight][mapWidth];
        centerButtonPanel = new JPanel();
        centerButtonPanel.setLayout(new GridLayout(mapHeight, mapWidth));
        for (int i=0;i<mapHeight;i++){
            for (int j=0;j<mapWidth;j++){
                jbtn[i][j] = new JButton();
                centerButtonPanel.add(jbtn[i][j]);
            }
        }
        add(centerButtonPanel, BorderLayout.CENTER);
    }
}