package Recursion;

public class DisplayReverseArray {
    public static void display(int[] arr,int idx){
        if(idx == arr.length)return;
        display(arr, idx+1);
        System.out.println(arr[idx]);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        display(arr, 0);
    }
}
