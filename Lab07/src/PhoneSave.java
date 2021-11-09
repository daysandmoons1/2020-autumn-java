// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 30.
// 문제번호 : 실습 1
// 문제설명 : 연락처 정보 저장 및 출력

import java.io.*;
import java.util.*;

public class PhoneSave {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		try {
			
			// 저장할 파일 주소
			fout = new FileWriter("c:\\temp\\phone.txt");
			
			System.out.println("총 3개의 전화번호를 읽었습니다.");
			while(true) {
				
				// 사용자가 '그만' 입력하면 반복문 탈출
				System.out.print("이름 전화번호>> ");
				String line = scanner.nextLine();
				if(line.equals("그만"))
					break;
				
				// 한 줄 단위로 파일에 저장
				fout.write(line, 0 , line.length());
				fout.write("\r\n", 0, 2);
			}
			System.out.print("c:\\temp\\phone.txt에 저장하였습니다. ");
			fout.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
		scanner.close();
	}
}
