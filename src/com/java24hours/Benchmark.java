package com.java24hours;

public class Benchmark {
    //测试计算机一分钟进行的平方根运算
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		long endTime=startTime+60000;
		long index=0;
		while (true) {
			Math.sqrt(index);
			long now=System.currentTimeMillis();
			if(now>endTime) {
				break;
			}
			index++;	
		}
		System.out.println(index+" loops in on minute.");
	}
}
