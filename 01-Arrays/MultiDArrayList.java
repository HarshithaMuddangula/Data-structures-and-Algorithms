import java.util.ArrayList;
import java.util.Scanner;

public class MultiDArrayList {
    static void main() {
        Scanner in = new Scanner(System.in);
        //initialization and declaration of a multidimensional array
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialization
        //inside outer ArrayList ,initialize inner ArrayLists
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        //add elements into arraylists
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);       //[[1, 1, 1], [1, 1, 1], [1, 1, 1]]


        //we can initialize more Arraylists
        list.add(new ArrayList<>());
        System.out.println(list);       //[[1, 1, 1], [1, 1, 1], [1, 1, 1], []]
        list.get(3).add(4);
        list.get(3).add(5);
        System.out.println(list);       //[[1, 1, 1], [1, 1, 1], [1, 1, 1], [4, 5]]


    }
}
