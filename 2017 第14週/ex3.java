import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a = scn.nextDouble();
        int n = scn.nextInt();
        System.out.println(Math.round(a*Math.pow(10,n))/Math.pow(10,n));
    }
}
