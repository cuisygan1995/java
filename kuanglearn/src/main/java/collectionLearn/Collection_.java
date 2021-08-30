package collectionLearn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_ {
    /**
     * collection的常用方法，因为collection为接口不能被实现，以实现类arraylist来演示
     */
    public static void main(String[] args) {
        //collection的一些操作
        ArrayList<Object> dogList = new ArrayList<>();
        Dog jack = new Dog("jack", 1);
        Dog bob = new Dog("bob", 2);
        Dog mary = new Dog("mary", 3);
        Dog maria = new Dog("maria", 4);

        // add
        System.out.println("---------------add---------------");
        dogList.add(jack);
        dogList.add(bob);
        dogList.add(mary);
        System.out.println(dogList);

        // remove(index,obj)
        System.out.println("---------------remove---------------");
//        dogList.remove(2);
//        System.out.println(dogList);
//        dogList.remove(jack);
//        System.out.println(dogList);

        //contains
        System.out.println("---------------contains---------------");
        Boolean exits = dogList.contains(bob);
        System.out.println(exits);
        System.out.println(dogList.contains(maria));

        //size
        System.out.println("---------------size---------------");
        System.out.println(dogList.size());

        // isEmpty
        System.out.println("---------------isEmpty---------------");
        System.out.println(dogList.isEmpty());

        // clear
//        System.out.println("---------------clear---------------");
//        dogList.clear();
//        System.out.println(dogList);

        // andall
        System.out.println("---------------andall---------------");
        ArrayList<Object> array2 = new ArrayList<>();
        array2.add(new Dog("xiaowang", 1));
        array2.add(new Dog("xiaohei", 2));

        dogList.addAll(array2);
        System.out.println(dogList);

        dogList.addAll(0, array2);
        System.out.println(dogList);

        // containsAll
        System.out.println("---------------containsAll---------------");
        System.out.println(dogList.containsAll(array2));

        //removeAll
        System.out.println("---------------removeAll---------------");
        System.out.println(dogList.removeAll(array2));
        System.out.println(dogList);

        // iterator
        System.out.println("---------------iterator---------------");
        Iterator<Object> iterator = dogList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //for
        System.out.println("---------------普通for---------------");
        for (int i = 0; i < dogList.size(); i++) {
            System.out.println(dogList.get(i));

        }

        //for
        System.out.println("---------------增强for---------------");
        for (Object o : dogList) {
            System.out.println(o);
        }

        //for
        System.out.println("---------------forEach---------------");
        dogList.forEach(System.out::println);

    }
}
