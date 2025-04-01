package quiz;

import java.util.Random;
import java.util.Scanner;

public class QnRockPaperScissors {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		final int SCISSOR = 1;
		final int ROCK = 2;
		final int PAPER = 3;
		
		int user;
		int computer;
		
		computer = random.nextInt(3)+1;
		System.out.print("무엇을 내겠습니까?(1: 가위, 2:바위, 3:보):");	
		user = scanner.nextInt();
		while(true) {
			if(user==SCISSOR && computer==PAPER) {
				System.out.println("사용자 : 가위, 컴퓨터 : 보");
				System.out.println("이겼습니다");
			}
			if(user==SCISSOR && computer==SCISSOR) {
				System.out.println("사용자 : 가위, 컴퓨터 : 가위");
				System.out.println("비겼습니다");
			}
			if(user==SCISSOR && computer==ROCK) {
				System.out.println("사용자 : 가위, 컴퓨터 : 바위");
				System.out.println("졌습니다");
			}
			if(user==ROCK && computer==SCISSOR) {
				System.out.println("사용자 : 바위, 컴퓨터 : 가위");
				System.out.println("이겼습니다");
			}
			if(user==ROCK && computer==ROCK) {
				System.out.println("사용자 : 바위, 컴퓨터 : 바위");
				System.out.println("비겼습니다");
			}
			if(user==ROCK && computer==PAPER) {
				System.out.println("사용자 : 바위, 컴퓨터 : 보");
				System.out.println("졌습니다");
			}
			if(user==PAPER && computer==SCISSOR) {
				System.out.println("사용자 : 보, 컴퓨터 : 가위");
				System.out.println("졌습니다");
			}
			if(user==PAPER && computer==ROCK) {
				System.out.println("사용자 : 보, 컴퓨터 : 바위");
				System.out.println("이겼습니다");
			}
			if(user==PAPER && computer==PAPER) {
				System.out.println("사용자 :	보, 컴퓨터 : 보");
				System.out.println("비겼습니다");
			}
		}	
	}
}
