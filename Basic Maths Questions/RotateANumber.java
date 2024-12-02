import java.util.Scanner;

public class RotateANumber {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int k=scn.nextInt();
        int count=0;
        int temp=n;
        while(temp!=0){         //to count the length of the number 
            temp /= 10;
            count++;
        }
        k = k%count;
        if(k<0){
            k=k+count;
        }
        while (k!=0) {
            int q=n%10;
            n /= 10;
            n  += q*(int)Math.pow(10, count-1);
            k--;
        }
        System.out.println(n);
    }
    
}