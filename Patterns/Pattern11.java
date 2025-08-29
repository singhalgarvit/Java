package Patterns;
import java.util.Scanner;

public class Pattern11 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int sp=n/2;
        int st=1;
        int a=1;
        for(int i=1;i<=n;i++){
            int b=a;
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int k=1;k<=st;k++){
                System.out.print(b+"\t");
                if(k<=(st/2)){
                    b++;
                }
                else{
                    b--;
                }
            }
            System.out.println();

            if(i<=(n/2)){
                sp--;
                st = st+2;
                a++;
            }
            else{
                sp++;
                st = st-2;
                a--;
            }
        }
    }
}

//                 1
//         2       3       2
// 3       4       5       4       3
//         2       3       2
//                 1