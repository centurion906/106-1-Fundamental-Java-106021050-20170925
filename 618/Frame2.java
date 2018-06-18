//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.util.Arrays;
//import java.util.Timer;
//import java.util.TimerTask;
//import java.util.Vector;
//
//public class Frame2 extends JFrame{
//    static int mapHeight = 9, mapWidth = 9;
//    static int frameWidth = 400, frameHeight = 400;
//    private JButton [][] jbtn = new JButton[mapHeight][mapWidth];
//    private int bombCount = 10;
//    private JLabel bombmany = new JLabel("目前炸彈數："+bombCount);
//    private int map[][] = new int[mapHeight][mapWidth];
//    private boolean buttonpull [][] = new boolean[mapHeight][mapWidth];
//    private int mapAroundBomb[][] = new int[mapHeight][mapWidth];
//    private int direct[][]={{0,0},{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,-1},{-1,1},{1,-1}}; //8方位。
//    private int timecount = 0;
//    private int timeContinue = 1;
//    private int bombcount1 = Math.round(((mapHeight*mapWidth)*3)*100/10f);
//    public Frame2(int v1,int v2){
//        mapHeight = v1;
//        mapWidth = v2;
//        ex2();
//    }
//    public void ex2(){
//        this.setBounds(100,100,frameWidth,frameHeight);
//        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        this.setLayout(new BorderLayout());
//        this.setResizable(false);
//        this.setTitle("踩地雷");
////        ------------------上面介面------------------------------
//        JPanel topPanel = new JPanel();
//        bombmany.setText("目前炸彈有："+bombCount);
//        topPanel.add(bombmany);
//        JButton restart = new JButton("新局");
//        restart.setActionCommand("r");
////        restart.addMouseListener(this);
//        topPanel.add(restart);
//        JLabel time = new JLabel("已經過了：0");
//        TimerTask timerTask = new TimerTask() {
//            @Override
//            public void run() {
//                if (timeContinue == 1) time.setText("已經過："+(timecount++)+"秒");
//            }
//        };
//        new Timer().scheduleAtFixedRate(timerTask,0,1000);
//        topPanel.add(time);
//        add(topPanel,BorderLayout.NORTH);
////        ----------------建立地圖-------------------------
//        JPanel centerButtonPanel = new JPanel();
//        centerButtonPanel.setLayout(new GridLayout(mapHeight, mapWidth));
//        for (int i=0;i<mapHeight;i++){
//            for (int j=0;j<mapWidth;j++){
//                jbtn[i][j] = new JButton();
//                jbtn[i][j].setActionCommand(i+" "+j);
////                jbtn[i][j].addMouseListener(this);
//                centerButtonPanel.add(jbtn[i][j]);
//            }
//        }
//        add(centerButtonPanel,BorderLayout.CENTER);
//        //        ---------------設定地圖----------------------------------------
//        setMap();
//        aroundBomb();
//        setVisible(true);
//    }
//    private void setMap() {
//        int count = 0;
//        while (count != 10) {
//            int a = (int) (Math.random() * 9);   //設定炸彈座標,1=有
//            int b = (int) (Math.random() * 9);
//            if (map[a][b] == 0) {
//                map[a][b] = 1;
//                count++;
//            }
//        }
//    }
//
//    private void aroundBomb() {
//        for (int i = 0; i < mapHeight; i++) {
//            for (int j = 0; j < mapWidth; j++) {
//                if (map[i][j] == 1) {
//                    mapAroundBomb[i][j] = -1;
//                }else {
//                    for (int k = 0 ;k<direct.length;k++){
//                        int Height = i + direct[k][0], Width = j + direct[k][1];
//                        if ((Height>=0&&Height<mapWidth&&Width>=0&&Width<mapWidth)&&map[Height][Width]==1)mapAroundBomb[i][j]++;
//                    }
//                }
//            }
//        }
//    }
//    private void restart(){
//        timecount = 1;
//        timeContinue = 1;
//        for (int i = 0;i<mapHeight;i++) Arrays.fill(map[i],0);
//        for (int i = 0;i<mapHeight;i++) Arrays.fill(buttonpull[i],false);
//        for (int i = 0;i<mapHeight;i++){
//            for (int j = 0;j<mapWidth;j++){
//                jbtn[i][j].setBackground(Color.WHITE);
//                jbtn[i][j].setText("");
//            }
//        }
//        setMap();
//        aroundBomb();
//        bombCount = 10;
//        bombmany.setText("目前炸彈數："+bombCount);
//    }
//
////    public void mouseClicked(MouseEvent e){
////        String command[]=((JButton)e.getSource()).getActionCommand().split(" ");
////        if (command[0].equals("r")){
////            restart();
////        }else {
////            int height = Integer.parseInt(command[0]),width = Integer.parseInt(command[1]);
////            if (e.getButton() == MouseEvent.BUTTON1){
////                if (map[height][width] == 1&&!buttonpull[height][width]){
////                    for (int i = 0;i<mapHeight;i++){
////                        for (int j = 0;j<mapWidth;j++){
////                            if (map[i][j] == 1){
////                                jbtn[i][j].setText("*");
////                                timeContinue = 0;
////                                restart();
////                            }else {
////                                if (mapAroundBomb[height][width] == 0 &&!buttonpull[height][width]){
////                                    Vector<postion>
////                                            vector = new Vector<postion>();
////                                    vector.add(new postion(height,width));
////                                }
////                            }
////                        }
////                    }
////                }
////            }
////        }
////    }
//
//}
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

