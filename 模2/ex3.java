import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
//最大值最小值
public class ex3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat();
        format.applyPattern("0.00");
        float a1 = scn.nextFloat();
        float a2 = scn.nextFloat();
        float a3 = scn.nextFloat();
        float a4 = scn.nextFloat();
        float a5 = scn.nextFloat();
        float a6 = scn.nextFloat();
        float a7 = scn.nextFloat();
        float a8 = scn.nextFloat();
        float a9 = scn.nextFloat();
        float a10 = scn.nextFloat();
        float max = Collections.max(Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10));
        float min = Collections.min(Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10));
        System.out.println(format.format(max));
        System.out.println(format.format(min));
    }
}
