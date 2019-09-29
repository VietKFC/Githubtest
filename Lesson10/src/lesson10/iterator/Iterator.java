package lesson10.iterator;

import java.util.ArrayList;
import java.util.List;
public class Iterator {
    public static void main(String[] agrs){
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        java.util.Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            String s = itr.next();
            System.out.print(s + " ");
        }
    }
}
