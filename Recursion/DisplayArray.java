package Recursion;

public class DisplayArray{
    public static void display(int[] arr, int idx){
        if(idx == arr.length)return;
        System.out.println(arr[idx]);
        display(arr, idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        display(arr,3);
    } 
}