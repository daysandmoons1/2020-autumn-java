// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 24.
// ������ȣ : �ǽ� 5
// �������� : PhoneBook Ŭ������ �ۼ�

class Plane{
	// ��� ����(�ʵ�) ����
	private String model;
	private int seats;
	private static int planes = 0;
	
	// ������ �ۼ�: 2-3�� �ߺ� ����
	public Plane(){
		model = "A380"; seats = 500;
	}
	
	public Plane(String model, int maxPassenger){
		this.model = model; this.seats = maxPassenger;
	}
	
	// ��� ������ ������ �� �ִ� �����ڿ� ������ �޼ҵ� �ۼ�
	public void Model() {  }
	public void Seats() {  }
	public static void planesCountUp() { planes++; }
	
	// ���� ���� ������ �� �ִ� ������ �޼ҵ� getPlane() �ۼ�
	public static int getPlane() { return planes; }
	
	// ��ü�� ������ ���ڿ��� ��ȯ�ϴ� toString �޼ҵ� �ۼ�
	public String toString() {
		return "Plane [Model=" + this.model + ", Seats=" + this.seats + "]";
	}
}
public class PlaneTest {
	public static void main(String[] args) {
		// Plane ��ü ������ ����
		Plane plane[] = new Plane[3];
		plane[0] = new Plane("���� 777", 200);
		plane[1] = new Plane("������� A380", 500);
		plane[2] = new Plane("���� 737", 120);
		
		// �ʿ��� ������ �޼ҵ� �Ǵ� ������ �޼ҵ带 ȣ��
		for(int i=0; i<plane.length; i++) { Plane.planesCountUp(); }
		
		// ��ü ���� ����� �� ���
		System.out.println("��ü ���� ����� �� = " + Plane.getPlane());
		
		// ����� ���� ���
		System.out.println("�� ����� ���� ���");
		for(int i=0; i<plane.length; i++) { 
			System.out.println(plane[i].toString());
		}
		
	}

}
