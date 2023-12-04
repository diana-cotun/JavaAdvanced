package Collections;


import java.util.*;

public class MainSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
//        un container/ o colectie care stocheaza date unice;
        names.add("Alina");
        names.add("Diana");
        names.add("Alina");
        System.out.println(names);

        names.remove("Diana");
        System.out.println(names);

        if (names.contains("Alina")) {
            System.out.println("Alina is in the set");
        } else {
            System.out.println("Alina is not in the set");
        }

//        HashSet: o clasa care face impliments la Set
//        Alte metode:
//        isEmpty - returneaza boolean;
//        clear() - daca vrem sa stergem tot;
//        addAll() - adauga toate obiectele din liste;

        Set<Integer> numbers = new TreeSet<>();
//        le stocheaza in oridine crescatoare (int)/ alfabetica (String), dar sunt doar date unice;
//        consuma mai mult timp/ energie decat un HashSet;
        numbers.add(5);
        numbers.add(2);
        numbers.add(1);
        numbers.add(7);
        numbers.add(5);
        System.out.println(numbers);



        Set<String> movies = new LinkedHashSet<>();
//        le stocheaza in ordinea in care le adaugam;
        movies.add("Titanic");
        movies.add("Avatar");
        movies.add("Avengers");
        movies.add("Avatar2");
        System.out.println(movies);


    }

}
