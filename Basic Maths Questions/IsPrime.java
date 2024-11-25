import java.util.*;

public class IsPrime {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        for(int i=0;i<t;i++){
            int n=scn.nextInt();
            int k=-1;
            for(int j=2;j<=n/2;j++){
                if(n%j==0){
                    k=0;
                    break;
                }
            }
            if(k==-1)System.out.println("Prime");
            else System.out.println("Not Prime");
        }
    }
    
}