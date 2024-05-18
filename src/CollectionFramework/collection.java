package CollectionFramework;

import java.util.ArrayList;

public class collection {
    public static void main(String[] args) {
        System.out.println("collection");
        ArrayList<Integer> Int =new ArrayList<Integer>();
        Int.add(45);
        Int.add(47);
        Int.add(48);
        Int.add(65);
        Int.add(82);
        Int.add(25);
        System.out.println(Int);

        System.out.println();

        try {
            System.out.println(Int.get(2));
            System.out.println(Int.get(2));
            System.out.println(Int.get(2));
            System.out.println(Int.get(2));
            System.out.println(Int.get(2));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
