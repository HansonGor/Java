package src.Dates;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {
    public static void main(String []args) {

        // 一. 初始化Date对象
        // 初始化 Date 对象
        Date date = new Date();

        // 使用 toString() 函数显示日期时间
        System.out.println(date.toString());

        // 二. Date 方法
        Date newDate = new Date(999999999);

        // 1. Date.after(Date date) 若当调用此方法的Date对象在指定日期之后返回true,否则返回false。
        System.out.println(newDate.after(date));

        // 2. Date.before(Date date) 若当调用此方法的Date对象在指定日期之前返回true,否则返回false。
        System.out.println(newDate.before(date));

        // 3. Date.clone()
        System.out.println(newDate.clone());

        // 4. Date.compareTo()
        System.out.println(date.compareTo(date));
        System.out.println(newDate.compareTo(date));

        // 5. Date.equals() 当调用此方法的Date对象和指定日期相等时候返回true,否则返回false。
        System.out.println(date.equals(date));
        System.out.println(newDate.equals(date));

        // 6. Date.getTime() 返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
        System.out.println(date.getTime());

        // 7. Date.hasCode() 返回此对象的哈希码值。
        System.out.println(date.hashCode());

        // 8. Date.setTime() 用自1970年1月1日00:00:00 GMT以后time毫秒数设置时间和日期。
        date.setTime(date.getTime() + 60 * 60 * 24 * 1000 * 10);
        System.out.println("next1 time : " + date);

        /**
         9. Date.toString( ) 把此 Date 对象转换为以下形式的 String： dow mon dd hh:mm:ss zzz yyyy 其中：
         dow 是一周中的某一天 (Sun, Mon, Tue, Wed, Thu, Fri, Sat)。
          */
        System.out.println(date.toString());

        // 三. 使用SimpleDateFormat格式化时间
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("G yyyy-mm-dd F");

        System.out.println("当前时间为: " + ft.format(dNow));

        //c的使用
        System.out.printf("全部日期和时间信息：%tc%n",date);
        //f的使用
        System.out.printf("年-月-日格式：%tF%n",date);
        //d的使用
        System.out.printf("月/日/年格式：%tD%n",date);
        //r的使用
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);
        //t的使用
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);
        //R的使用
        System.out.printf("HH:MM格式（24时制）：%tR",date);


    }
}