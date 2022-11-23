package org.sample;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class OneWith {
	
	public static void main(String[] args) {
		
		
	
		
		
		List<LinkedHashMap<String,String>> m=new ArrayList<LinkedHashMap<String,String>>();
		
		LinkedHashMap<String,String> m1=new LinkedHashMap<>();
		m1.put("Name", "Vijay");
		m1.put("Email", "Vijay@gmail.com");
		m1.put("City","Chennai");
		
		LinkedHashMap<String,String> m2=new LinkedHashMap<>();
		m2.put("Name", "Ajay");
		m2.put("Email", "Ajay@gmail.com");
		m2.put("City","trichy");
		
		
		m.add(m1);
		m.add(m2);
		
		LinkedHashMap<String,String> linkedHashMap = m.get(0);
		
		String string = linkedHashMap.get("City");
		
		System.out.println(string);
		
		
		String string2 = m.get(0).get("City");
	System.out.println(string2);
		
		
		
		
		
		
//		
//		
//		Map<String, String> m=new LinkedHashMap<String, String>();
//		
//		m.put("Name", "Vijay");
//		m.put("Email", "Vijay@gmail.com");
//		m.put("City","Chennai");
//		
//		
//		
//		String u = m.get("Email");
//		System.out.println(u);
		
		
		
		
		
	}

}
