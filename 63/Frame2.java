import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Frame2 extends JFrame{
    static int mapHeight , mapWidth;
    static int frameWidth = 400, frameHeight = 400;
    private JButton [][] jbtn;
    private int timecount = 0;
    private int timeContinue = 1;
    private JLabel jlb = new JLabel("已經過時間：0");
    private JPanel centerButtonPanel;
    private JPanel topPanel;

    public Frame2(int v1,int v2){
        mapHeight = v1;
        mapWidth = v2;
        ex2();
    }public void ex2(){
        this.setBounds(100,100,frameWidth,frameHeight);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.setTitle("踩地雷");
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
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                if (timeContinue == 1) jlb.setText("已經過時間： "+(timecount++));
            }
        };
        new Timer().scheduleAtFixedRate(timerTask,0,1000);
        topPanel = new JPanel();
        topPanel.add(jlb);
        add(topPanel,BorderLayout.NORTH);
    }
}