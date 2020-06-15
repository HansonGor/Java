package src.Strings;

public class Strings{
    public static void main(String args[]){

        // 一.基本使用
        // 1. 创建字符串
        char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String(helloArray);
        System.out.println( helloString );

        // 2. 字符串长度
        String site = "www.runoob.com";
        int len = site.length();
        System.out.println( "菜鸟教程网址长度 : " + len );

        // 3. 连接字符串
        System.out.println("我的名字是 ".concat("Runoob"));

        // 4.创建格式化字符串
        String str = null;
        str = String.format("Hi,%s:%s.%s", "王南","王力","王张");
        System.out.println(str);

        // 二. String方法
        // 1.String.charAt(): 用于返回指定索引处的字符。索引范围为从 0 到 length() - 1。
        String s = "www.runoob.com";
        char result = s.charAt(5);
        System.out.println(result);

        /**
         2.String1.compareTo(String2):返回值是整型，它是先比较对应字符的大小(ASCII码顺序)，如果第一个字符和参数的第一个字符不等，结束比
         较，返回他们之间的差值，如果第一个字符和参数的第一个字符相等，则以第二个字符和参数的第二个字符做比较，以此类推,直至比较的字符或被比较的
         字符有一方结束。
         *  */
        String str1 = "Strings";
        String str2 = "Strings";
        String str3 = "Strings123";

        int result2 = str1.compareTo( str2 );
        System.out.println(result2);

        result2 = str2.compareTo( str3 );
        System.out.println(result2);

        result2 = str3.compareTo( str1 );
        System.out.println(result2);

    }
}
