import java.util.Scanner;
//輸入陣列 輸出總合.平均.小於平均值的質
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt(),sum=0;
        int[] b= new int[a];
        for(int i = 0 ; i<a ; i++){
            b[i]=scn.nextInt();
            sum = sum + b[i];
        }
        System.out.println(sum);
        int avg = sum/a;
        System.out.println(avg);
        for(int i = 0;i<a;i++){
            if(b[i]<avg){
                System.out.println(b[i]);
            }
        }
    }
}
