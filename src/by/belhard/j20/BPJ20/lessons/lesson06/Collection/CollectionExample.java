package by.belhard.j20.BPJ20.lessons.lesson06.Collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();// создаем объект коллекции

        List.add(5);
        List.add(20);
        List.add(-11);
        List.add(1);
        System.out.println(list);

        list.add(1,10);
        System.out.println(list);

        System.out.println(list.size());







    }
}
