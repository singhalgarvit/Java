package Arrays;

public class Sort0sand1s {
    static void swap(int[] arr,int k,int i){
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
    public static void sortZeroesAndOne(int[] arr) {
        int k = -1;
    	for(int i =0;i<arr.length;i++){
            if(arr[i] == 1){
                k = i;
                break;
            }
        }
        for(int i = k+1;i<arr.length;i++){
            if(arr[i] == 0){
                swap(arr,k,i);
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,0,0,1,0,1,1,0,0};
        sortZeroesAndOne(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
