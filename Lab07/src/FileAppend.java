// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 30.
// ������ȣ : �ǽ� 3
// �������� : ���� ���̱�

import java.io.*;
import java.util.*;

public class FileAppend {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// ���� �ּ� �Է�
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("ù��° ���� �̸��� �Է��ϼ��� >> ");
		File from = new File(scanner.nextLine());
		System.out.print("�ι�° ���� �̸��� �Է��ϼ��� >> ");
		File with = new File(scanner.nextLine());
		System.out.print("��ġ�� ���� �̸��� �Է��ϼ��� >> ");
		File to = new File(scanner.nextLine());
		
		int c;
		try {
			
			// ù��° ���� ���� c.txt�� ����
			FileReader ffrom = new FileReader(from);
			FileWriter fw = new FileWriter(to);
			while((c = ffrom.read())!=-1) {
				fw.write((char)c);
			}
			
			// �ι�° ���� ���� c.txt�� ����
			fw.write('\n');
			FileReader fwith = new FileReader(with);
			while((c = fwith.read())!=-1) {
				fw.write((char)c);
			}
			ffrom.close(); fwith.close(); fw.close();
			scanner.close();
		}catch(IOException e) {
			System.out.println("���� ���� ����");
		}
		System.out.print("������Ʈ ���� �ؿ� c.txt ���Ͽ� �����Ͽ����ϴ�.");
	}

}