public class Frame2 extends JFrame{
    static int mapHeight = 9, mapWidth = 9;
    static int frameWidth = 400, frameHeight = 400;
    private JButton [][] jbtn = new JButton[mapHeight][mapWidth];
    private int bombCount = Math.round(((mapHeight*mapWidth)*3)*10/100f);
    private JLabel bombmany = new JLabel("目前炸彈數："+bombCount);
    private int map[][] = new int[mapHeight][mapWidth];
    private boolean buttonpull [][] = new boolean[mapHeight][mapWidth];
    private int mapAroundBomb[][] = new int[mapHeight][mapWidth];
    private int direct[][]={{0,0},{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,-1},{-1,1},{1,-1}}; //8方位。
    private int timecount = 0;
    private int timeContinue = 1;
    //    private int bombcount1 = Math.round(((mapHeight*mapWidth)*3)*10/100f);
    public Frame2(int v1,int v2){
        mapHeight = v1;
        mapWidth = v2;
        ex2();
    }
    public void ex2(){
        this.setBounds(100,100,frameWidth,frameHeight);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.setTitle("踩地雷");
//        ------------------上面介面------------------------------
        JPanel topPanel = new JPanel();
        bombmany.setText("目前炸彈有："+bombCount);
        topPanel.add(bombmany);
        JButton restart = new JButton("新局");
        restart.setActionCommand("r");
//        restart.addMouseListener(this);  做錯惹
        restart.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                System.out.println("A");  開新局
                timecount = 1;
                timeContinue = 1;
                for (int i = 0;i<mapHeight;i++) Arrays.fill(map[i],0);
                for (int i = 0;i<mapHeight;i++) Arrays.fill(buttonpull[i],false);
                for (int i = 0;i<mapHeight;i++){
                    for (int j = 0;j<mapWidth;j++){
                        jbtn[i][j].setText("");
                    }
                }
                setMap();
                aroundBomb();
                bombCount = bombCount;
                bombmany.setText("目前炸彈數："+bombCount);
            }
        });
        topPanel.add(restart);
        JLabel time = new JLabel("已經過了：0");
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                if (timeContinue == 1) time.setText("已經過："+(timecount++)+"秒");
            }
        };
        new Timer().scheduleAtFixedRate(timerTask,0,1000);
        topPanel.add(time);
        add(topPanel,BorderLayout.NORTH);
//        ----------------建立地圖-------------------------
        JPanel centerButtonPanel = new JPanel();
        centerButtonPanel.setLayout(new GridLayout(mapHeight, mapWidth));
        for (int i=0;i<mapHeight;i++){
            for (int j=0;j<mapWidth;j++){
                jbtn[i][j] = new JButton();
                jbtn[i][j].setActionCommand(i+" "+j);
//                jbtn[i][j].addMouseListener(this);  做錯惹  QuQ
                jbtn[i][j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        System.out.println("test");
//                        jbtn[i][j].setBackground(Color.WHITE);
                        switch (bombCount){
                            case 0:
                                jbtn[i][j].setBackground(Color.WHITE);
                                break;
                            case 1:
                                jbtn[i][j].setBackground(Color.RED);
                                Frame3 frm1 = new Frame3();
                                frm1.setVisible(true);
                                Frame2.this.setVisible(false);
                        }
                    }
                });
                centerButtonPanel.add(jbtn[i][j]);
            }
        }
        add(centerButtonPanel,BorderLayout.CENTER);
        //        ---------------設定地圖----------------------------------------
        setMap();
        aroundBomb();
        setVisible(true);
    }
    private void setMap() {
        int count = 0;
        while (count != bombCount) {
            int a = (int) (Math.random() * 9);   //設定炸彈座標,1=有
            int b = (int) (Math.random() * 9);
            if (map[a][b] == 0) {
                map[a][b] = 1;
                count++;
            }
        }
    }

    private void aroundBomb() {
        for (int i = 0; i < mapHeight; i++) {
            for (int j = 0; j < mapWidth; j++) {
                if (map[i][j] == 1) {
                    mapAroundBomb[i][j] = -1;
                }else {
                    for (int k = 0 ;k<direct.length;k++){
                        int Height = i + direct[k][0], Width = j + direct[k][1];
                        if ((Height>=0&&Height<mapWidth&&Width>=0&&Width<mapWidth)&&map[Height][Width]==1)mapAroundBomb[i][j]++;
                    }
                }
            }
        }
    }
//    private void restart(){
//        timecount = 1;
//        timeContinue = 1;
//        for (int i = 0;i<mapHeight;i++) Arrays.fill(map[i],0);
//        for (int i = 0;i<mapHeight;i++) Arrays.fill(buttonpull[i],false);
//        for (int i = 0;i<mapHeight;i++){
//            for (int j = 0;j<mapWidth;j++){
//                jbtn[i][j].setBackground(Color.WHITE);
//                jbtn[i][j].setText("");
//            }
//        }
//        setMap();
//        aroundBomb();
//        bombCount = bombCount;
//        bombmany.setText("目前炸彈數："+bombCount);
//    }
}