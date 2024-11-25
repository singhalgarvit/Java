package Functions;

import java.util.Scanner;

public class DigitFrequency {

    public static int getFreq(int n,int digit){
        int freq=0;
        while (n>0) {
            int dig=n%10;
            n /= 10;

            if (dig == digit) {
                freq++;
            }
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int digit=scn.nextInt();
        int f=getFreq(n, digit);
        System.out.println(f);
    }
}