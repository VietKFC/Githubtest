package lesson10.collection;

import java.util.HashSet;
import java.util.Iterator;

public class TreeSet {
    public static void main(String [] args){
        java.util.Set<String> hashSet = new HashSet<String>();
        hashSet.add("java");
        hashSet.add("PHP");
        hashSet.add("c++");
        hashSet.add("html");
        for(String s : hashSet){
            System.out.print(s +"  ");
        }
        System.out.println();
        Iterator itr = hashSet.iterator();
        while (itr.hasNext()){
            String s = (String) itr.next();
            System.out.print(s + " ");
        }
    }
}
