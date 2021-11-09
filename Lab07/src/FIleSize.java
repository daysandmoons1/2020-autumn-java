// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 30.
// 문제번호 : 실습 4
// 문제설명 : 파일 크기

import java.io.*;
import java.util.*;

public class FIleSize {

	public static void main(String[] args) {
		
		double longest = 0.0;
		String name = null;
		
		// 경로 설정
		File dir = new File("c:\\");
		
		// 설정 경로의 서브 리스트
		File[] subFiles = dir.listFiles();
		
		// 파일 크기 계산
		for(int i=0; i<subFiles.length; i++) {
			File f = subFiles[i];{
			if(f.length() > longest)
				longest = f.length();
				name = f.getPath();
			}
		}
		System.out.print("가장 큰 파일은 " + name + " " + (int)longest + "바이트");
		

	}

}
