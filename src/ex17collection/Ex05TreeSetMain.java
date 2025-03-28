package ex17collection;

import java.util.Iterator;
import java.util.TreeSet;
/*
TreeSet<T> 컬렉션
: 트리라는 자료구조를 기반으로 한 Set계열의 컬렉션
-set의 기본적인 특성은 동일하다.
-따라서 중복은 허용하지 않는다.
-단 데이터가 정렬되어 저장된다. 정렬의 기준은 개발자가 직접
	정의할 수 있다.
 */

/*
클래스 정의시 정렬의 기준을 만들어주기 위해 Comparable<T>
인터페이스를 구현해야한다. */
class MyString implements Comparable<MyString> {
	String str;
	public MyString(String str) {
		this.str = str;
	}
	//멤버변수의 길이를 반환한다.
	public int getLength() {
		return str.length();
	}
	/*
	TreeSet<T>에 인스턴스를 저장할때 정렬을 위해 compareTo를
	오버라이딩한다.
	정렬의 기준은 단순히 알파벳 순서가 될수도 있고, 문자열의 길이에
	따른 정렬이 될수도 있다.
	1과 -1의 위치에 따라 오름차순 혹은 내림차순으로 설정할 수 있다.
	 */
	@Override
	public int compareTo(MyString paramStr) {
		if(getLength() > paramStr.getLength())
			return 1;
		else if(getLength() < paramStr.getLength())
			return -1;
		else
			return 0;
		//문자열의 첫 문자를 기준으로 오름차순 정렬
//		if(this.str.charAt(0) > paramStr.str.charAt(0))
//			return 1;
//		else
//			return -1;
	}
	@Override
	public String toString() {
		return str;
	}
}

public class Ex05TreeSetMain {

	public static void main(String[] args) {
		
		/*
		Java에서 제공하는 기본클래스인 경우 별도의 오버라이딩을
		하지 않아도 된다. */
		TreeSet<Integer> tree1 = new TreeSet<Integer>();
		tree1.add(1);
		tree1.add(4);
		tree1.add(2);
		tree1.add(3);
		//set 이므로 중복저장은 허용하지 않는다.
		tree1.add(2);
		//4개 출력됨
		System.out.println("저장된 데이터 수:"+ tree1.size() +"개");//4개
		//이터레이터로 출력하면 오름차순으로 정렬된다.
		Iterator<Integer> itr = tree1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		/******************************************/
		//문자열의 길이를 기준으로 오름차순 정렬된다.
		TreeSet<MyString> tree2 = new TreeSet<MyString>();
		tree2.add(new MyString("Orange"));
		tree2.add(new MyString("Apple"));
		tree2.add(new MyString("Moon"));
		tree2.add(new MyString("JavaWeb"));
		
		Iterator<MyString> it = tree2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
