import java.util.Scanner;
//平年閏年
public class ex2{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        if (year%4==0){
            if (year%400==0){
                System.out.println("bissextile year");
            }else if (year%4==0){
                if (year%100==0){
                    System.out.println("common year");
                }else {
                    System.out.println("bissextile year");
                }
            }
        }else{
        System.out.println("common year");
    }

    }
}