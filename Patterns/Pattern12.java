package Patterns;
import java.util.Scanner;

public class Pattern12 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int sp=(2*n)-3;
        int st=1;
        for(int i=1;i<=n;i++){
            int val=1;
            for(int j=1;j<=st;j++){
                System.out.print(val+" ");
                val++;
            }
            for(int j=1;j<=sp;j++){
                System.out.print("  ");
            }
            if(i==n){
                st--;
                val--;
            }
            for(int j=1;j<=st;j++){
                val--;  
                System.out.print(val+" ");
            }
            sp -= 2;
            st++;
            System.out.println();
        }
    }
}

// 1               1 
// 1 2           2 1 
// 1 2 3       3 2 1 
// 1 2 3 4   4 3 2 1 
// 1 2 3 4 5 4 3 2 1 