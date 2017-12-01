import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        int v2 = scn.nextInt();
        int v3 = scn.nextInt();
        int v4 = scn.nextInt();
        if (v1==v2&&v2==v3&&v3==v4){
            System.out.println("通殺");
        }
    }
}
