package ex12inheritance;

//public class Animal{
//	int age;
//	String gender;
//	String species;
//	
//	public void showAnimal() {
//		System.out.println("나이:"+ age);
//		System.out.print("성별:"+ gender);
//		System.out.println("동물의 종류:"+ species);
//	}
//	
//	public Animal(int age, String gender, String species) {
//		this.age = age;
//		this.gender = gender;
//		this.species = species;
//	}
//}

/*
연습문제] Animal 클래스정의 
	동물의 일반적인 특성을 표현하는 클래스를 정의하시오.
	멤버변수 : 
		동물의 종류(포유류, 어류, 조류 등)->species
		나이->age
		성별->gender
	멤버메소드 : 
		showAnimal() : 멤버변수를 출력하는 용도
	인자생성자 : 
		멤버변수 3개 모두를 초기화할수 있도록 정의
	
	※1차완성후 species를 private로 선언후 적절히 수정한다.
 */
public class Animal {
 
	//멤버변수
	private String species; //종
	public int age; //나이
	public String gender; //성별
	
	//현재상태 
	public void showAnimal() {
		System.out.println("동물의 종류는:"+ species);
		System.out.println("나이는:"+ age);
		System.out.println("성별은:"+ gender);
	}
	
	//생성자 
	public Animal(String species, int age, String gender) {
		this.species = species;
		this.age = age;
		this.gender = gender;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	/*
	getter메서드 
		: private으로 선언된 멤버변수를 클래스 외부로 반환할때 
		사용하는 메서드
	 */
	public String getSpecies() {
		return species;
	}
}




