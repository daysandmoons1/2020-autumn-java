// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 30.
// ������ȣ : �ǽ� 1
// �������� : ����ó ���� ���� �� ���

import java.io.*;

public class PhoneOpen {

	public static void main(String[] args) {
		FileReader fin = null;
		try {
			
			// ���� ���� �ּ�
			fin = new FileReader("c:\\temp\\phone.txt");
			int c;
			
			// ���� ���� ���
			System.out.println("c:\\temp\\phone.txt�� ����մϴ�.");
			while((c=fin.read())!=-1) {
				System.out.print((char)c);
			}
			fin.close();
		}catch(IOException e) {
			System.out.println("����� ����");
		}
	}

}
