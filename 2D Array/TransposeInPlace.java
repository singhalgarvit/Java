import java.util.Scanner;

public class TransposeInPlace {
    
    static void ReadArray(int[][] arr){
        Scanner scn = new Scanner(System.in);
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }
    static void PrintArray(int[][] arr){
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void swap(int[][] arr,int i,int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
    static void TransposeInPlace(int[][] arr){
        for(int i =0 ;i<arr.length;i++){
            for(int j =0;j<i;j++){
                swap(arr,i,j);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int[][] arr = new int[r][r];
        ReadArray(arr);
        TransposeInPlace(arr);
        PrintArray(arr);
    }
}
