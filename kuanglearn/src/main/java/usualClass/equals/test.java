package usualClass.equals;

import usualClass.hashcode.Student;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 10);
        Student s2 = new Student("zhangsan", 10);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s1.equals(s2));
    }
}
