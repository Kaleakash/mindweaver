package com;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClasses {
	public static void main(String[] args) {
//		Queue<Integer> qq = new PriorityQueue<Integer>();
//		qq.add(3);
//		qq.add(1);
//		qq.add(5);
//		qq.add(2);
//		qq.add(8);
//		System.out.println(qq);
//		System.out.println(qq.poll());
//		System.out.println(qq);
		
		Queue<Integer> qq = new LinkedList<Integer>();
		qq.add(3);
		qq.add(1);
		qq.add(5);
		qq.add(2);
		qq.add(8);
		System.out.println(qq);
		System.out.println(qq.poll());
		System.out.println(qq);
	}
}
