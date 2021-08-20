package usualClass.toString;

import usualClass.hashcode.Student;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 10);
        Student s2 = new Student("lisi", 16);
        System.out.println(s1.toString()); //返回存储内存的hashcode
        System.out.println(s2.toString()); //返回存储内存的hashcode
    }
}
