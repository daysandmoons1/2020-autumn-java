// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 30.
// ������ȣ : �ǽ� 4
// �������� : ���� ũ��

import java.io.*;
import java.util.*;

public class FIleSize {

	public static void main(String[] args) {
		
		double longest = 0.0;
		String name = null;
		
		// ��� ����
		File dir = new File("c:\\");
		
		// ���� ����� ���� ����Ʈ
		File[] subFiles = dir.listFiles();
		
		// ���� ũ�� ���
		for(int i=0; i<subFiles.length; i++) {
			File f = subFiles[i];{
			if(f.length() > longest)
				longest = f.length();
				name = f.getPath();
			}
		}
		System.out.print("���� ū ������ " + name + " " + (int)longest + "����Ʈ");
		

	}

}
