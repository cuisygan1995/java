package usualClass.getClass;

import com.sun.prism.shader.Solid_ImagePattern_Loader;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 10);
        Student s2 = new Student("lisi", 16);
        Class a1 = s1.getClass();
        Class a2 = s2.getClass();
        System.out.println(a1);
        System.out.println(a1);
        if (a1 == a2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
