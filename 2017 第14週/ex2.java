import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [] a = new int[3];
        for (int i = 0;i<3;i++) {
            a[i] = scn.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for (int j = 0;j<3;j++){
            if (a[j]>max){
                max = a[j];
            }if (a[j]<min){
                min = a[j];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
