// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 30.
// ������ȣ : �ǽ� 2
// �������� : ���Ͽ� ���ι�ȣ ���̱�

import java.io.*;
import java.util.*;

public class FileLineNumber {

	public static void main(String[] args) {
		
		FileReader fin = null;
		try {
			
			// ���� ���� �ּ�
			fin = new FileReader("c:\\windows\\system.ini");
			Scanner scanner = new Scanner(fin);
			int index=1;
			
			System.out.println("c:\\windows\\system.ini ������ �о� ����մϴ�.");
			
			// ���� ���� ���
			while(scanner.hasNext()) {
				String line = scanner.nextLine();
				System.out.printf("%4d: ", index);
				System.out.println(line);
				index++;
			}
			scanner.close();
			fin.close();
		}catch(IOException e) {
			System.out.println("����� ����");
		}
	}

}
