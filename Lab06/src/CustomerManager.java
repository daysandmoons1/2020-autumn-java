// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 29.
// ������ȣ : �ǽ� 4
// �������� : �� ����Ʈ ���� ���� ���α׷�

import java.util.*;

public class CustomerManager {
	
	public void printCustomer() {
		
	}

	public static void main(String[] args) {
		HashMap<String, Integer> customer = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");
		
		while(true) {
			System.out.print("�̸��� ����Ʈ �Է�>> ");
			String str = scanner.nextLine();
			if(str.equals("�׸�"))
				break;
				
			// �Է� ���� ���ڿ��� ������ �������� �и�
			// key ���Ͽ� ���� key �����ϸ� �ش� key�� value�� (+) ���� �� �� ����
			String[] tk = str.split(" ");
			if(customer.containsKey(tk[0]))
				customer.put(tk[0], customer.get(tk[0]) + Integer.valueOf(tk[1]));
			else
				customer.put(tk[0], Integer.valueOf(tk[1]));
			
			
			// �����ϴ� key�� value ��� ���
			Set<String> keys = customer.keySet();
			Iterator<String> it = keys.iterator();
			
			while(it.hasNext()) {
				String name = it.next();
				int point = customer.get(name);
				System.out.print("(" + name + ", " + point + ")");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}