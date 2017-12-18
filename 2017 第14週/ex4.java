import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char [] a = scn.nextLine().toCharArray();
        int n = a.length;
        int n1 = n/2;
        boolean flag = true;
        for (int i = 0;i<n1;i++){
            if (a[i]-a[n-1-i]!=0){
                flag = false;
            }
        }if (flag == true){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
