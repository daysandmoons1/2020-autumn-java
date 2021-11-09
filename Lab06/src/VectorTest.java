// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 29.
// 문제번호 : 실습 1
// 문제설명 : Vector <Integer> 실습

import java.util.Scanner;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Vector<Integer> v = new Vector<Integer>();
		
		int num = 0;
		
		// -1이 입력될 때까지 정수 입력
		System.out.print("정수(-1이 입력될 때까지)>> ");
		num = scanner.nextInt();
		while(num!=-1) {
			v.add(num);
			num = scanner.nextInt();
		}
		
		// 삭제 전 벡터 출력
		System.out.print("삭제 전: [");
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i));
			if(i+1 < v.size())
				System.out.print(", ");
		}
		System.out.println("]");
		
		// 가장 큰 수 계산
		int maxIndex = 0;
		for(int i=1; i<v.size(); i++) {
			if(v.get(maxIndex) < v.get(i))
				maxIndex = i;
		}
		
		// 가장 큰 수 삭제
		System.out.println("가장 큰 수 " + v.get(maxIndex) + " 삭제");
		v.remove(maxIndex);
		
		// 가장 큰 수 삭제 후 벡터 출력
		System.out.print("[");
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i));
			if(i+1 < v.size())
				System.out.print(", ");
		}
		System.out.println("]");
		
		// 가장 작은 수 계산
		int minIndex = 0;
		for(int i=1; i<v.size(); i++) {
			if(v.get(minIndex) > v.get(i))
				minIndex = i;
		}
		
		// 가장 작은 수 삭제
		System.out.println("가장 작은 수 " + v.get(minIndex) + " 삭제");
		v.remove(minIndex);
		
		// 가장 작은 수 삭제 후 벡터 출력
		System.out.print("[");
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i));
			if(i+1 < v.size())
				System.out.print(", ");
		}
		System.out.println("]");
		
		scanner.close();
	}

}
