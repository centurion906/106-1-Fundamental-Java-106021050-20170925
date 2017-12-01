import java.util.Scanner;
//X三角形
public class ex15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        for (int i = 0;i<a;i++){
            for (int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
