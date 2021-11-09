// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 29.
// 문제번호 : 실습 4
// 문제설명 : 고객 포인트 점수 관리 프로그램

import java.util.*;

public class CustomerManager {
	
	public void printCustomer() {
		
	}

	public static void main(String[] args) {
		HashMap<String, Integer> customer = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("** 포인트 관리 프로그램입니다 **");
		
		while(true) {
			System.out.print("이름과 포인트 입력>> ");
			String str = scanner.nextLine();
			if(str.equals("그만"))
				break;
				
			// 입력 받은 문자열을 공백을 기준으로 분리
			// key 비교하여 동일 key 존재하면 해당 key의 value와 (+) 연산 후 값 저장
			String[] tk = str.split(" ");
			if(customer.containsKey(tk[0]))
				customer.put(tk[0], customer.get(tk[0]) + Integer.valueOf(tk[1]));
			else
				customer.put(tk[0], Integer.valueOf(tk[1]));
			
			
			// 존재하는 key와 value 모두 출력
			Set<String> keys = customer.keySet();
			Iterator<String> it = keys.iterator();
			
			while(it.hasNext()) {
				String name = it.next();
				int point = customer.get(name);
				System.out.print("(" + name + ", " + point + ")");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}