import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.nextLine();
        int sum = 0;
        char[]ch = a.toCharArray();
        for (int i=0; i<ch.length;i++){
            int c = ch[i]-'0';
            sum+= c;
        }
        System.out.println(sum);
    }
}
