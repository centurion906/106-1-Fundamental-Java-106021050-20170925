import java.util.Scanner;

public class case4{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int sum = 0;
        while (n>0){
            if (n%10==m){
                sum++;
            }
            n=n/10;
        }
        System.out.println(sum);
    }
}
