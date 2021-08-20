package usualClass.date;

import java.util.Date;

public class dateLearn {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.getTime());
        Date date2 = new Date(date.getTime()-24*60*60*1000);
        System.out.println(date2.toString());
        System.out.println(date2.after(date));
        System.out.println(date2.before(date));
        System.out.println(date2.compareTo(date));
        System.out.println(date2.equals(date));
    }
}
