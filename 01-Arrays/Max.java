import java.util.Arrays;

public class Max {
    static void main() {
        int[] arr = {4,67,24,48,15};
//        System.out.println(maxi(arr, 4,2));
        reverse(arr);
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length -1;
       while(start < end){
           swap(arr,start,end);
           start++;
           end--;
       }
        System.out.println(Arrays.toString(arr));       //[15, 48, 24, 67, 4]

    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static int maxiRange(int[] arr, int start, int end){
        if(end > start) return -1;
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }

    static int maxi(int[] arr){
        if (arr.length == 0) return -1;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
}
