package ex_25_Collection_Framework.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab126_MapCreation {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("Name","Seyon");
        m1.put("Age",2);
        m1.put("Phone",631254321);
        System.out.println(m1);

        Map m2 = new LinkedHashMap();
        m2.put("Name","Minnoli");
        m2.put("Roll No",1);
        m2.put("Phone",98743221);
        System.out.println(m2);

        Map m3 = new TreeMap();
        m3.put("Firstname","Praveena");
        m3.put("Lastname","Karthikeyan");
        m3.put("Roll No",1);
        m3.put("Phone",987654321);
        System.out.println(m3);
    }
}
