import java.util.Scanner;

public class TransposeMatrix {

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
    static void TransposeMatrix(int[][] arr,int[][] ans){
        for(int i =0;i<ans.length;i++){
            for(int j =0; j<arr.length;j++){
                ans[i][j] = arr[j][i];
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();
        int[][] arr = new int[r1][c1];
        int[][] ans = new int[c1][r1];
        ReadArray(arr);
        TransposeMatrix(arr, ans);
        PrintArray(ans);
    }
}
