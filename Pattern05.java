import java.util.Scanner;

public class Pattern05 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int sp=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<sp;j++){
                System.out.print("\t");
            }
            System.out.println("*");
            sp++;
        }
    }
}