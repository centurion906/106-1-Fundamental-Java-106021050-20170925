import java.util.Scanner;
//質數判定
public class ex8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       int a = scn.nextInt();
       if (a!=1){
           String b = "質數";
           for (int i = 2;i<a;i++){
               if (a%i==0){
                   b="非質數";
               }
           }
           System.out.println(b);
       }else {
           System.out.println("非質數");
       }
    }
}
