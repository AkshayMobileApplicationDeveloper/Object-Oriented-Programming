package CollectionFramework;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class Example {
    public static void main(String[] args) {

        System.out.println("_______________________________");

        HashMap hashMap=new HashMap();
        hashMap.put("Java","866");
        hashMap.put("PHP","8080");
        hashMap.put("C","5500");
        hashMap.put("C++","4400");
        hashMap.put("Python","444");

        System.out.println(hashMap);
        System.out.println("_______________________________");

        hashMap.forEach((e1, e3) -> {
            System.out.println(e1 + " => " + e3);
        });


    }
}
