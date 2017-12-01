import java.util.Scanner;
//圓內判定
public class ex9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        if (a*a+b*b<=100*100){
            System.out.println("inside");
        }else {
            System.out.println("outside");
        }
    }
}
