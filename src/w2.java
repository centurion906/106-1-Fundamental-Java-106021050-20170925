import java.util.Scanner;

public class w2{

    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        int vl=scn.nextInt();
        System.out.println(Math.round((vl/600f)*10)/10f);
    }
}

