import java.util.Scanner;

public class TestExam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("500 이하의 자연수를 입력하세요. : ");
        int n = scanner.nextInt();
        int sum = 0;
        System.out.print("3의 배수면서 7의 배수인 수 : ");
        for (int count = 1; count <= n; count++) {
            if (count % 3 == 0 && count % 7 == 0) {
                System.out.print(count + " ");
                sum += count;
            }
        }
        System.out.println();
        System.out.println("1~"+n+"까지 3의 배수이면서 8의 배수인 수의 합은 "+sum+"입니다.");
	}

}
