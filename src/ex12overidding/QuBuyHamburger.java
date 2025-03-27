package ex12overidding;

class Burger {
	String name;
	private int price;
	String patty;
	String sauce;
	String vegetable;
	
	public Burger(String name, int price, String patty, String sauce, String vegetable) {
		this.name = name;
		this.price = price;
		this.patty = patty;
		this.sauce = sauce;
		this.vegetable = vegetable;
	}

	public int getPrice() {
		return price;
	}

	public void showBurgerInfo() {
		System.out.println("버거명:"+ name);
		System.out.println("가격:"+ price);
		System.out.println("식재료:" + patty + "," + sauce + "," + vegetable);
	}
}
//햄버거의 기본가격 추상화 
class HamburgerPrice {
	
	Burger burger;
	final int COKE = 1000;
	final int POTATO = 1500;
	
	public HamburgerPrice(Burger burger) {
		this.burger = burger;
	}
	
	// 기본 가격 계산
    public int calcPrice() {
        return burger.getPrice() + COKE + POTATO;
    }

	public void showPrice() {
		burger.showBurgerInfo();
		System.out.println("결제금액:" + calcPrice());
		System.out.println("=========================");
	}
}
//세트가격을 추상화(기본가격을 상속)
class SetPrice extends HamburgerPrice {

	public SetPrice(Burger burger) {
		super(burger);
	}
	
	@Override
	public int calcPrice() {
		return burger.getPrice() + COKE + POTATO -500;
	}
	
	@Override
	public void showPrice() {
		burger.showBurgerInfo();
		System.out.println("결제금액:" + calcPrice());
		System.out.println("=======================");
	}
}

public class QuBuyHamburger {

	public static void main(String[] args) {
		
		//치즈버거 객체 생성
		Burger burger1 = new Burger("치즈버거", 2000, "쇠고기패티", "케챱", "피클");
		//치킨버거 객체 생성
		Burger burger2 = new Burger("치킨버거", 3000, "닭고기패티", "마요네즈", "양상치");
		
		//치즈버거를 기본가격으로 구매
		HamburgerPrice price1 = new HamburgerPrice(burger1); 
		price1.showPrice();	// 4500원	
		
		//치킨버거를 세트가격으로 구매
		HamburgerPrice price2 = new SetPrice(burger2); 
		price2.showPrice();	// 5000원
	}
}
