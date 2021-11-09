// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 30.
// 문제번호 : 실습 3
// 문제설명 : 파일 붙이기

import java.io.*;
import java.util.*;

public class FileAppend {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 파일 주소 입력
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("첫번째 파일 이름을 입력하세요 >> ");
		File from = new File(scanner.nextLine());
		System.out.print("두번째 파일 이름을 입력하세요 >> ");
		File with = new File(scanner.nextLine());
		System.out.print("합치는 파일 이름을 입력하세요 >> ");
		File to = new File(scanner.nextLine());
		
		int c;
		try {
			
			// 첫번째 파일 내용 c.txt에 저장
			FileReader ffrom = new FileReader(from);
			FileWriter fw = new FileWriter(to);
			while((c = ffrom.read())!=-1) {
				fw.write((char)c);
			}
			
			// 두번째 파일 내용 c.txt에 저장
			fw.write('\n');
			FileReader fwith = new FileReader(with);
			while((c = fwith.read())!=-1) {
				fw.write((char)c);
			}
			ffrom.close(); fwith.close(); fw.close();
			scanner.close();
		}catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
		System.out.print("프로젝트 폴더 밑에 c.txt 파일에 저장하였습니다.");
	}

}
