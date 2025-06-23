package Arrays;
import java.util.Scanner;

public class ReverseAnArray {
    
    public static void Swap(int[] arr,int i){
        int temp=arr[arr.length-1-i];
        arr[arr.length-1-i]=arr[i];
        arr[i]=temp;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        for(int i=0;i<arr.length/2;i++){
            Swap(arr, i);
        }
       for(int j=0;j<arr.length;j++){
        System.out.println(arr[j]);
        }
    }

}