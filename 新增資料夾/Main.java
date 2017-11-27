import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int X = scn.nextInt();
        int Y = scn.nextInt();
        if (X>=0&&Y>=0){
            if (X*X+Y*Y<=100*100){
                System.out.println("inside");
            }else {
                System.out.println("outside");
            }
        }
        System.out.println("Error");
    }
}
//圓內圓外