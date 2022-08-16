package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ListClasses {

	public static void main(String[] args) {
//	Stack<String> ss = new Stack<String>();
//	ss.push("Raj");
//	ss.push("Ajay");
//	ss.push("Vijay");
//	ss.push("Lokesh");
//	System.out.println(ss);
//	ss.pop();
//	System.out.println(ss);
//	System.out.println(ss.peek());
//	System.out.println(ss);
//	System.out.println("Search "+ss.search("Ajay"));
//	System.out.println("Search "+ss.search("Kishor"));
		
//	ArrayList<Integer> al = new ArrayList<Integer>();
//	al.add(10);
//	al.add(20);
//	al.add(30);
//	System.out.println(al);
//	al.add(1, 100);
//	System.out.println(al);
//	System.out.println(al.remove(new Integer(20)));
//	System.out.println(al.remove(1));
//	System.out.println(al);
//	System.out.println(al.get(0));
//	System.out.println(al.get(1));
		
		LinkedList<Integer> al = new LinkedList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		al.add(1, 100);
		System.out.println(al);
		System.out.println(al.remove(new Integer(20)));
		System.out.println(al.remove(1));
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println(al.get(1));
	}

}
