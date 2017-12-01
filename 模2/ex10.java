import java.util.Scanner;
//停車費
public class ex10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int hr1 = scn.nextInt();
        int min1 = scn.nextInt();
        int hr2= scn.nextInt();
        int min2 = scn.nextInt();
        int a = ((hr2-hr1)*60+(min2-min1))/30, sum = 0;
        if (a>4){
            sum = 120;
            a= a -4;
        }else{
            System.out.println(a*30);
        }if (a>4){
            sum = sum +160;
            a = a - 4;
        }else {
            System.out.println(sum = sum + a*40);
        }if (a>0){
            System.out.println(sum = sum + a*60);
        }
    }
}
