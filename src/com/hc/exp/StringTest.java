package com.hc.exp;

public class StringTest {
	
	public static void main(String[] args) {
		String str = "raju";
		str.concat("sharma");
		
		StringBuffer sb = new StringBuffer("mono");
		sb.append(str);
		System.out.println(sb);
	}
}
