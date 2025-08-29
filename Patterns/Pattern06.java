package Patterns;
import java.util.Scanner;

public class Pattern06 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int sp=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<sp;j++){
                System.out.print("\t");
            }
            System.out.println("*");
            sp--;
        }
    }
}

//                                 *
//                         *
//                 *
//         *
// *