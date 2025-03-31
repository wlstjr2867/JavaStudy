package ex17collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

import javax.sql.rowset.JoinRowSet;

/*
중복 제거용 equals()메소드 호출
[최초 전체 정보출력]
Avengers [본명=스티브로져스, 닉네임=캡틴아메리카, 능력=비브라늄 방패]
Avengers [본명=브루스배너, 닉네임=헐크, 능력=강한피부&점프]
Avengers [본명=토니스타크, 닉네임=아이언맨, 능력=Mark-48 수트]
검색할 이름을 입력하세욤:브루스배너
Avengers [본명=브루스배너, 닉네임=헐크, 능력=강한피부&점프]
요청하신 정보를 찾았습니다
 */

class Avengers {
	String name;
	String heroName;
	String weapon;

	public Avengers(String name, String heroName, String weapon) {
		this.name = name;
		this.heroName = heroName;
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Avengers [본명=" + name + ", 닉네임=" + heroName + ", "
				+ "능력=" + weapon +"]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(heroName, name, weapon);
	}

	@Override
	public boolean equals(Object obj) {
		Avengers avengers = (Avengers)obj;
		System.out.println("중복 제거용 equals()메소드 호출");
		if(this.name.equals(avengers.name) && this.heroName.equals(avengers.heroName)) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class QuHashSet {

	public static void main(String[] args) {
		
		HashSet<Avengers> set = new HashSet<Avengers>();
		
		Avengers hero1 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		Avengers hero2 = new Avengers("스티브로져스", "캡틴아메리카", "비브라늄 방패");
		Avengers hero3 = new Avengers("브루스배너", "헐크", "강한피부&점프");
		Avengers hero4 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		
		set.add(hero1);
		set.add(hero2);
		set.add(hero3);
		set.add(hero4);		 
		
		System.out.println("[최초 전체 정보출력]");
		for(Avengers av : set)
		{
			System.out.println(av.toString());			
		}
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요:");
		String searchName = scanner.nextLine();
		
		Iterator<Avengers> itr = set.iterator();
		while(itr.hasNext()) {
			Avengers avengers = itr.next();
			if(searchName.compareTo(avengers.name)==0) {
				System.out.println(avengers);
				System.out.println("[요청하신 정보를 찾았습니다.]");
			}
		}
	}
}
