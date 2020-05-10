package com.collections;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapRunner {

	public static void main(String[] args) {

		/*Map<String, Integer> map = Map.of("A", 3, "B", 4, "Z", 10);
		System.out.println(map);
		/*
		 * System.out.println(map.get("Z")); System.out.println(map.get("A"));
		 * System.out.println(map.get("R")); System.out.println(map.containsKey("A"));
		 * System.out.println(map.containsKey("R"));
		 * System.out.println(map.containsValue(4)); System.out.println(map.keySet());
		 * System.out.println(map.values());
		 */
		/*
		 * Map<String, Integer> hashmap = new HashMap<>(map);
		 * System.out.println(hashmap); System.out.println(hashmap.put("F", 12));
		 * System.out.println(hashmap); System.out.println(hashmap.put("Z", 15));
		 * System.out.println(hashmap);
		 */
		/*
		 * HashMap<String, Integer> hashmap = new HashMap<>();
		 * System.out.println(hashmap); hashmap.put("A", 5); hashmap.put("Z", 15);
		 * hashmap.put("B", 51); hashmap.put("P", 53); System.out.println(hashmap);
		 */
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
		System.out.println(linkedHashMap);
		linkedHashMap.put("A", 5);
		linkedHashMap.put("Z", 15);
		linkedHashMap.put("B", 51);
		linkedHashMap.put("P", 53);
		System.out.println(linkedHashMap);

		TreeMap<String, Integer> treemap = new TreeMap<>();
		System.out.println(treemap);
		treemap.put("A", 5);
		treemap.put("Z", 15);
		treemap.put("B", 51);
		treemap.put("P", 53);
		System.out.println(treemap);
	}

}
