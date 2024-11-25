// Q. Count Total No. of Digits in a Number given

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int digit=scn.nextInt();
        int count=0;
        while(digit!=0){
            digit /= 10;
            count++;
        }
        System.out.println(count);
    }

}