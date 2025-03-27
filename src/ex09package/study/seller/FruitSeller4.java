package ex09package.study.seller;

public class FruitSeller4 {
	
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;	//(컨트롤 + 쉬프트 x => 대문자 ) (컨트롤 + 쉬프트 y => 소문자)
	public FruitSeller4(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:"+ numOfApple);
		System.out.println("[판매자]판매수익:"+ myMoney);
	}
}

