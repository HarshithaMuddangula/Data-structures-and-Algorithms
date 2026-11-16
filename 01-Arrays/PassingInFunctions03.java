
import java.util.Scanner;
import java.util.Arrays;

public class PassingInFunctions03{
    static void main() {
        Scanner in = new Scanner(System.in);
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(nums));          //[1, 2, 3, 4]
        change(nums);
        System.out.println(Arrays.toString(nums));               //[232, 2, 3, 4]

                                                     

    }
        static void change(int[] arr)  {
        arr[0]=232;

        }
        










    }

