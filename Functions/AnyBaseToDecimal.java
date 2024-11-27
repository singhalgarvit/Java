 package Functions;

import java.util.Scanner;

public class AnyBaseToDecimal {

    public static int AnyBaseToDecimal(int n,int base){
        int rv=0;
        int p=1;
        while (n != 0) {
            rv += (n%10)*(p);
            n /= 10;
            p *= base;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int base=scn.nextInt();
        System.out.println(AnyBaseToDecimal(n,base));
    }
}