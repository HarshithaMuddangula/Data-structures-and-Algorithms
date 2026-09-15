
import java.util.Arrays;
import java.util.Scanner;

public class Input02 {
    static void main() {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        // array of primitives
        arr[0] = 343;
        arr[1] = 435;
        arr[2] = 35;
        arr[3] = 5;
        arr[4] = 43;
//        System.out.println(arr[3]);     //5

        // input using for loop
//        for(int i = 0; i < arr.length;i++){
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));       //[1, 2, 3, 3, 23]
//        for(int i = 0; i < arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        for(int num : arr){
//            System.out.print(num+" ");
//        }

//        System.out.println(arr[5]);     //index out of bound error

        // Array of objects
        String[] str = new String[4];
        for(int i = 0;i < str.length;i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));    //[q, w, r, r]

        // modify an array
        str[1] = "lily";
        System.out.println(Arrays.toString(str));   //[q, lily, r, r]


    }
}
