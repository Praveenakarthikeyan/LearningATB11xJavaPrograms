package ex_25_Collection_Framework.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab127_HashMap {
    public static void main(String[] args) {

        Map m = new HashMap();
        m.put("id", 1);
        m.put("id",2);
        m.put("id2",3);
        m.put("id3",34);
        m.put("id6",34);
        m.put("id4",null);
        m.put("id5",null);
        m.put(null,102);
        m.put(null,103);
        System.out.println(m);

        System.out.println(m.size());
        System.out.println(m.isEmpty());
        System.out.println(m.containsKey("id3"));
        System.out.println(m.containsValue(99));

        System.out.println(m.keySet());
        System.out.println(m.values());

        System.out.println(m.get("id3"));
    }
}
