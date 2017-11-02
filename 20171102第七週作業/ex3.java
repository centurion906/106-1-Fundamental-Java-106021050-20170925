import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        if (m <= 0 || m > 12) {
            System.out.println("Error");
        } else if (m >= 3 && m <= 5) {
            System.out.println("spring");
        } else if (m >= 6 && m <= 8) {
            System.out.println("summer");
        } else if (m >= 9 && m <= 11) {
            System.out.println("autumn");
        } else if (m >= 12 || m<=2 ) {
            System.out.println("winter");
        }
    }
}

