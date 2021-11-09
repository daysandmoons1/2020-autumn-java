// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 30.
// 문제번호 : 실습 1
// 문제설명 : 연락처 정보 저장 및 출력

import java.io.*;

public class PhoneOpen {

	public static void main(String[] args) {
		FileReader fin = null;
		try {
			
			// 읽을 파일 주소
			fin = new FileReader("c:\\temp\\phone.txt");
			int c;
			
			// 파일 내용 출력
			System.out.println("c:\\temp\\phone.txt를 출력합니다.");
			while((c=fin.read())!=-1) {
				System.out.print((char)c);
			}
			fin.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
