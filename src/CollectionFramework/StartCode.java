package CollectionFramework;

import java.util.LinkedList;

public class StartCode {
    public static void main(String[] args) {
        System.out.println("Collection FrameWork ..............");
        LinkedList list =new LinkedList();
        list.add(23);
        list.add("string");
        list.add(7690.9);
        System.out.println(list);

        System.out.println(list.isEmpty());
    }
}
