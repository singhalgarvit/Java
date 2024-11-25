import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int i=1;
        int inverseNum=0;
        while(num !=0){
            int temp= num%10;
            inverseNum += i*(int)Math.pow(10, temp-1);
            i++;
            num /= 10;
        }
        System.out.println(inverseNum);
    }
    
}