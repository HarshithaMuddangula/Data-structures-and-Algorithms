import java.util.Arrays;
public class Swap {
    static void main() {
        int[] arr = { 1, 2, 3, 4, 5};
        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));       //[5, 2, 3, 4, 1]

    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
