// 1812515 김선효
// 21. 06. 22.
// MyAppInfo
// 본인 정보 출력 문제

import java.util.Scanner;

public class MyInfoApp {
	public static void main(String[] args) {
		
//		int a = 0x00000015, b = 0xfffffffe;
//		int c = a | b;
//		int e = a^b;
//		int x = a >> 1;
//		
//		int a = 11;
//		int b = 32;
//		String c = "7";
//		System.out.println(a + b +c);
		
//		int sum = 0;
//		
//		for(int n=0; n<8;n++) {
//			if(n%3 == 0)
//				continue;
//			sum += n;
//		}
		
		boolean a = true, b = false, c = true;
		a = (a || false) && (b || c);
		System.out.println(a);
		
		String h = "Halloween";
		h.replace("a", "A");
		System.out.println(h);
		
		
		System.out.println("이름: 김선효");

		System.out.println("학과: 컴퓨터과학전공");
		
		System.out.println("학번: 1812515");
		
//		System.out.println(a + ", " + b + ", " + c + ", " + e + ", " + x);
//		
//		System.out.println(sum);

	}
}
