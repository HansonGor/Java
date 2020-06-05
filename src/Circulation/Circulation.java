package src.Circulation;

public class Circulation {
    public static void main(String args[]) {

        // while循环
        int y = 10;
        while (y < 20) {
            System.out.print("value of y : " + y);
            y++;
            System.out.print("\n");
        }

        // do...while循环
        int x = 10;
        do {
            System.out.print("value of x : " + x);
            x++;
            System.out.print("\n");
        } while (x < 20);

        // 3. for循环
        for (int Z = 10; Z < 20; Z = Z + 1) {
            System.out.print("value of Z : " + Z);
            System.out.print("\n");
        }

        // 4. Java 增强 for 循环
        int[] numbers = { 10, 20, 30, 40, 50 };
        for (int A : numbers) {
            System.out.print(A);
            System.out.print(",");
        }

        // break关键字
        for (int B = 10; B < 12; B = B + 1) {
            System.out.print("value of B : " + B);
            System.out.print("\n");
            for (int C = 10; C < 13; C = C + 1) {
                if (C == 12) {
                    break;
                }
                System.out.print("value of C : " + C);
                System.out.print("\n");
            }
        }

        // continue关键字
        for (int B = 10; B < 12; B = B + 1) {
            System.out.print("value of B : " + B);
            System.out.print("\n");
            for (int C = 10; C < 14; C = C + 1) {
                if (C == 12) {
                    continue;
                }
                System.out.print("value of C : " + C);
                System.out.print("\n");
            }
        }

        // return关键字
        // for (int B = 10; B < 12; B = B + 1) {
        //     System.out.print("value of B : " + B);
        //     System.out.print("\n");
        //     for (int C = 10; C < 14; C = C + 1) {
        //         if (C == 12) {
        //             return;
        //         }
        //         System.out.print("value of C : " + C);
        //         System.out.print("\n");
        //     }
        // }

        char grade = 'C';
 
        switch(grade)
        {
           case 'A' :
              System.out.println("优秀"); 
              break;
           case 'B' :
           case 'C' :
              System.out.println("良好");
              break;
           case 'D' :
              System.out.println("及格");
              break;
           case 'F' :
              System.out.println("你需要再努力努力");
              break;
           default :
              System.out.println("未知等级");
        }
        System.out.println("你的等级是 " + grade);

    }
}