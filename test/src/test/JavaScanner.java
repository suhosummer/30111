package test;

import java.util.Scanner;

public class JavaScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("시작 숫자"+a);
		System.out.println("마지막 숫자"+b);
		

		
		System.out.println(a+"부터 b"+"까지의 합은 "+sum);

	}

}
