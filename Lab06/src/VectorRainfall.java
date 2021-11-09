// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 29.
// 문제번호 : 실습 2
// 문제설명 : 강수량 관리 프로그램

import java.util.Scanner;
import java.util.Vector;

public class VectorRainfall {
	
	// 벡터 출력 메소드
	public static void printVector(Vector<Integer> v) {
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}
		System.out.println();
	}
	
	// 평균 값 출력 메소드
	public static void printAverage(Vector<Integer> v) {
		int sum=0;
		for(int i=0; i<v.size(); i++)
			sum += v.get(i);
		System.out.println("현재 평균 " + sum/v.size());
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		
		// 강수량 입력, 원소 출력, 평균 출력
		int rainfall = -1;
		System.out.print("강수량 입력 (0 입력시 종료)>> ");
		rainfall = scanner.nextInt();
		while(rainfall!=0) {
			v.add(rainfall);
			printVector(v);
			printAverage(v);
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
			rainfall = scanner.nextInt();
		}
		
		scanner.close();
	}
}
