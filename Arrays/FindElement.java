package Arrays;

import java.util.Scanner;

public class FindElement {

    public static int FindElement(int[] arr,int elem){
        for(int i=0;i<arr.length;i++){
            if (arr[i] == elem) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int elem=scn.nextInt();
        System.out.println(FindElement(arr,elem));
    }
}