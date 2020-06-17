package src.StringBuffers;

public class StringBuffers{
    public static void main(String args[]){
        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);

        // 一.StringBuffer方法

        // 1. StringBuffer.append() 如上

        // 2. StringBuffer.reverse()
        sBuffer.reverse();
        System.out.println(sBuffer);

        // 3. StringBuffer.delete(int start, int end) 移除此序列的子字符串中的字符。
        sBuffer.delete(0, 1);
        System.out.println(sBuffer);

        // 4. StringBuffer.insert() 将 int 参数的字符串表示形式插入此序列中。
        sBuffer.insert(0, "插入");
        System.out.println(sBuffer);

        // 5. StringBuffer.replace(int start, int end, String str) 给定 String 中的字符替换此序列的子字符串中的字符。
        sBuffer.replace(0,2, "m");
        System.out.println(sBuffer);

        // 6. StringBuffer.capacity() 返回当前容量
        System.out.println(sBuffer.capacity());

        // 7. StringBuffer.charAt() 返回此序列中指定索引处的 char 值。
        System.out.println(sBuffer.charAt(1));

        // 8. StringBuffer.ensureCapacity() 确保容量至少等于指定的最小值。
        sBuffer.ensureCapacity(24);
        System.out.println(sBuffer);

        // 9. StringBuffer.getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin):将字符从此序列复制到目标字符数组 dst。
        char[] Str2 = new char[6];
        sBuffer.getChars(0, 5, Str2, 0);
        System.out.print("拷贝的字符串为：" );
        System.out.println(Str2 );

        // 10. StringBuffer.indexOf(String str, int fromIndex):返回第一次出现的指定子字符串在该字符串中的索引。
        System.out.println(sBuffer.indexOf("o"));

        // 11. StringBuffer.lastIndexOf(String str, int fromIndex):返回最后一次出现的指定子字符串在该字符串中的索引。
        System.out.println(sBuffer.lastIndexOf("o"));

        // 12. StringBuffer.length() 返回长度（字符数）。
        System.out.println(sBuffer.length());

        // 13. StringBuffer.setCharAt(int index, char ch) 将给定索引处的字符设置为 ch。
        sBuffer.setCharAt(0, 'n');
        System.out.println(sBuffer);

        // 14. StringBuffer.setLength(int newLength) 设置字符序列的长度。
        sBuffer.setLength(20);
        System.out.println(sBuffer);

        // ↓类似String
        // 15. StringBuffer.subSequence(int start, int end) 返回一个新的字符序列，该字符序列是此序列的子序列。
        // 16. StringBuffer.substring(int start, int end) 返回一个新的 String，它包含此序列当前所包含的字符子序列。
        // 17. StringBuffer.toString() 返回此序列中数据的字符串表示形式。

    }
}