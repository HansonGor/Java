package src.Characters;

public class Characters {

    public static void main(String args[]) {
        char ch = 'a';
        // Unicode 字符表示形式
        char uniChar = '\u039A';
        // 字符数组
        char[] charArray = { 'a', 'b', 'c', 'd', 'e' };

        System.out.println(ch);
        System.out.println(uniChar);
        System.out.println(charArray);

        // 原始字符 'a' 装箱到 Character 对象 ch 中
        Character ch2 = new Character('a');

        // 原始字符 'a' 装箱到 Character 对象 ch 中
        Character ch3 = 'a';

        // 原始字符 'x' 用 test 方法装箱
        // 返回拆箱的值到 'c'
//        char c = test('x');

        System.out.println("我\t不知\b道\n怎么\r做\\啊\'\"\f");

        // 1. char.isLetter(): 用于判断指定字符是否为字母。
        System.out.println(Character.isLetter('c'));
        System.out.println(Character.isLetter('c'));
        System.out.println(Character.isLetter('5'));

        // 2. char.isDigit(): 是否是一个数字字符。
        System.out.println(Character.isLetter('c'));
        System.out.println(Character.isLetter('5'));

        // 3. char.isWhitespace()：是否为空白字符
        System.out.println(Character.isWhitespace('c'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('\n'));
        System.out.println(Character.isWhitespace('\t'));

        // 4. char.isUpperCase()：用于判断指定字符是否为大写字母。
        System.out.println( Character.isUpperCase('c'));
        System.out.println( Character.isUpperCase('C'));

        // 5. char.isLowerCase()：用于判断指定字符是否为小写字母。
        System.out.println( Character.isLowerCase('c'));
        System.out.println( Character.isLowerCase('C'));

        // 6. char.toUpperCase()：用于将小写字符转换为大写。
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toUpperCase('A'));

        // 7. char.toUpperCase()：用于将大写字符转换为小写。
        System.out.println(Character.toLowerCase('a'));
        System.out.println(Character.toLowerCase('A'));

        // 8. char.toString()：用于返回一个表示指定 char 值的 String 对象。结果是长度为 1 的字符串，仅由指定的 char 组成。
        System.out.println(Character.toString('a'));
        System.out.println(Character.toString('A'));

        // 8. char.toString()：用于返回一个表示指定 char 值的 String 对象。结果是长度为 1 的字符串，仅由指定的 char 组成。

    }
}