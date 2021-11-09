// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 30.
// 문제번호 : 실습 2
// 문제설명 : 파일에 라인번호 붙이기

import java.io.*;
import java.util.*;

public class FileLineNumber {

	public static void main(String[] args) {
		
		FileReader fin = null;
		try {
			
			// 읽을 파일 주소
			fin = new FileReader("c:\\windows\\system.ini");
			Scanner scanner = new Scanner(fin);
			int index=1;
			
			System.out.println("c:\\windows\\system.ini 파일을 읽어 출력합니다.");
			
			// 파일 내용 출력
			while(scanner.hasNext()) {
				String line = scanner.nextLine();
				System.out.printf("%4d: ", index);
				System.out.println(line);
				index++;
			}
			scanner.close();
			fin.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
