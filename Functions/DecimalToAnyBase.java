 package Functions;

import java.util.Scanner;

public class DecimalToAnyBase {

    public static int DecimalToAnyBase(int n,int base){
       int ans=0;
       int i=1;
        while (n != 0) {
            ans += (n%base)*i;
            n /= base;
            i *= 10;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int base=scn.nextInt();
        System.out.println(DecimalToAnyBase(n,base));
    }    
}