import java.util.Scanner;

public class AddMatrices {
    
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
    static void AddMatrices(int[][] arr1,int[][] arr2){
        for(int i =0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j] += arr2[i][j];
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        ReadArray(arr1);
        ReadArray(arr2);
        AddMatrices(arr1, arr2);
        PrintArray(arr1);
    }
}
