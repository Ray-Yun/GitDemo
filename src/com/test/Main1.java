package com.test;

import java.io.InputStream;
import java.util.Scanner;

//if else 判斷式練習
public class Main1 {
	public static void main(String[] args) {	   
		int score; 
		
		System.out.println("輸入成績：");
		score=scanner();
		System.out.println(score);
		        
	}

	private static int scanner() {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);// 
		return Integer.valueOf(scanner.nextLine());
	}
}

