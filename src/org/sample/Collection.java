package org.sample;

public class Collection {
	 int a=45;
	public Collection() {
		int a =1;
		int b =2;
		System.out.println("non para cons");
		System.out.println(a+" "+b);
<<<<<<< HEAD
		System.out.println("New Branch is Mani");
=======
		
		System.out.println("New Branch is Aravindh");
>>>>>>> ce87ced75dfe5dff9c503428e0e0d6bea39519e4
	}
	Collection(int y,int z){
		System.out.println("para cons");
		System.out.println(y+" "+z);
		
	}
	Collection(String s){
		System.out.println(s);
	}
	public static void main(String[] args) {
		Collection c = new Collection();
		
		Collection c1 = new Collection(10,20);
		
		Collection c2 = new Collection("vj");
		
	}
}


