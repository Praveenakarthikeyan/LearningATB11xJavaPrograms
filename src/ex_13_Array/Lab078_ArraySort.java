package ex_13_Array;

import java.util.Arrays;

public class Lab078_ArraySort {
    public static void main(String[] args) {
        int num[] ={10,8,14,6,21,30};
        System.out.println("Before Sorting");
        for(int i: num){
            System.out.print(i+ " ");
        }
        Arrays.sort(num);

        System.out.println("\nAfter Sorting");
        for (int i : num)
            System.out.print(i+" ");
    }
    }

