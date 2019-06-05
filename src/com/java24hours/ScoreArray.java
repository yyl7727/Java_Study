package com.java24hours;

public class ScoreArray {

	//二维数组保存学生成绩
	public static void main(String[] args) {
		int [] studentsum=new int[5];
		int sum=0;
		int[][] score=new int[][]{{1,2,3,4,5},
			{89,83,90,100,72},
			{63,88,97,99,87}};
			
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				if(i!=0) {
					sum+=score[i][j];
					studentsum[j]+=score[i][j];//不考虑第0行的学生编号，从第1行开始保存成绩用于计算平均分
				}
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		for (int i = 0; i < studentsum.length; i++) {
			System.out.print(studentsum[i]/(score.length-1)+"\t");
		}
		System.out.println();
		System.out.println("总平均分为："+sum/((score.length-1)*(score[1].length)));
	}
}
