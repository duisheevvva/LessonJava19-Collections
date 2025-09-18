package map;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("Java");
        //   key     value
        HashMap<Integer,String> map = new HashMap<>();
        map.put(3,"Python");
        map.put(2,"JS");
        map.put(1,"Java");



//        for (Integer key : map.keySet() ) {
//            System.out.println( key + " " +map.get(key));
//        }

        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Java" , 20);
        hashMap.put("Js" , 20);
        hashMap.put("C++" , 19);

        for (String key : hashMap.keySet() ) {
            System.out.println( key + " " +hashMap.get(key));
        }



    }
}
