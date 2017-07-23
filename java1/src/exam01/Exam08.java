package exam01;

import java.util.Scanner;

public class Exam08 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("반복문의 시작값을 입력해주세요.");
		String initStr = scan.nextLine();

		int initNum = Integer.parseInt(initStr);

		System.out.println("반복문의 최대값을 입력해주세요.");
		String maxStr = scan.nextLine();

		int maxNum = Integer.parseInt(maxStr);

		int num = 0;
		for (int i = initNum; i <= maxNum; i++) {

			if (i % 3 == 0 || i % 2 == 0) {
				num += i;
			}
		}
		System.out.println(num);
	}

}
