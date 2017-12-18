import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int [] b = new int[a];
        for (int i =0;i<a;i++){
            b[i] = scn.nextInt();
            for (int j = i+1;j<a;j++){
                if (b[j]<b[i]){
                    int vol = b[j];
                    b[j] = b[i];
                    b[i] = b[j];
                }
            }
            System.out.println(b[i]+"\t");
        }
    }
}

