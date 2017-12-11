import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][] a = new int [n][m];
        int count = 1;
        for (int i = 0;i<n;i++){
            for (int j = 0;j<m;j++){
                a[i][j] = count;
                count++;
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
