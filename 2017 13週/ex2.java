import java.util.Scanner;
//?????
public class ex2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];
        for (int i = 0; i<n; i++){
            a [i] = scn.nextInt();
            for (int j = i+1;j++){
                if (a[i]<a[j]){
                    int b  = a[j];
                    a[j] = a[i];
                    a[i] = b;
                }
            }
            System.out.println(a[i]+"\t");
        }
    }
}
