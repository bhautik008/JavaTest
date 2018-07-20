package test1;

import java.util.Random;

public class Problem4 {

	public static void main(String[] args) {
		String s = "Chocolate";
		int n = 0 + new Random().nextInt(s.length());
		System.out.println("For n = "+n+", string is "+repeatFront(s, n));
	}
	
	private static String repeatFront(String s, int n) {
		char[] c = s.toCharArray();
		StringBuilder str = new StringBuilder();
		for(int j=n;j>0;j--) {
			int i = 0;
			while(i<j) {
				str.append(c[i]);
				i++;
			}	
		}
		return str.toString();
	}
	
}
