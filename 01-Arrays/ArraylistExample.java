import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExample {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);
//        list.add(12);
//        list.add(22);
//        list.add(4354);
//        list.add(453433);
//        list.add(56);
//        list.add(787);
//        list.add(12);
//        list.add(22);
//        list.add(4354);
//        list.add(453433);
//        list.add(56);
//        list.add(787);
//        list.add(12);
//        list.add(22);
//        list.add(4354);
//        list.add(453433);
//        list.add(56);
//        list.add(787);
//        list.add(12);
//        list.add(22);
//        list.add(4354);
//        list.add(453433);
//        list.add(56);
//        list.add(787);
//        System.out.println(list);       //[12, 22, 4354, 453433, 56, 787, 12, 22, 4354, 453433, 56, 787, 12, 22, 4354, 453433, 56, 787, 12, 22, 4354, 453433, 56, 787]

//        list.add(12);
//        list.add(22);
//        list.add(4354);
//        list.add(453433);
//        list.add(56);
//        list.add(787);

//        System.out.println(list.contains(22));      //true
//        System.out.println(list.contains(44));      //false

//        System.out.println(list);       //[12, 22, 4354, 453433, 56, 787]
//        list.set(1, 0);
//        System.out.println(list);       //[12, 0, 4354, 453433, 56, 787]

//        list.remove(3);
//        System.out.println(list);       //[12, 0, 4354, 56, 787]

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list);       //[43, 4, 3545, 653, 63]


        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }





    }

}
