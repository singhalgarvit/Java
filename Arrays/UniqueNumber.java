package Arrays;

public class UniqueNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,1,3};
        int ans= arr[0];
        for(int i=1;i<arr.length;i++){
            ans = ans^arr[i];
        }
        System.out.println(ans);
    }
}
