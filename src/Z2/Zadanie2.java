package Z2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zadanie2 {
    public static void main(String[]args) {
        List<String> list = new ArrayList<>();
        list.add("Jeden");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String str=iterator.next();
            System.out.println(str+",");
        }
        List<String> list2 = new ArrayList<>();
        list2.add("Dwa");

        Iterator<String> iterator2 = list2.iterator();
        while (iterator2.hasNext()){
            String str2=iterator2.next();
            System.out.println(str2+",");
        }
        List<String> list3 = new ArrayList<>();
        list3.add("Trzy");

        Iterator<String> iterator3 = list3.iterator();
        while (iterator3.hasNext()){
            String str3=iterator3.next();
            System.out.println(str3);
        }
    }
}
