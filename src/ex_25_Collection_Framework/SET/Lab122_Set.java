package ex_25_Collection_Framework.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab122_Set {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Praveena");
        hs.add("Olira");
        hs.add("Emy");
        System.out.println(hs);
    }
}
