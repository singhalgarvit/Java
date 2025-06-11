import java.util.Scanner;

public class First{

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
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        ReadArray(arr);
        PrintArray(arr);
    }
}