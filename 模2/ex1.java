import java.util.Scanner;
//標準體重
public class ex1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cm = scn.nextInt();
        int a = scn.nextInt();
        if (a==1){
            System.out.println(Math.round((cm-80)*0.7*10)/10f);
        }else if (a==2){
            System.out.println(Math.round((cm-70)*0.6*10)/10f);
        }
    }
}
