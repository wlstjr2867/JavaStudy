package skillup.project03;

//부모클래스 : 친구의 공통사항 3가지를 멤버변수로 선언
public class Friend {
	 String name;
	 String phone;
	 String addr;
	//생성자
	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	//멤버변수 출력용 메서드
	public void showAllData() {
		System.out.print("이름:"+ name);
		System.out.print(", 전화번호:"+ phone);
		System.out.print(", 주소:"+ addr);
	}
	//오버라이딩을 목적으로 정의한 메서드
	public void showBasicInfo() {}
}
