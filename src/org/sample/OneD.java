package org.sample;

import java.util.ArrayList;
import java.util.List;

public class OneD {
	
	public static void main(String[] args) {

		
		List<ArrayList<String>> l=new ArrayList<ArrayList<String>>();
		
		
		 ArrayList<String> b=new ArrayList<String>();
		 
		 b.add("vijay");
		 b.add("vijay@gmail.com"); 
		 b.add("Chennai");
		 
		 ArrayList<String> q=new ArrayList<String>();
		 
		 q.add("Ajay");
		 q.add("Ajay@gmail.com"); 
		 q.add("trichy");
		 
		 l.add(b);
		 l.add(q);
		 
		 ArrayList<String> w = l.get(0);
		 String a = w.get(1);
		 System.out.println(a);
		 
		 String string = l.get(0).get(0);
		 System.out.println(string);
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
//	 List<String> b=new ArrayList<String>();
//	 
//	 b.add("vijay");
//	 b.add("vijay@gmail.com"); 
//	 b.add("Chennai");
	 
	 
	 

	 
	 
	 
	 
	}
	
	

}
