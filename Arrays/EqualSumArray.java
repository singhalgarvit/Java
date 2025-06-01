package Arrays;

public class EqualSumArray {
    static boolean checkEql(int[] arr){
        int n = arr.length;
        int j = n-1;
        int i = j-1;
        while(i>=0){
            if(arr[n-1]-arr[i] == arr[i])return true;
            i--;
            j--;
        }
        return false;
    }
    public static void main(String[] args) {
        // int[] arr= {5,3,2,6,3,1};
        // int[] arr= {1,3,2,4,5};
        int[] arr= {15,5,6,4,8,2};
        // int[] arr= {5,8,2,3,4};
        for(int i=1;i<arr.length;i++){
            arr[i] += arr[i-1];
        }
        System.out.println(checkEql(arr));
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
    }

}
