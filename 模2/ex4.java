import java.util.Scanner;
//星座判定
public class ex4{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int d = scn.nextInt();
        if (m <= 12 && d <= 31) {
            if (m == 1 && d >= 21 || m == 2 && d <= 18) {
                System.out.println("水瓶");
            } else if (m == 2 && d >= 19 || m == 3 && d <= 20) {
                System.out.println("雙魚");
            } else if (m == 3 && d >= 21 || m == 4 && d <= 20) {
                System.out.println("牡羊");
            } else if (m == 4 && d >= 21 || m == 5 && d <= 21) {
                System.out.println("金牛");
            } else if (m == 5 && d >= 22 || m == 6 && d <= 21) {
                System.out.println("雙子");
            } else if (m == 6 && d >= 22 || m == 7 && d <= 23) {
                System.out.println("巨蟹");
            } else if (m == 7 && d >= 23 || m == 8 && d <= 23) {
                System.out.println("獅子");
            } else if (m == 8 && d >= 24 || m == 9 && d <= 23) {
                System.out.println("處女");
            } else if (m == 9 && d >= 24 || m == 10 && d <= 23) {
                System.out.println("天秤");
            } else if (m == 10 && d >= 24 || m == 11 && d <= 22) {
                System.out.println("天蠍");
            } else if (m == 11 && d >= 23 || m == 12 && d <= 21) {
                System.out.println("射手");
            } else if (m == 12 && d >= 22 || m == 1 && d <= 20) {
                System.out.println("魔羯");
            }
        }else{
            System.out.println("Error");
        }
    }
}