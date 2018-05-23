import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int  b [] = new int[a];
        int max1 = 0, max2 = 0,min1 = 0,min2 = 0;
        for (int i = 0;i < b.length; i++){
           b[i] = scn.nextInt();
            if (b[i]!=0){
                if (b[i]>max1){
                    max2 = max1;
                    max1 = b[i];
                }else if (b[i]>max2){
                    max2 = b[i];
                }else if (b[i]<min1){
                    min2 = min1;
                    min1 = b[i];
                }else if (b[i]>min1&&b[i]<min2){
                    min2 = b[i];
                }
        }
        }System.out.println(Math.round(max2*max1));
    }
}
