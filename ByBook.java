package com.mmr.plh.buybook;

import java.util.Scanner;

public class ByBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
// mark �ɼ�
		int gra=input.nextInt();
		if (gra==100) {
			System.out.println("��");
		}
		else if (gra>=90) {
			System.out.println("��IPAD");
		} 
		else if (gra>=60) {
			System.out.println("��ο���");
		}
		else {
			System.out.println("ʲô������");
		}

	}

}
