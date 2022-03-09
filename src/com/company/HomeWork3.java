package com.company;

import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {
        replacementNumber();
        fillingNumber();
        multiplicationBySix();
        square();
        minAndMax();
    }

    public static void replacementNumber() {
        int[] b = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < b.length; i++) ;

        b[0] = 0;
        b[1] = 0;
        b[2] = 1;
        b[3] = 1;
        b[4] = 0;
        b[5] = 1;
        b[6] = 0;
        b[7] = 0;
        b[8] = 1;
        b[9] = 1;

        System.out.println(Arrays.toString(b));
    }

    public static void fillingNumber() {
        int[] p = new int[100];
        for (int i = 0; i < p.length; i++) {
            p[i] = i;
            System.out.println("p [" + i + "] = " + p[i]);

        }
    }

    public static void multiplicationBySix() {
        int[] v = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < v.length; i++) {
            if (v[i] < 6) {
                int i1 = v[i] * 6;
                System.out.println(i1);
            }

        }
    }

    public static void square() {
        int[][] d = new int[3][];
        d[0] = new int[3];
        d[1] = new int[3];
        d[2] = new int[3];
        d[0][0] = 1;
        d[2][2] = 1;
        d[1][1] = 1;
        d[0][2] = 1;
        d[2][0] = 1;

        for (int i = 0; i < d.length; i++) {
            System.out.println(Arrays.toString(d[i]));
        }

    }

    public static int[] Metod(int len, int initialValue) {
        int m[] = new int[len];
        for (int i = 0; i < m.length; i++) {
            m[i] = initialValue;
        }
        return m;
    }



    public static void minAndMax() {
        int [] my = {5,7,6,102,78,93,4,47};
        int min = my[0];
        int max = my[0];
        for (int i = 0; i < my.length; i++){
            if(my[i] < min){
                min = my[i];
            }
            if (my[i] > max){
                max = my[i];
            }
        }
        System.out.println("Максимальное число " + max + " " + "Минимальное число "+ min);
    }
}