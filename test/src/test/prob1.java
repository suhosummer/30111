package test;

import java.util.Scanner;

public class prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int num = scanner.nextInt();
		
		if(num > 1000) {
			System.out.println("1000이하의 값을 입력하세요");
		}
		
		else {
			
			for(int i = 1; i <= num ; i++) {
				if(i % 4 == 0) {
					System.out.println(i);
					sum += i;
				}
			}
			
		}
		
		System.out.println("1~"+num+"까지 4의 배수 합은 "+sum+"입니다");
		
		

	}

}
