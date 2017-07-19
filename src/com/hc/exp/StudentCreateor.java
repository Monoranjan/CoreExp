package com.hc.exp;

public class StudentCreateor {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setRoll(1);
		s1.setName("Mono");
		
		Student s2 = new Student();
		s2.setRoll(1);
		s2.setName("Mono");
		
		System.out.println("s1 hashcode  : " + s1.hashCode());
		System.out.println("s2 hashcode  : " + s2.hashCode());
		System.out.println(s1.equals(s2));
	}
}
