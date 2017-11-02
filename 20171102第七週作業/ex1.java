import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        if (x<=0||y<=0) {
            System.out.println("Error");
        }else if (x*x+y*y<=100*100){
           System.out.println("inside");
       }else{
           System.out.println("outside");
        }
    }
}
