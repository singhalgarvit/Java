package Arrays;

public class SortEvenandOdd {
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,3,4,5,1,9,10,6,7};
        int i = 0;
        for(int j =1;j<arr.length;j++){
            if(arr[i]%2 != 0 &&arr[j]%2 == 0){
                swap(arr,i,j);
                i++;
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
