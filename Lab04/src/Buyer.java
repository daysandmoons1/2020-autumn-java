// 이름 : 김선효
// 학번 : 1812515
// 날짜 : 21. 06. 25.
// 문제번호 : 실습 4
// 문제설명 : 클래스 연습

public class Buyer extends Item{
	int money;
	
	public Buyer(int money) {
		this.money = money;
	}
	
	void buy(Item t, int n) {
		System.out.println(t.toString() + " => " + n + "개 구매");
		if(money - (t.price*n) < 0)
			System.out.println("잔액 부족: " + money);
		else {
			System.out.println("구매 완료 후 잔액: " + (money - t.price*n));
			money -= (t.price*n);
		}
	}
}
