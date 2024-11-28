package Functions;

import java.util.Scanner;

public class AnyBaseSubtraction {

    //Here We Assumed that n2 > n1

    public static int AnyBaseSubtraction(int n1, int n2, int base){
        int rv=0;
        int carry=0;
        int p=1;
        while (n2>0) {
            int d1=n1%10;
            n1 = n1/10;
            int d2=n2%10;
            n2 = n2/10;
            int a =0;

            d2 += carry;
            if(d2>=d1){
                carry=0;
                a = d2-d1;
            }else{
                carry =-1;
                a = (d2+base)-d1; 
            }
            rv += a*p;
            p *= 10;
        }
        return rv;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();       
        int base=scn.nextInt();
        System.out.println(AnyBaseSubtraction(n1,n2,base));
    }    
}