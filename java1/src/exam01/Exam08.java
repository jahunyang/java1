package exam01;

import java.util.Scanner;

public class Exam08 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("�ݺ����� ���۰��� �Է����ּ���.");
		String initStr = scan.nextLine();

		int initNum = Integer.parseInt(initStr);

		System.out.println("�ݺ����� �ִ밪�� �Է����ּ���.");
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
