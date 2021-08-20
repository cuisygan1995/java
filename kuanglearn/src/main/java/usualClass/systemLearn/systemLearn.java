package usualClass.systemLearn;

import java.lang.reflect.Array;

public class systemLearn {
    public static void main(String[] args) {
        // arraycopy
        int[] array = {1, 2, 5, 6, 8, 3};
        int[] array2 = new int[6];
        System.arraycopy(array, 2, array2, 2, array.length-2);
        for (int i : array2) {
            System.out.println(i);
        }
        // 当前时间
        System.out.println(System.currentTimeMillis());
        //gc
//        Student student1 = new Student("a",19);
//        Student student2 = new Student("b",19);
//        Student student3 = new Student("c",19);
        new Student("a",19);
        new Student("b",19);
        new Student("c",19);
        System.gc();
        // 退出jvm，xit() 0 正常退出
        System.exit(0);
        System.out.println(System.currentTimeMillis());

    }
}
