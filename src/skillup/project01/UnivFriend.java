package skillup.project01;

public class UnivFriend {
	
	public String name;
	public String phone;
	public String addr;
	public String major;
	
	public UnivFriend(String name, String phone, String addr, String major) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
		this.major = major;
	}
	
	void showAllData() {
		System.out.println("==대딩친구(전체정보)==");
		System.out.print("이름:"+ name);
		System.out.print(", 전화번호:"+ phone);
		System.out.print(", 주소:"+ addr);
		System.out.println(", 전공:"+ major);
	}
	
	void showBasicInfo() {
		System.out.println("==대딩친구==");
		System.out.print("이름:"+ name);
		System.out.print(", 전공:"+ major);
		System.out.println(", 전화번호:"+ phone);
	}
}
