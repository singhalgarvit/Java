import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int k=2;
        while(num != 1){
            if(num % k ==0){
                num /=k;
                System.out.print(k+" ");
            }
            else{
                k++;
            }
        }
    }
    
}