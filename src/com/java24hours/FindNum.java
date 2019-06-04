package com.java24hours;

public class FindNum {

	public static void main(String[] args) {
		int i=0;
		while(true) {
			if(i%13==0) {
				System.out.println(i);	
			}
			else if (i>400) {
				break;
			}
			i++;
		}
	}

}
