package Recursion;

import java.util.Scanner;

public class PrintIncreasing {
    public static void pi(int n){
        if(n <= 0)return;
        pi(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pi(n);
    }
    
}