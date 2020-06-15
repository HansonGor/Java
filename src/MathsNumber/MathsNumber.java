package src.MathsNumber;

public class MathsNumber {  
    public static void main (String []args)  
    {   

        // 一. Math类方法
        System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));  
        System.out.println("0度的余弦值：" + Math.cos(0));  
        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));  
        System.out.println("1的反正切值： " + Math.atan(1));  
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));  
        System.out.println(Math.PI);  



        // 二. Number类方法

        // 1.number.xxxVlue()：转换数字类型
        Integer x = 5;
        // 返回 byte 原生数据类型: 
        System.out.println( x.byteValue() );
   
        // 返回 double 原生数据类型
        System.out.println(x.doubleValue());
   
        // 返回 long 原生数据类型
        System.out.println( x.longValue() );

        // 2. number.compareTo()：数字比较
        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(5));
        System.out.println(x.compareTo(8));

        // 3. number.equals()：判断number对象是否与参数相等。
        Integer y = 10;
        Integer z =5;
        Short a = 5;

        System.out.println(x.equals(y));  
        System.out.println(x.equals(z)); 
        System.out.println(x.equals(a));


        // 4. number.valueOf()：返回一个 Number 对象指定的内置数据类型。
        Integer d =Integer.valueOf(9);
        Double c = Double.valueOf(5);
        Float v = Float.valueOf("80");              

        Integer b = Integer.valueOf("444",16);   // 使用 16 进制

        System.out.println(d);
        System.out.println(c);
        System.out.println(v);
        System.out.println(b);

        // 5. number.toString()： 以字符串形式返回值。
        System.out.println(x.toString());  

        // 6. number.parseInit() number.parseDouble() // 将字符串解析为int类型。
        double g = Double.parseDouble("5");
        System.out.println(g);
        System.out.println(Integer.parseInt("444",16)); // 使用16进制

        // 7. number.abs() // 返回参数的绝对值。
        Integer aa = -8;
        double bb = -100;
        float cc = -90;
        System.out.println(Math.abs(aa));
        System.out.println(Math.abs(bb));     
        System.out.println(Math.abs(cc));  

        // 8. number.ceil() // 返回值大于或等于给定的参数：double 或 float 的原生数据类型。
        // 9. number.floor() // 返回值小于或等于给定的参数：double 或 float 的原生数据类型。
        double dd = 100.675;
        float ff = -90; 
        System.out.println(Math.ceil(dd));
        System.out.println(Math.ceil(ff)); 
        System.out.println(Math.floor(dd));
        System.out.println(Math.floor(ff)); 

        // 10. number.rint() // 返回值小于或等于给定的参数：double 或 float 的原生数据类型。
        double ddd = 100.675;
        double eee = 100.500;
        double fff = 100.200;

        System.out.println(Math.rint(ddd));
        System.out.println(Math.rint(eee)); 
        System.out.println(Math.rint(fff)); 

        // 11.number.round() // 方法返回一个最接近的 int、long 型值，四舍五入。
        System.out.println(Math.round(ddd));
        System.out.println(Math.round(eee)); 
        System.out.println(Math.round(fff)); 

        // 12. number.min() // 方法用于返回两个参数中的最小值
        System.out.println(Math.min(12.123, 12.456));      
        System.out.println(Math.min(23.12, 23.0));

        // 13. number.max() // 方法用于返回两个参数中的最大值
        System.out.println(Math.max(12.123, 18.456));      
        System.out.println(Math.max(23.12, 23.0));  

       // 14. number.exp() // 返回自然数底数e的参数次方。
       double xx = 11.635;
       double yy = 2.76; 
       System.out.printf("e 的值为 %.4f%n", Math.E);
       System.out.printf("exp(%.3f) 为 %.3f%n", xx, Math.exp(xx)); 

       // 15. number.log() 方法用于返回参数的自然数底数的对数值。
       System.out.printf("e 的值为 %.4f%n", Math.E);
       System.out.printf("log(%.3f) 为 %.3f%n",  xx, yy, Math.log(xx));

       // 16. number.pow() 方法用于返回第一个参数的第二个参数次方
       System.out.printf("pow(%.3f, %.3f) 为 %.3f%n", xx, yy, Math.pow(xx, yy));

       // 17. number.sqrt() 求参数的算术平方根。
       System.out.printf("sqrt(%.3f) 为 %.3f%n", x, Math.sqrt(x));

       // 18. number.sin() 返回指定double类型参数的正弦值。
       // 19. number.cos() 返回指定double类型参数的余弦值。
       // 20. number.tan() 返回指定double类型参数的余弦值。
       // 21. number.asin() 返回指定double类型参数的反正弦值。
       // 22. number.acos() 返回指定double类型参数的反余弦值。
       // 23. number.atan() 返回指定double类型参数的反正切值。
       double degrees = 45.0;
       double radians = Math.toRadians(degrees);

       System.out.format("pi 的值为 %.4f%n", Math.PI);
       System.out.format("%.1f 度的正弦值为 %.4f%n", degrees, Math.sin(radians));
       System.out.format("%.1f 度的余弦值为 %.4f%n", degrees, Math.cos(radians));
       System.out.format("%.1f 度的正切值是 %.4f%n", degrees, Math.tan(radians));
       System.out.format("%.4f 的反正弦值为 %.4f 度 %n", Math.sin(radians), Math.toDegrees(Math.asin(Math.sin(radians))));
       System.out.format("%.4f 的反正切值 %.4f 度 %n", Math.cos(radians), Math.toDegrees(Math.atan(Math.sin(radians))));
        
       // 24. number.atan2(): atan2() 方法用于将矩形坐标 (x, y) 转换成极坐标 (r, theta)，返回所得角 theta。该方法通过计算 y/x 的反正切值来计算相角 theta，范围为从 -pi 到 pi。
       double xxxx = 45.0;
       double yyyy = 30.0;
       System.out.println( Math.atan2(xxxx, yyyy) );

       // 25. number.toDegrees(): 用于将参数转化为角度
       double xxxxx = 45.0;
       double yyyyy = 30.0;

       System.out.println( Math.toDegrees(xxxxx) );
       System.out.println( Math.toDegrees(yyyyy) );

       // 26.  number.toRadians()： 方法用于返回一个随机数，随机数范围为 0.0 =< Math.random < 1.0。
       double xxxxxx = 45.0;
       double yyyyyy = 30.0;

       System.out.println( Math.toRadians(xxxxxx) );
       System.out.println( Math.toRadians(yyyyyy) );

       // 27. number.random()：方法用于返回一个随机数，随机数范围为 0.0 =< Math.random < 1.0。
       System.out.println( Math.random() );
       System.out.println( Math.random() );

    }  
}