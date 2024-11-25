package Patterns;
import java.util.Scanner;

public class Pattern08 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(a+"\t");
                a++;
            }
            System.out.println();
        }
    }
}