package ex17collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import common.Student;
import ex01start.E02SystemOutPrintln;

public class QnArrayList {

	public static void main(String[] args) {
		//ArrayList<Student> list = new ArrayList<Student>();
		LinkedList<Student> list = new LinkedList<Student>();
		
		//저장할 객체 생성
		Student st1 = new Student("가길동", 10, "2018");
		Student st2 = new Student("나길동", 20, "2017");
		Student st3 = new Student("다길동", 30, "2016");
		Student st4 = new Student("마길동", 40, "2015");
		
		//객체 추가(컬렉션에 저장)
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		

		Scanner scanner = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요:");
		String searchName = scanner.nextLine();
		
		int index = -1;
		for(Student student: list ) {
			if(searchName.compareTo(student.getName())==0) {
				System.out.println("[검색되었습니다\n[삭제후 정보출력]");
				index = list.indexOf(student);
				break;
			}
		}
		
		if(index!= -1) {
			list.remove(index);
		}
		else {
			System.out.println("검색결과가 없다.");
		}
		
		System.out.println();
		for(Student st : list) {
			System.out.println(st);
		}
	}
}
