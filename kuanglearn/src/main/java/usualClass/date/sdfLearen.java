package usualClass.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class sdfLearen {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        // date日期转化为字符串
        String str = sdf.format(date);
        System.out.println(str);
        // 把指定格式字符串转化为date类型
        Date date2 = sdf.parse("2021-07-12 00:00:00");
        System.out.println(date2.toLocaleString());
    }
}
