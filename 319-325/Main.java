import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        int a = 1,b = 0;
        while ( a != 0 ){
            System.out.println("功能表");
            System.out.println("-------------------------------------");
            System.out.println("1.新增資料");
            System.out.println("2.查某同學");
            System.out.println("3.查全部");
            System.out.println("4.查某科目平均");
            System.out.println("5.查某同學的平均 -> 問第N位");
            System.out.println("0.結束");
            System.out.println("-------------------------------------");
            System.out.println("請輸入選項");
            int x = scn.nextInt();
            int listsize = list.size();
            switch (x){
                case 0:
                    a = 0;
                    break;
                case 1:
                    System.out.println("同學名字");
                    String name = scn.next();
                    System.out.println("性別:");
                    String sex = scn.next();
                    System.out.println("系別");
                    String dep = scn.next();
                    System.out.println("英文分數");
                    int Eng = scn.nextInt();
                    System.out.println("國文分數");
                    int Chinese = scn.nextInt();
                    System.out.println("數學分數");
                    int Math = scn.nextInt();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }
        System.out.println("謝謝使用");
    }
}
