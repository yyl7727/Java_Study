package com.java24hours;

import java.util.Scanner; 

public class Grade {

	public static void main(String[] args) {
		Scanner scanner=new	Scanner(System.in);
		System.out.print("请输入成绩查询结果:");
		int score=scanner.nextInt();
		
		switch (score/10) {
		case 10:
			System.out.println("满分？牛逼哦！");
			break;
		case 9:
			System.out.println("优秀！");
			break;
		case 8:
			System.out.println("良好！考不到优秀就别上学了！");
			break;
		case 7:
			System.out.println("你很一般！好好混日子就行了！");
			break;
		case 6:
			System.out.println("勉强及格！还是回家放牛去吧！");
			break;
		default:
			System.out.println("这么简单都不能及格，明天请及时办理退学！");
			break;
		}
	}

}
