package com.java24hours;

import java.util.Scanner; 

public class Grade {

	public static void main(String[] args) {
		Scanner scanner=new	Scanner(System.in);
		System.out.print("������ɼ���ѯ���:");
		int score=scanner.nextInt();
		
		switch (score/10) {
		case 10:
			System.out.println("���֣�ţ��Ŷ��");
			break;
		case 9:
			System.out.println("���㣡");
			break;
		case 8:
			System.out.println("���ã�����������ͱ���ѧ�ˣ�");
			break;
		case 7:
			System.out.println("���һ�㣡�úû����Ӿ����ˣ�");
			break;
		case 6:
			System.out.println("��ǿ���񣡻��ǻؼҷ�ţȥ�ɣ�");
			break;
		default:
			System.out.println("��ô�򵥶����ܼ��������뼰ʱ������ѧ��");
			break;
		}
	}

}
