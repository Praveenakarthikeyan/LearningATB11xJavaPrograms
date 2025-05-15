package JavaCodingQs.ArrayQs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class ArraySortingWithoutSort {
    public static void main(String[] args) {
        //Approach1
        int[] a = {1,6,2,3,5,8,9};
        for(int i=0;i<a.length;i++) {
            for(int j=i+1;j<a.length;j++) {
                if(a[i]>a[j]) {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int r:a) {
            System.out.println(r);
        }

        //Approach2
        List<Integer> list = new ArrayList<>(Arrays.asList(1,6,2,3,5,8,9));
      System.out.println(list.stream().sorted().collect(Collectors.toList()));

    }
}
