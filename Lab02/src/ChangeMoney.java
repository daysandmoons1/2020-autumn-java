// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 23.
// 문제번호 : 실습 3
// 문제설명 : 입력된 금액을 현금 개수로 환산

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		int unit[] = {50000, 10000, 1000, 500, 100, 50, 10, 1}; //환산할 돈의 종류
		Scanner scanner = new Scanner(System.in);
		
		// 금액 입력
		System.out.print("금액을 입력하세요>>");
		int money = scanner.nextInt();
		
		// 큰 단위부터 작은 단위로 순차적으로 나누면서 계산
		for(int j=0;j<unit.length;j++) {
			System.out.println(unit[j] + "원 짜리 : " + money / unit[j] + "개");
			money -= (unit[j] * (money / unit[j]));
		}
		
		scanner.close();
	}
}
