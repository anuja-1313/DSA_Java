package dsa_foundational;

import java.util.HashMap;

public class HashMapIntro {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(10,30);
        hm.put(20,40);
        hm.put(30,50);
        System.out.println(hm.get(10));
        System.out.println(hm.get(40));

        //System.out.println(hm.containsKey(50));
        System.out.println(hm.containsKey(30));
        hm.remove(30);
        System.out.println(hm.containsKey(30));

        for(int key: hm.keySet()){
//            System.out.println(key);
//            System.out.println(hm.get(key));
            System.out.println(key + ", " + hm.get(key));
        }

        System.out.println(hm.size());

    }
}
