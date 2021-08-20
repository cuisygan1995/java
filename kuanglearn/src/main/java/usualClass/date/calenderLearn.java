package usualClass.date;

import java.util.Calendar;

public class calenderLearn {
    public static void main(String[] args) {
        //创建对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.getTime().toLocaleString());
        System.out.println(calendar.getTimeInMillis());
        // 获取时间信息
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH) + 1;
        int dom = calendar.get(calendar.DAY_OF_MONTH);
        int hod = calendar.get(calendar.HOUR_OF_DAY);
        System.out.println(year + " " + month + " " + dom + " " + hod);
        // 修改时间
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.DAY_OF_MONTH, 5);
        System.out.println(calendar2.getTime().toInstant());
        calendar2.add(Calendar.DAY_OF_MONTH,1);
        System.out.println(calendar2.getTime().toInstant());
        // 最后1天+第一天
        System.out.println(calendar2.getActualMinimum(Calendar.DAY_OF_MONTH));
        System.out.println(calendar2.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(calendar2.getActualMinimum(Calendar.YEAR));
        System.out.println(calendar2.getActualMaximum(Calendar.YEAR));

    }
}
