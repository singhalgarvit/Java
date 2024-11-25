import java.util.Scanner;

public class PrintAllPrimeTillN {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        for(int i=a;i<=b;i++){
            int k=-1;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    k=0;
                    break;
                }
            }
            if(k==-1){
                System.out.println(i);
            }
        }
    }
}
