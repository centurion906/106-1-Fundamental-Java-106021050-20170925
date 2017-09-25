import java.util.Scanner;

public class w3{

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char ch0 =scn.next().charAt(0);
        char ch1 =scn.next().charAt(0);
        System.out.println(str.replace(ch0,ch1));

    }}
