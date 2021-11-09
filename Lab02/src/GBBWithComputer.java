// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 23.
// 문제번호 : 실습 7
// 문제설명 : 컴퓨터와 가위바위보

import java.util.Scanner;

public class GBBWithComputer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		String user = "";
		int n;
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			System.out.print("가위 바위 보!>>");
			user = scanner.next();
			
			// 그만 입력 시 탈출
			if(user.equals("그만"))
				break;
			
			n = (int)(Math.random()*3);
			
			// 비겼을 때
			if(str[n].equals(user))
				System.out.println("사용자 = " + user + ", 컴퓨터  = " + str[n] + ", 비겼습니다.");
			
			// 사용자가 이겼을 때
			else if((n == 0 && user.equals("바위")) || (n == 1 && user.equals("보")) || (n == 2 && user.equals("가위")))
				System.out.println("사용자 = " + user + ", 컴퓨터  = " + str[n] + ", 사용자가 이겼습니다.");
			
			// 컴퓨터가 이겼을 때
			else
				System.out.println("사용자 = " + user + ", 컴퓨터  = " + str[n] + ", 컴퓨터가 이겼습니다.");
		}
		
		scanner.close();
	}
}
