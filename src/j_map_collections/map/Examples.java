package j_map_collections.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class Examples {

        public static void main(String[] args) {
            // HashMap example
            Map<String, Integer> hashMap = new HashMap<>();
            hashMap.put("Apple", 1);
            hashMap.put("Banana", 2);
            System.out.println("HashMap: " + hashMap);

            // LinkedHashMap example
            Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put("Apple", 1);
            linkedHashMap.put("Banana", 2);
            System.out.println("LinkedHashMap: " + linkedHashMap);

            // Hashtable example
            Map<String, Integer> hashtable = new Hashtable<>();
            hashtable.put("Apple", 1);
            hashtable.put("Banana", 2);
            System.out.println("Hashtable: " + hashtable);
        }

}
