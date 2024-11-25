import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int small,GCD=0;
        small = (a<b)?a:b;
        for(int i=small;i>=1;i--){
            if(a%i == 0 && b%i ==0){
                GCD=i;
                break;
            }
        }
        System.out.println("GCD is " + GCD);
        System.out.println("LCM is "+ (a*b)/GCD);
    }
    
}