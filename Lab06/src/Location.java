// �̸� : �輱ȿ
// �й� : 1812515
// ��¥ : 21. 06. 29.
// ������ȣ : �ǽ� 3
// �������� : ���� ��, �浵 ���� ���� �޼ҵ�

public class Location {
	String city;
	double latitude;	//����
	double longitude;	//�浵
	
	// ������
	public Location() {
		this.city = ""; this.latitude = 0; this.longitude = 0;
	}
	
	// �� ���� �� ���� �޼ҵ�
	public void Setter(String city, double latitude, double longitude) {
		this.city = city; this.latitude = latitude; this.longitude = longitude;
	}
	
	// ��� �޼ҵ�
	public void Getter() {
		System.out.println(city + "\t" + latitude + "\t" + longitude);
	}

}
