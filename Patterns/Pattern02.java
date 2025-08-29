package Patterns;
import java.util.Scanner;

public class Pattern02 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=n;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

// output
// *****
// ****
// ***
// **
// *
