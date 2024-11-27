package Functions;

import java.util.Scanner;

public class AnyBaseAddition {

    public static int AnyBaseAddition(int n1, int n2,int b){
        int rv=0;
        int p=1;
        int carry=0;
        while (n1!=0 || n2!=0 || carry!=0) {
            int a=(n1%10)+(n2%10)+carry;
            rv += (a%b)*p;
            carry = a/b;
            n1 /= 10;
            n2 /= 10;
            p *= 10;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int b=scn.nextInt();
        System.out.println(AnyBaseAddition(n1,n2,b));
    }    
}