package usualClass.hashcode;

import usualClass.getClass.Student;

public class test {
    public static void main(String[] args) {
        usualClass.getClass.Student s1 = new usualClass.getClass.Student("zhangsan", 10);
        usualClass.getClass.Student s2 = new Student("lisi", 16);
        System.out.println(s1.hashCode()); //返回存储内存的hashcode
        System.out.println(s2.hashCode()); //返回存储内存的hashcode
    }
}
