package test;

import java.util.Scanner;

public class prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5]; 
		int max = 0, num = 0;
		
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+1 +"번 입력 : ");
			arr[i] = sc.nextInt();
			if (max < arr[i]) {
				max = arr[i];
				num++;
		}
		

			
		}
		System.out.println("가장 큰 수는 "+ num +"번째 숫자인 "+max);
		
	}

}
