package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int fn(int n ){
        if(n == 1)return 1;
        return n*fn(n-1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fn(n));
    }
    
}