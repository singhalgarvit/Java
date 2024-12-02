import java.util.Scanner;

public class RotateAnArray {

    public static void reverse(int[] arr,int i,int j){
        int li=i;
        int ri=j;
        while (li < ri) {
            int temp=arr[ri];
            arr[ri]=arr[li];
            arr[li]=temp;
            li++;
            ri--;
        }
    }
    public static void RotateAnArray(int[] arr,int k){
        reverse(arr, 0, arr.length-k-1);
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }

        int k=scn.nextInt();
        RotateAnArray(arr,k);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}