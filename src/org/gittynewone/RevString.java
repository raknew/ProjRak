package org.gittynewone;

public class RevString {
	public static void main(String[] args) {
		String s1="rakesh";
		char[] str = s1.toCharArray();
		
		int length=s1.length();
		int j= length-1;
		
		for(int i=0;i<length/2;i++) {
			char c;
			c=s1.charAt(i);
			str[i] = str[j];
			str[j] = c;
			j--;
			
		}
		System.out.println(str);
	}
	}

