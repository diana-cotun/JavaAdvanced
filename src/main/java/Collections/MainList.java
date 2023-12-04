package Collections;

import java.util.*;

public class MainList {
    public static void main(String[] args) {

        List<String> names = new LinkedList<>();
//        double linkd list
        names.add("Ana");
        names.add("Diana");
        names.add("Ana");
        names.add("Andrei");

        System.out.println(names);


        names.add(0, "Lara");
        System.out.println(names);

        names.remove(2);
        System.out.println(names);

        names.remove("Ana");
        System.out.println(names);

        names.set(1, "Diana"); // inlocuieste
        System.out.println(names);

        System.out.println(names.get(0));

        names.add("Diana");
        System.out.println(names);

        System.out.println(names.indexOf("Diana"));
        System.out.println(names.lastIndexOf("Diana"));

        List<String> names2 = names.subList(1, 3);
        System.out.println(names2);

        System.out.println(names.size());
//        mai avem metode: isEmpty, isClear, contains, indexOf, lastIndexOf;

        Collections.sort(names);
        System.out.println(names);


    }
}
