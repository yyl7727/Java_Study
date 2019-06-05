package com.java24hours;

public class FindNum {

	public static void main(String[] args) {
		int[] num=new int[300];
		int i=0;
		int j=0;
		while(true) {
			if(i%13==0) {
				System.out.println(i);
				num[j]=i;
				j++;
			}
			else if (i>400) {
				break;
			}
			i++;
		}
	}

}
