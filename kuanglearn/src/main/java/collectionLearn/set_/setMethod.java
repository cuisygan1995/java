package collectionLearn.set_;

import collectionLearn.Dog;

import java.util.HashSet;
import java.util.Objects;

@SuppressWarnings("all")
public class setMethod {

    public static void add_test1() {
        HashSet set = new HashSet();
        set.add(new Cat("jack", 1));
        set.add(new Cat("bob", 2));
        set.add(new Cat("jack", 1));
        System.out.println(set);
    }

    public static void add_test2() {
        // 集合中添加的对象中还有对象
        HashSet set = new HashSet();
//        Date date1 = new Date(2021,10,01);
        set.add(new Cat2("jack", new Date(2021,10,01)));
        set.add(new Cat2("bob", new Date(2021,10,01)));
        set.add(new Cat2("jack", new Date(2021,10,01)));
        System.out.println(set);
    }

    public static void main(String[] args) {

        // hashset底层是hashMap（hashMap底层：数组+单项连标+红黑树👉存储效率搞）
        // 可以存放空值，但是只能有一个null
        // set里无序，不能重复，但是取出的顺序是固定的
        // 不能有重复的顺序
        // 执行add方法时，会返回一个布尔值
        // 可以通过remove删除某一个对象

        HashSet set = new HashSet();
        set.add("jack");
        set.add("bob");
        set.add("jack"); //和上面jack是指向同一个常量池子，因此是同一个数，加不进去
        set.add(null);
        set.add(null);
        System.out.println(set);

        System.out.println(set.add("jack")); //false

        //remove
//        System.out.println("--------------remove----------------");
//        set.remove("jack");
//        System.out.println(set);

        //经典面试题,需要看源码，看底层机制
        set.add(new Dog("tom", 1));
        set.add(new Dog("tom", 1)); //指向不同对象，可以添加成功
        System.out.println(set);

        set.add(new String("test")); //ok
        set.add(new String("test")); //加入失败
        System.out.println(set);

        // 重写hachcode和equal之后
        add_test1();
        add_test2();
    }
}

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && name.equals(cat.name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

class Cat2 {
    private String name;
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Cat2(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Cat2{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat2 cat2 = (Cat2) o;
        return Objects.equals(name, cat2.name) && Objects.equals(date, cat2.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date);
    }
}

class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return year == date.year && month == date.month && day == date.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}

