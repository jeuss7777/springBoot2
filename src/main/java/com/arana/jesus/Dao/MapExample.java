package com.arana.jesus.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class MapExample {

	/*public static void main(String[] args) {
		//example1();
		exemple2();
	}*/

	private static void exemple2() {
		Map<String, Toto> totos = new HashMap<>();
		Toto jesus = new Toto("Jesus", 30);
		totos.put("toto 2", jesus);
		totos.put("1er toto", new Toto("Anthony", 31));
		
		Toto toto = totos.get("toto 2");
		System.out.println(toto.toString());
		
		System.out.println(totos.containsKey("toto 2"));
		System.out.println(totos.containsKey("sdfsdfsdff"));
		System.out.println("------------------------");
		
		Collection<Toto> totoList = totos.values();
		for(Toto toto2 : totoList){
			System.out.println(toto2.toString());
		}
		
		Set<String> keys = totos.keySet();
		for(String key : keys){
			System.out.println(key);
		}
		
		
	}

	private static void example1() {
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(45, "quarente cinq");
		map1.put(8, "huit");
		
		Set<Integer> keys = map1.keySet();
		for(Integer key : keys){
			System.out.println(key + " - value - " + map1.get(key));
		}
		
		Map<Integer, String> map2 = new TreeMap<>();
		map2.put(45, "quarente cinq");
		map2.put(8, "huit");
		
		Set<Integer> keys2 = map2.keySet();
		for(Integer key2 : keys2){
			System.out.println(key2 + " - value - " + map2.get(key2));
		}
	}
	
	private static class Toto{
		private String name;
		private Integer age;
		
		public Toto(String name, Integer age) {
			this.name = name;
			this.age = age;
		}
		
		public Integer getAge() {
			return age;
		}
		
		public String getName() {
			return name;
		}
		
		public void setAge(Integer age) {
			this.age = age;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		@Override
		public String toString() {
			return name + " - " + age;
		}
	}
}

