package src.Strings;

import java.io.UnsupportedEncodingException;

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

        // ① 返回参与比较的前后两个字符串的asc码的差值，如果两个字符串首字母不同，则该方法返回首字母的asc码的差值
        String a1 = "a";
        String a2 = "c";
        System.out.println(a1.compareTo(a2)); // -2

        // ② 即参与比较的两个字符串如果首字符相同，则比较下一个字符，直到有不同的为止，返回该不同的字符的asc码差值
        a1 = "aa";
        a2 = "ad";
        System.out.println(a1.compareTo(a2)); // -3
        
        // ③ 如果两个字符串不一样长，可以参与比较的字符又完全一样，则返回两个字符串的长度差值
        a1 = "aa";
        a2 = "aa12345678";
        System.out.println(a1.compareTo(a2)); // -8

        
        // 3. String.compareToIgnoreCase() 用于按字典顺序比较两个字符串，不考虑大小写。
        String str1 = "STRINGS";
        String str2 = "Strings";
        String str3 = "Strings123";

        int result3 = str1.compareToIgnoreCase( str2 );
        System.out.println(result3);
      
        result3 = str2.compareToIgnoreCase( str3 );
        System.out.println(result3);
     
        result3 = str3.compareToIgnoreCase( str1 );
        System.out.println(result3);


        // 4. String.concat() 用于将指定的字符串参数连接到字符串上。
        String ss = "菜鸟教程：";
        ss = ss.concat("www.runoob.com");
        System.out.println(ss);

        /**
         *  5. String.contentEquals() 用于将此字符串与指定的 StringBuffer 比较。
         *  如字符串与指定 StringBuffer 表示相同的字符序列，则返回 true；否则返回 false。
         * */
        str1 = "String1";
        str2 = "String2";
        StringBuffer str33 = new StringBuffer( "String1");

        boolean  result11 = str1.contentEquals( str33 );
        System.out.println(result11);
          
        result11 = str2.contentEquals( str33 );
        System.out.println(result11);

        /**
         *  6. String.copyValueOf()
         *  ① public static String copyValueOf(char[] data): 返回指定数组中表示该字符序列的字符串。
         *  ② public static String copyValueOf(char[] data, int offset, int count): 返回指定数组中表示该字符序列的 字符串。参数↓
         *  data -- 字符数组；offset -- 子数组的初始偏移量；count -- 子数组的长度
         * */
        char[] Str11 = {'h', 'e', 'l', 'l', 'o', ' ', 'r', 'u', 'n', 'o', 'o', 'b'};
        String Str22 = "";
 
        Str22 = Str22.copyValueOf( Str11 );
        System.out.println("返回结果：" + Str22);
 
        Str22 = Str22.copyValueOf( Str11, 2, 6 );
        System.out.println("返回结果：" + Str22);

        // 7. String.endWith() 用于测试字符串是否以指定的后缀结束。
        String Str = new String("菜鸟教程：www.runoob.com");
        boolean retVal;

        retVal = Str.endsWith( "runoob" );
        System.out.println("返回值 = " + retVal );

        retVal = Str.endsWith( "com" );
        System.out.println("返回值 = " + retVal );

        // 8. String.equals() 用于将字符串与指定的对象比较。
        String Str144 = new String("runoob");
        String Str2222 = Str144;
        String Str33 = new String("runoob");
        boolean retVal2;

        retVal2 = Str144.equals( Str2222 );
        System.out.println("返回值 = " + retVal2 );

        retVal2 = Str144.equals( Str33 );
        System.out.println("返回值 = " + retVal2 );

        // 9. String.equalsIgnoreCase() 用于将字符串与指定的对象比较，不考虑大小写。
        String Str3 = new String("runoob");
        String Str4 = new String("RUNOOB");
        retVal2 = Str3.equalsIgnoreCase( Str4);
        System.out.println("返回值 = " + retVal2 );

        /**
         * 10. String.getBytes()：使用指定的字符集将字符串编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
         * ① 使用指定的字符集将字符串编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
         * ② getBytes(): 使用平台的默认字符集将字符串编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
         * */
        String Str11111 = new String("runoob");

        try{
            byte[] Str22222 = Str11111.getBytes();
            System.out.println("返回值：" + Str22222 );

            Str22222 = Str11111.getBytes( "UTF-8" );
            System.out.println("返回值：" + Str22222 );

            Str22222 = Str11111.getBytes( "ISO-8859-1" );
            System.out.println("返回值：" + Str22222 );
        } catch ( UnsupportedEncodingException e){
            System.out.println("不支持的字符集");
        }

        /**
         * 11. String.getChars() 字符从字符串复制到目标字符数组。
         * srcBegin -- 字符串中要复制的第一个字符的索引。
         * srcEnd -- 字符串中要复制的最后一个字符之后的索引。
         * dst -- 目标数组。
         * dstBegin -- 目标数组中的起始偏移量。
         * */
        String Str123 = new String("www.runoob.com");
        char[] Str234 = new char[6];

        try {
            Str123.getChars(4, 10, Str234, 0);
            System.out.print("拷贝的字符串为：" );
            System.out.println(Str234 );
        } catch( Exception ex) {
            System.out.println("触发异常...");
        }

        // 12. String.hashCode() 方法用于返回字符串的哈希码。
        String Strs = new String("www.runoob.com");
        System.out.println("字符串的哈希码为 :" + Strs.hashCode() );

        /**
         * 13. String.indexOf() 返回指定字符在此字符串中第一次出现处的索引。
         * ch -- 字符，Unicode 编码。
         * fromIndex -- 开始搜索的索引位置，第一个字符是 0 ，第二个是 1 ，以此类推。
         * str -- 要搜索的子字符串。
         * */
        String string = "aaa456ac";
        //查找指定字符是在字符串中的下标。在则返回所在字符串下标；不在则返回-1.
        System.out.println(string.indexOf("b")); // indexOf(String str); 返回结果：-1，"b"不存在

        // 从第四个字符位置开始往后继续查找，包含当前位置
        System.out.println(string.indexOf("a",3));//indexOf(String str, int fromIndex); 返回结果：6

        //（与之前的差别：上面的参数是 String 类型，下面的参数是 int 类型）参考数据：a-97,b-98,c-99

        // 从头开始查找是否存在指定的字符
        System.out.println(string.indexOf(99));//indexOf(int ch)；返回结果：7
        System.out.println(string.indexOf('c'));//indexOf(int ch)；返回结果：7

        //从fromIndex查找ch，这个是字符型变量，不是字符串。字符a对应的数字就是97。
        System.out.println(string.indexOf(97,3));//indexOf(int ch, int fromIndex); 返回结果：6
        System.out.println(string.indexOf('a',3));//indexOf(int ch, int fromIndex); 返回结果：6


        // 14. String.intern() 方法返回字符串对象的规范化表示形式
        String Str1 = new String("www.runoob.com");
        String Str2 = new String("WWW.RUNOOB.COM");

        System.out.print("规范表示:" );
        System.out.println(Str1.intern());

        System.out.print("规范表示:" );
        System.out.println(Str2.intern());

        // 15. String.lastIndexOf(): 返回指定字符在此字符串中最后一次出现处的索引
        String Str1234 = new String("菜鸟教程:www.runoob.com");
        String SubStr1 = new String("runoob");
        String SubStr2 = new String("com");

        System.out.print("查找字符 o 最后出现的位置 :" );
        System.out.println(Str1234.lastIndexOf( 'o' ));
        System.out.print("从第14个位置查找字符 o 最后出现的位置 :" );
        System.out.println(Str1234.lastIndexOf( 'o', 14 ));
        System.out.print("子字符串 SubStr1 最后出现的位置:" );
        System.out.println( Str1234.lastIndexOf( SubStr1 ));
        System.out.print("从第十五个位置开始搜索子字符串 SubStr1最后出现的位置 :" );
        System.out.println( Str1234.lastIndexOf( SubStr1, 15 ));
        System.out.print("子字符串 SubStr2 最后出现的位置 :" );
        System.out.println(Str1234.lastIndexOf( SubStr2 ));

        // 16. String.length(): 返回字符串的长度
        System.out.print(Str1234.length() );

        // 17. String.matches(): 用于检测字符串是否匹配给定的正则表达式，返回布尔值
        Str = new String("www.runoob.com");

        System.out.print("返回值 :" );
        System.out.println(Str.matches("(.*)runoob(.*)"));

        System.out.print("返回值 :" );
        System.out.println(Str.matches("(.*)google(.*)"));

        System.out.print("返回值 :" );
        System.out.println(Str.matches("www(.*)"));

        /**
         * 18. String.regionMatches() 用于检测两个字符串在一个区域内是否相等
         * ignoreCase -- 如果为 true，则比较字符时忽略大小写。
         * toffset -- 此字符串中子区域的起始偏移量。
         * other -- 字符串参数。
         * ooffset -- 字符串参数中子区域的起始偏移量。
         *len -- 要比较的字符数。
         * */
        Str1 = new String("www.runoob.com");
        Str2 = new String("runoob");
        Str3 = new String("RUNOOB");

        System.out.print("返回值 :" );
        System.out.println(Str1.regionMatches(4, Str2, 0, 5));

        System.out.print("返回值 :" );
        System.out.println(Str1.regionMatches(4, Str3, 0, 5));

        System.out.print("返回值 :" );
        System.out.println(Str1.regionMatches(true, 4, Str3, 0, 5));

        // 19. String.replace(): 用 newChar 字符替换字符串中出现的所有 oldChar 字符，并返回替换后的新字符串。
        String Str12345 = new String("hello, Hello. Hello，我Hello");

        System.out.print("返回值 :" );
        System.out.println(Str12345.replace('o', 'T'));

        System.out.print("返回值 :" );
        System.out.println(Str12345.replace('l', 'D'));

        // 20. String.replaceAll() 方法使用给定的参数 replacement 替换字符串所有匹配给定的正则表达式的子字符串。
        Str = new String("www.google.com");
        System.out.print("匹配成功返回值 :" );
        System.out.println(Str.replaceAll("(.*)google(.*)", "runoob" ));
        System.out.print("匹配失败返回值 :" );
        System.out.println(Str.replaceAll("(.*)taobao(.*)", "runoob" ));

        /**
         * 21. String.replaceFirst(): 使用给定的参数 replacement 替换字符串第一个匹配给定的正则表达式的子字符串。
         * @returns 成功则返回替换的字符串，失败则返回原始字符串。
         * */
        Str = new String("hello runoob，I am from runoob。");

        System.out.print("返回值 :" );
        System.out.println(Str.replaceFirst("runoob", "google" ));
        System.out.print("返回值 :" );
        System.out.println(Str.replaceFirst("(.*)runoob(.*)", "google" ));


        str = new String("Welcome-to-Runoob");

        System.out.println("- 分隔符返回值 :" );
        for (String retval: str.split("-")){
            System.out.println(retval);
        }

        System.out.println("");
        System.out.println("- 分隔符设置分割份数返回值 :" );
        for (String retval: str.split("-", 2)){
            System.out.println(retval);
        }

        System.out.println("");
        str2 = new String("www.runoob.com");
        System.out.println("转义字符返回值 :" );
        for (String retval: str2.split("\\.", 3)){
            System.out.println(retval);
        }

        System.out.println("");
        str3 = new String("acount=? and uu =? or n=?");
        System.out.println("多个分隔符返回值 :" );
        for (String retval: str3.split("and|or")){
            System.out.println(retval);
        }


        /**
         * 22. String.startsWith(): 用于检测字符串是否以指定的前缀开始。
         * prefix -- 前缀。
         * toffset -- 字符串中开始查找的位置。
         * */
        Str = new String("www.runoob.com");

        System.out.print("返回值 :" );
        System.out.println(Str.startsWith("www") );

        System.out.print("返回值 :" );
        System.out.println(Str.startsWith("runoob") );

        System.out.print("返回值 :" );
        System.out.println(Str.startsWith("runoob", 4) );

        /**
         * 23. String.subSequence() 方法返回一个新的字符序列，它是此序列的一个子序列。
         * beginIndex -- 起始索引（包括）。
         * endIndex -- 结束索引（不包括）。
         * */
        Str = new String("www.runoob.com");
        System.out.print("返回值 :" );
        System.out.println(Str.subSequence(4, 10) );

        /**
         * 24. String.substring 返回字符串的子字符串。
         * beginIndex -- 起始索引（包括）, 索引从 0 开始。
         *  endIndex -- 结束索引（不包括）。
         * */
        Str = new String("www.runoob.com");

        System.out.print("返回值 :" );
        System.out.println(Str.substring(4) );

        System.out.print("返回值 :" );
        System.out.println(Str.substring(4, 10) );

        // 25. String.toCharArray() 将字符串转换为字符数组。
        Str = new String("www.runoob.com");
        System.out.print("返回值 :" );
        System.out.println( Str.toCharArray() );

        // 26. String.toLowerCase() 将字符串转换为小写。
        Str = new String("WWW.RUNOOB.COM");

        System.out.print("返回值 :" );
        System.out.println( Str.toLowerCase() );

        // 27. String.toUpperCase() 将字符串转换为大写。
        Str = new String("www.runoob.com");

        System.out.print("返回值 :" );
        System.out.println( Str.toUpperCase() );

        // 28. String.toString() 返回此对象本身（它已经是一个字符串）。
        Str = new String("WWW.RUNOOB.COM");

        System.out.print("返回值 :" );
        System.out.println( Str.toString() );

        // 29. String.trim() 方法用于删除字符串的头尾空白符。
        Str = new String("    www.runoob.com    ");
        System.out.print("原始值 :" );
        System.out.println( Str );

        System.out.print("删除头尾空白 :" );
        System.out.println( Str.trim() );

        // 30. String.valueOf() 返回String类
        double d = 1100.00;
        boolean b = true;
        long l = 1234567890;
        char[] arr = {'r', 'u', 'n', 'o', 'o', 'b' };

        System.out.println("返回值 : " + String.valueOf(d) );
        System.out.println("返回值 : " + String.valueOf(b) );
        System.out.println("返回值 : " + String.valueOf(l) );
        System.out.println("返回值 : " + String.valueOf(arr) );

    }
}
