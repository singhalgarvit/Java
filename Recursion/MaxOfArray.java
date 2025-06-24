package Recursion;
public class MaxOfArray {
    public static int max(int[] arr,int idx){
        if(idx == arr.length-1)return arr[idx];
        return Math.max(arr[idx], max(arr, idx+1));
    }
    public static void main(String[] args) {
        int[] arr = {10,20,15,30,25};
        System.out.println(max(arr, 0));
    }
    
}