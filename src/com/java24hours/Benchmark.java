package com.java24hours;

public class Benchmark {
    //���Լ����һ���ӽ��е�ƽ��������
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
