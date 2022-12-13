package com.oto.myapp.presentation;

import java.lang.*;

public class Test extends Object {

	private int tid;
	private String tname;

	public Test() {
		super(); // Object();

		System.out.println("Test Object Created...");

	}

	public Test(int tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}

	public String toString() {

		return "Axis bank";

	}

	public static void main(String[] args) {

		Object o = new Test();// runtime polymorphism

		Object o1 = new String();

		String s1 = (String) o1;

		Test t1 = new Test();

		// String s2 =(String) t1;

		String s2 = t1.toString();

		System.out.println("s2 " + s2);

		System.out.println("t1 " + t1.toString());

		Integer i = new Integer(50);

		System.out.println(i.toString());

		String str = new String("javeed");

		System.out.println(str);

	}

	public int add(int a, int b) {

		return a + b;

	}

	public int add(int a, int b, int c) {

		return a + b;

	}

}
