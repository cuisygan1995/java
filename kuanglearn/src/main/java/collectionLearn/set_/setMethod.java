package collectionLearn.set_;

import java.util.HashSet;

public class setMethod {
    public static void main(String[] args) {
        // set里无序，不能重复，但是取出的顺序是固定的
        HashSet set = new HashSet();
        set.add("jack");
        set.add("bob");
        set.add("jack");
        set.add(null);
        set.add(null);
        System.out.println(set);
    }
}
