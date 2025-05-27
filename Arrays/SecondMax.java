package Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr= {0,-2,0,-3,0,-4};
        int max=arr[0]>arr[1]?arr[0]:arr[1];
        int sMax = arr[0]>arr[1]?arr[1]:arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                sMax = max;
                max = arr[i];
            }
            if(arr[i]<max && arr[i]>sMax){
                sMax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(sMax);
    }
}
