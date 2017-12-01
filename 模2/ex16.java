import java.util.Scanner;
//字串編碼數值總和
public class ex16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.nextLine();
        int sum = 0;
        for (int i = 0;i<a.length();i++){
            sum = sum + (int)a.charAt(i);
        }
        System.out.println(sum);
    }
}
