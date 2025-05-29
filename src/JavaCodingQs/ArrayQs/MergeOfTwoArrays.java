package JavaCodingQs.ArrayQs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeOfTwoArrays {
    public static void main(String[] args) {
        Integer[] a1={1,2,3,4};
        Integer[] a2={5,5,7,8};
     Integer[] result  = Stream.concat(Arrays.stream(a1),Arrays.stream(a2)).toArray(Integer[]::new);
System.out.println(Arrays.toString(result));
    }
}
