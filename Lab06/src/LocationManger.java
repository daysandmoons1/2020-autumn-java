// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 29.
// ������ȣ : �ǽ� 3
// �������� : ���� ��, �浵 ���� ����

import java.util.*;

public class LocationManger {
	public static void main(String[] args) {
		HashMap<String, Location> city = new HashMap<String, Location>();
		Scanner scanner = new Scanner(System.in);
		
		// ���� ���� �Է�
		System.out.println("����, ����, �浵�� �Է��ϼ���.");
		for(int i=0; i<4; i++) {
			System.out.print(">>");
			String input = scanner.nextLine();
			
			// ', ' �������� ���ڿ� �и�
			String[] tk = input.split(", ");
			
			// ��ü ���� �� �ؽ� �ʿ� ����
			city.put(tk[0], new Location());
			
			// Setter �޼ҵ�� ����, �浵 ����
			Location lo = city.get(tk[0]);
			lo.Setter(tk[0], Double.valueOf(tk[1]), Double.valueOf(tk[2]));
		}
		System.out.println("---------------------");
		
		// ���� 7-6�� ����
		// key ���ڿ� ���� Set �÷��� ����
		// key ���ڿ� ���� ������ ���� Iterator ����
		Set<String> keys = city.keySet();
		Iterator<String> it = keys.iterator();
		
		// ���� Ž�� �� ���
		while(it.hasNext()) {
			String name = it.next();
			Location lo = city.get(name);
			lo.Getter();
		}
		System.out.println("---------------------");
		
		
		// ���� �˻�
		System.out.print("���� �̸�>> ");
		String name = scanner.next();
		while(!(name.equals("�׸�"))) {
			Location lo = city.get(name);
			
			// �˻� ���� ���� �� ��� �޼��� ���
			if(lo == null)
				System.out.println(name + "�� �����ϴ�.");
			
			// �˻� ���� ���� �� Getter �޼ҵ� ȣ��
			else
				lo.Getter();
			System.out.print("���� �̸�>> ");
			name = scanner.next();
		}
		
		scanner.close();
	}
}
