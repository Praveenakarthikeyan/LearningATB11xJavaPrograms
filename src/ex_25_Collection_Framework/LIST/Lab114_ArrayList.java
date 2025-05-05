package ex_25_Collection_Framework.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab114_ArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(null);
        list.add("pen");
        list.add('A');
        list.add(2);
        list.add(true);

        System.out.println(list.contains(2));
        System.out.println(list.size());
        System.out.println(list.indexOf(3));
        System.out.println(list.isEmpty());
        System.out.println(list.lastIndexOf(2));
        System.out.println(list);

        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
