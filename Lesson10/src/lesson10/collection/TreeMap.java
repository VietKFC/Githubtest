package lesson10.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TreeMap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "android");
        hashMap.put(2, "web");
        hashMap.put(3, "10");
        hashMap.put(4, "XP");
        Set<Integer> keySet = hashMap.keySet();
        for(int i : keySet){
            System.out.print("key: " + i + " ");
        }
        System.out.println("");
        for (Map.Entry<Integer, String> s : hashMap.entrySet()) {
            System.out.print(s.getKey() + ". ");
            System.out.print(s.getValue() + "\t");
        }
    }
}
