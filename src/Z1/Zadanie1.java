package Z1;

import java.lang.Comparable;
import java.time.LocalTime;

public class Zadanie1 {
    public static void main(String[]args) {
        Integer[] isSortedInt = new Integer[]{3, 2, 1};
        Integer[] isunSortedInt = new Integer[]{1, 2, 3};
        LocalTime[] isSortedLocalTime = new LocalTime[]{
                LocalTime.of(12,00),
                LocalTime.of(11,2),
                LocalTime.of(11,20)
        };
        LocalTime[] isunSortedLocalTime = new LocalTime[]{
                LocalTime.of(12,10),
                LocalTime.of(11,00),
                LocalTime.of(11,59)
        };
        String[]isSortedStr=new String[]{"d","c","a"};
        String[]isunSortedStr=new String[]{"b","c","a"};
        System.out.println(ArrayUtil.isSorted(isSortedInt));
        System.out.println(ArrayUtil.isSorted(isunSortedInt));
        System.out.println(ArrayUtil.isSorted(isSortedLocalTime));
        System.out.println(ArrayUtil.isSorted(isunSortedLocalTime));
        System.out.println(ArrayUtil.isSorted(isSortedStr));
        System.out.println(ArrayUtil.isSorted(isunSortedStr));
    }
    static class ArrayUtil{
        public static <T extends Comparable<T>>boolean isSorted(T[]array){
            for(int i=0;i<array.length-1;i++)
                if(array[i+1].compareTo(array[i])>0){
                    return false;
                }
            return true;
        }
    }
}
