import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int val= scn.nextInt();
        System.out.println(Math.round((val*0.26418)*10)/10f);

    }
}
