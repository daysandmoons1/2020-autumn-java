// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 30.
// ������ȣ : �ǽ� 1
// �������� : ����ó ���� ���� �� ���

import java.io.*;
import java.util.*;

public class PhoneSave {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		try {
			
			// ������ ���� �ּ�
			fout = new FileWriter("c:\\temp\\phone.txt");
			
			System.out.println("�� 3���� ��ȭ��ȣ�� �о����ϴ�.");
			while(true) {
				
				// ����ڰ� '�׸�' �Է��ϸ� �ݺ��� Ż��
				System.out.print("�̸� ��ȭ��ȣ>> ");
				String line = scanner.nextLine();
				if(line.equals("�׸�"))
					break;
				
				// �� �� ������ ���Ͽ� ����
				fout.write(line, 0 , line.length());
				fout.write("\r\n", 0, 2);
			}
			System.out.print("c:\\temp\\phone.txt�� �����Ͽ����ϴ�. ");
			fout.close();
		}catch(IOException e) {
			System.out.println("����� ����");
		}
		scanner.close();
	}
}
