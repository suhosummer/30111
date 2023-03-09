package test;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {94 , 85 ,95 , 88 , 90};
		
		int max = num[0];
		
		for(int j : num) {
			if (j > max) {
				max = j;
			}
		}
		System.out.println(max);
	}
	
}
