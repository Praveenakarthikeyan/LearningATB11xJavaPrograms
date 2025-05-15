package JavaCodingQs.StringQs;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateWordInString {
    public static void main(String[] args) {
        String s = "This test is This test is only Test";
        String[] w = s.split(" ");
        Set set = new LinkedHashSet();
        for(String a:w){
            set.add(a);
        }
        System.out.println(set);
    }
}
