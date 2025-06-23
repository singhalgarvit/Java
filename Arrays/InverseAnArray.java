package Arrays;
import java.util.Scanner;

public class InverseAnArray {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int[] inv = new int[n];
        for(int i=0;i<n;i++){
            int c=arr[i];
            inv[c]=i;
        }
        for(int j=0;j<n;j++){
            System.out.println(inv[j]);
        }
    }
}