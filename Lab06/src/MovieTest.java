// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 29.
// ������ȣ : �ǽ� 5
// �������� : ��ȭ ���� ���α׷�

import java.util.*;

public class MovieTest {
	static Scanner scanner = new Scanner(System.in);
	static HashMap<String, Movie> movie = new HashMap<String, Movie>();
	
	public static void main(String[] args) {
		
		while(true) {
			
			//�޴� ��� �� �Է�
			System.out.println("======��ȭ ���� ����======");
			System.out.println("1.�Է� / 2.��� / 3.�˻�");
			System.out.println("4.���� / 5.���� / 6.����");
			System.out.println();
			System.out.print("�޴��Է�>>");
			int menu = scanner.nextInt();
			System.out.println();
			scanner.nextLine();
			
			// �� �޴��� ���� ��� ����
			// �ϴ� �޼ҵ忡 ���ϰ� ���
			if(menu==1)
				inputMovie();
			else if(menu==2)
				printMovie();
			else if(menu==3) {
				System.out.print("�˻��� ���� �Է�: ");
				String title = scanner.nextLine();
				System.out.println();
				searchMovie(title);
			}
			else if(menu==4) {
				System.out.print("������ ���� �Է�: ");
				String title = scanner.nextLine();
				System.out.println();
				corMovie(title);
			}
			else if(menu==5) {
				System.out.print("������ ���� �Է�: ");
				String title = scanner.nextLine();
				System.out.println();
				delMovie(title);
			}
			else if(menu==6)
				break;
		}

	}
	
	// ��ȭ ���� �Է� �޼ҵ�
	public static void inputMovie() {
		System.out.print("����: ");
		String title = scanner.nextLine();
		
		// ���� �Է� �� �ؽ� �ʰ� Movie ��ü ����
		movie.put(title, new Movie());
		Movie mo = movie.get(title);
		
		// �Է� ���� ��ü�� ����. ���� ����
		mo.setTi(title);

		System.out.print("����: ");
		String director = scanner.nextLine();
		mo.setDir(director);
		
		System.out.print("�帣: ");
		String genre = scanner.nextLine();
		mo.setGen(genre);
		
		System.out.print("�⵵: ");
		int release = scanner.nextInt();
		mo.setRel(release);
	}
	
	// ��ȭ ���� ��� �޼ҵ�
	// Set ���� �̿�, ���� Ž���Ͽ� ���� ���
	public static void printMovie() {
		Set<String> keys = movie.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String title = it.next();
			Movie mo = movie.get(title);
			mo.printInfo();
		}
	}
	
	// ��ȭ �˻� �޼ҵ�
	// ���� key ����� '��ȭ ��� �޼ҵ�' ȣ��
	public static void searchMovie(String title) {
		if(movie.containsKey(title)) {
			Movie mo = movie.get(title);
			mo.printInfo();
		}
		else
			System.out.println(title + "��(��) �������� �ʽ��ϴ�.");
		System.out.println();
	}
	
	// ��ȭ ���� �޼ҵ�
	// key ���� �� ���Է�
	public static void corMovie(String title) {
		Movie mo = movie.get(title);
		mo.printInfo();
		movie.remove(title);
		inputMovie();
	}
	
	// ��ȭ ���� �޼ҵ�
	public static void delMovie(String title) {
		movie.remove(title);
		System.out.println(title + "��(��) �����Ǿ����ϴ�.");
		System.out.println();
	}

}
