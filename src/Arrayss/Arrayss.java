package src.Arrayss;

import java.util.Arrays;

public class Arrayss {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String args[]) {

        /**
         * 1. 创建数组与数组遍历: dataType[] arrayRefVar = new dataType[arraySize];
         **/
        // 数组大小
        int size = 10;
        // 定义数组
        double[] myList = new double[size];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;
        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += myList[i];
        }
        System.out.println("总和为： " + total);

        // 2. 处理数组
        double[] myList2 = {1.9, 2.9, 3.4, 3.5};

        // 打印所有数组元素
        for (int i = 0; i < myList2.length; i++) {
            System.out.println(myList2[i] + " ");
        }
        // 计算所有元素的总和
        double total2 = 0;
        for (int i = 0; i < myList2.length; i++) {
            total2 += myList2[i];
        }
        System.out.println("Total is " + total);
        // 查找最大元素
        double max = myList2[0];
        for (int i = 1; i < myList2.length; i++) {
            if (myList2[i] > max) max = myList2[i];
        }
        System.out.println("Max is " + max);

        // 打印所有数组元素
        for (double element: myList2) {
            System.out.println(element);
        }

        printArray(new int[]{3, 1, 2, 6, 4, 2});

        // 2. 数组方法
        /**
         * 1. Array.binarySearch(Object[] a, Object key)
         * 用二分查找算法在给定数组中搜索给定值的对象(Byte,Int,double等)。数组在调用前必须排序好的。如果查找值包含在数组中，则返回搜索键的索引；
           否则返回 (-(插入点) - 1)。
         **/
        int a[] = new int[] {1, 3, 4, 4, 6, 8, 9};
        int x1 = Arrays.binarySearch(a, 5);
        int x2 = Arrays.binarySearch(a, 4);
        int x3 = Arrays.binarySearch(a, 0);
        int x4 = Arrays.binarySearch(a, 10);
        System.out.println("x1:" + x1 + ", x2:" + x2);
        System.out.println("x3:" + x3 + ", x4:" + x4);

        /**
         * 2. Array.equals(long[] a, long[] a2)
         * 如果两个指定的 long 型数组彼此相等，则返回 true。如果两个数组包含相同数量的元素，并且两个数组中的所有相应元素对都是相等的，则认为这两
           个数组是相等的。换句话说，如果两个数组以相同顺序包含相同的元素，则两个数组是相等的。同样的方法适用于所有的其他基本数据类型（Byte，short，Int等）。。
         **/
        int a1[] = new int[] {1, 3, 4, 4, 6, 8, 9};
        int a2[] = new int[] {1, 3, 4, 4, 6, 8, 9};
        int a3[] = new int[] {1, 2, 4, 4, 6, 8, 9};
        int a4[] = new int[] {1, 4, 4, 6, 8, 9};
        System.out.println(Arrays.equals(a1, a2));
        System.out.println(Arrays.equals(a1, a3));
        System.out.println(Arrays.equals(a1, a4));

        /**
         * 3.  Array.fill(int[] a, int val)
         * 将指定的 int 值分配给指定 int 型数组指定范围中的每个元素。同样的方法适用于所有的其他基本数据类型（Byte，short，Int等）。
         **/
        boolean[] a5 = new boolean[5];
        Arrays.fill(a5, true);
        for(boolean a55: a5) System.out.println(a55);

        /**
         * 4.  Array.sort(Object[] a)
         * 对指定对象数组根据其元素的自然顺序进行升序排列。同样的方法适用于所有的其他基本数据类型（Byte，short，Int等）。
         **/
        int a6[] = new int[] {10, 2, 3, 4, 5};
        Arrays.sort(a6);
        for(int a66: a6) System.out.println(a66);

    }
}