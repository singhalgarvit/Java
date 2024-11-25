package Patterns;
import java.util.Scanner;

public class Pattern04 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<n-i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}