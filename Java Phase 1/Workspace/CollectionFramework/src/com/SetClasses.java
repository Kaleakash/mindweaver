package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetClasses {

	public static void main(String[] args) {
//	HashSet hs1 = new HashSet();		// without generics which allow to store any type of values. 
//	hs1.add(10);
//	hs1.add(10.10);
//	hs1.add("Ravi");
//	hs1.add(true);
//	System.out.println(hs1);

	//HashSet<Integer> hs2 = new HashSet<Integer>();
	//LinkedHashSet<Integer> hs2 = new LinkedHashSet<Integer>();
	TreeSet<Integer> hs2 = new TreeSet<Integer>();
	hs2.add(10);
	hs2.add(10);
	hs2.add(20);
	hs2.add(30);
	hs2.add(80);
	hs2.add(50);
	hs2.add(60);
	System.out.println(hs2);
	hs2.remove(20);
	System.out.println(hs2);
	System.out.println("Search "+hs2.contains(10));
	System.out.println("Search "+hs2.contains(100));
	}

}
