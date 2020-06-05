package src.Operation;

public class Operation {

    public static void main(String[] args) {
        int a = 60;
        int b = 13;
        int c = 25;
        int d = 25;

        // 1. 算数运算符
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a++   = " +  (a++) );
        System.out.println("a--   = " +  (a--) );
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );

        // 2. 关系运算符
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );

        // 3. 位运算符
        c = a & b;       /* 12 = 0000 1100 */
        System.out.println("a & b = " + c );
    
        c = a | b;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + c );
    
        c = a ^ b;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c );
    
        c = ~a;          /*-61 = 1100 0011 */
        System.out.println("~a = " + c );
    
        c = a << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c );
    
        c = a >> 2;     /* 15 = 1111 */
        System.out.println("a >> 2  = " + c );
     
        c = a >>> 2;     /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c );

        // 4. 逻辑运算符
        boolean e = true;
        boolean f = false;
        System.out.println("e && f = " + (e&&f));
        System.out.println("e || f = " + (e||f) );
        System.out.println("!(e && f) = " + !(e && f));

        // 5. 赋值运算符
        c = a + b;
        System.out.println("c = a + b = " + c );
        c += a ;
        System.out.println("c += a  = " + c );
        c -= a ;
        System.out.println("c -= a = " + c );
        c *= a ;
        System.out.println("c *= a = " + c );
        a = 10;
        c = 15;
        c /= a ;
        System.out.println("c /= a = " + c );
        a = 10;
        c = 15;
        c %= a ;
        System.out.println("c %= a  = " + c );
        c <<= 2 ;
        System.out.println("c <<= 2 = " + c );
        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );
        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );
        c &= a ;
        System.out.println("c &= a  = " + c );
        c ^= a ;
        System.out.println("c ^= a   = " + c );
        c |= a ;
        System.out.println("c |= a   = " + c );

        // 6. 条件运算符
        int g = 10, h = 20;
        int i = (g == h) ? 3 : 2;
        System.out.println("g: " + i );

        // 7. instanceof 运算符
        Operation j = new Operation();
        boolean result =  j instanceof Operation;
        System.out.println( result);

    }

}