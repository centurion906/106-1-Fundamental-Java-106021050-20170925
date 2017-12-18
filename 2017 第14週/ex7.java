import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(),m = scn.nextInt();
        int [][] a = new int[n][m];
        for (int i = 0;i<n;i++){
            for (int j = 0;j<m;j++){
                a [i][j] = scn.nextInt();
            }
        }for (int j = 0;j<m;j++){
            for (int i = 0;i<n;i++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
