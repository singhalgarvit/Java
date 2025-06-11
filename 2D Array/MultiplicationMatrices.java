import java.util.Scanner;

public class MultiplicationMatrices {
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
    static void MultiplicationMatrices(int[][] arr1,int[][] arr2,int[][] ans){
        for(int i = 0;i<arr1.length;i++){
            for(int j = 0;j<arr2[0].length;j++){
                for(int k=0;k<arr2.length;k++){
                    ans[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a1r = scn.nextInt();
        int a1c = scn.nextInt();    //arr 1 column = arr 2 row
        int a2c = scn.nextInt();
        int[][] arr1 = new int[a1r][a1c];
        int[][] arr2 = new int[a1c][a2c];
        int[][] ans = new int[a1r][a2c];
        ReadArray(arr1);
        ReadArray(arr2);
        MultiplicationMatrices(arr1, arr2, ans);
        PrintArray(ans);
    }
}
