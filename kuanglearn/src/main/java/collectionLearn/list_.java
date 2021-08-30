package collectionLearn;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class list_ {

    public static void bubble() {
        ArrayList<Dog> dogList = new ArrayList<>();
        Dog jack = new Dog("jack", 1);
        Dog bob = new Dog("bob", 2);
        Dog mary = new Dog("mary", 5);
        Dog paul = new Dog("paul", 3);
        Dog maira = new Dog("maira", 4);
        Dog tom = new Dog("tom", 8);
        Dog sofi = new Dog("sofi", 4);
        dogList.add(jack);
        dogList.add(bob);
        dogList.add(mary);
        dogList.add(paul);
        dogList.add(maira);
        dogList.add(tom);
        dogList.add(sofi);
        System.out.println(dogList);

        for (int i = 0; i < dogList.size(); i++) {
            List currentDogList = dogList.subList(0, dogList.size() - i);
            for (int i1 = 0; i1 < currentDogList.size() - 1; i1++) {
                if (dogList.get(i1).getAge() > dogList.get(i1 + 1).getAge()) {
                    Dog currentDog = dogList.get(i1);
                    dogList.set(i1, dogList.get(i1 + 1));
                    dogList.set(i1 + 1, currentDog);
                }
            }
        }
        System.out.println(dogList);
    }

    public static void main(String[] args) {
        ArrayList array1 = new ArrayList(); //ArrayList换成Vector(vector线程安全的，用法完全一样)，LinkedList用法完全一样
        array1.add("jack");
        array1.add("mary");
        array1.add(1, "bob");
        System.out.println(array1);

        //indexof,lastIndexOf
        System.out.println("--------------indexof-------------");
        System.out.println(array1.indexOf("mary2"));
        array1.add("jack");
        System.out.println(array1.lastIndexOf("jack"));

        //get
        System.out.println("--------------get-------------");
        System.out.println(array1.get(0));

        //set
        System.out.println("--------------set-------------");
        System.out.println(array1);
        array1.set(0, "paul");
        System.out.println(array1);

        //subList,切片
        System.out.println("--------------subList-------------");
        System.out.println(array1.subList(1, 3));

        // 冒泡排序
        System.out.println("--------------冒泡排序-------------");
        bubble();

    }
}
