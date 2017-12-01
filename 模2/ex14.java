import java.util.Scanner;
//被3整除的數總和
public class ex14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int sum =0;
        for (int i = 0;i<=a;i=i+3){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
