 package Functions;

import java.util.Scanner;

public class AnyBaseToAnyBase {

    public static int AnyBaseToDecimal(int n,int b1){
        int rv =0;
        int p=1;
        while (n!=0) {
            rv += (n%10)*p;
            n /= 10;
            p *= b1;
        }
        return rv;
    }

    public static int DecimalToAnyBase(int decimal,int b2){
        int rv=0;
        int p=1;
        while (decimal !=0) {
            rv += (decimal%b2)*p;
            decimal /= b2;
            p *= 10;
        }
        return rv;
    }

    public static int AnyBaseToAnyBase(int n,int b1,int b2){
        int decimal=AnyBaseToDecimal(n,b1);
        int rv=DecimalToAnyBase(decimal,b2);
        return rv;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int b1=scn.nextInt();
        int b2=scn.nextInt();
        System.out.println(AnyBaseToAnyBase(n,b1,b2));
    }
}