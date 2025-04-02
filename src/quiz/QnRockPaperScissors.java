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
		
		int restart;
		
		while(true) {
			for(int i=0; i<5; i++) {  //게임시작
			
				computer = random.nextInt(3)+1;
				while(true) {
					System.out.print("무엇을 내겠습니까?(1: 가위, 2:바위, 3:보):");
					user = scanner.nextInt();
					
					if(user==SCISSOR && computer==SCISSOR) {
						System.out.println("사용자 : 가위, 컴퓨터 : 가위");
						System.out.println("비겼습니다.");
					}
					if(user==SCISSOR && computer==ROCK) {
						System.out.println("사용자 : 가위, 컴퓨터 : 바위");
						System.out.println("졌습니다.");
					}
					if(user==SCISSOR && computer==PAPER) {
						System.out.println("사용자 : 가위, 컴퓨터 : 보");
						System.out.println("이겼습니다.");
					}
					if(user==ROCK && computer==SCISSOR) {
						System.out.println("사용자 : 바위, 컴퓨터 : 가위");
						System.out.println("이겼습니다.");
					}
					if(user==ROCK  && computer==ROCK) {
						System.out.println("사용자 : 바위, 컴퓨터 : 바위");
						System.out.println("비겼습니다.");
					}
					if(user==ROCK && computer==PAPER) {
						System.out.println("사용자 : 바위, 컴퓨터 : 보");
						System.out.println("졌습니다.");
					}
					if(user==PAPER && computer==SCISSOR) {
						System.out.println("사용자 : 보, 컴퓨터 : 가위");
						System.out.println("졌습니다.");
					}
					if(user==PAPER && computer==ROCK) {
						System.out.println("사용자 : 보, 컴퓨터 : 바위");
						System.out.println("이겼습니다.");
					}
					if(user==PAPER && computer==PAPER) {
						System.out.println("사용자 : 보, 컴퓨터 : 보");
						System.out.println("비겼습니다.");
					}
					if(user !=1 && user !=2 && user !=3) {//a!=b a는 b랑 같지않다
						System.out.println("가위바위보 할줄 모르세요? 제대로 내세요^^;");
						continue;
					}//if문
					break;
				}//while문 //
			}//for문
			System.out.println("5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0)");
			while(true) {
				restart = scanner.nextInt();
				if(restart==1) {
					System.out.println("게임 재시작");
					break;
				}
				else if(restart==0) {
					System.out.println("게임종료");
					System.exit(0);
				}
				else {
					System.out.println("잘못입력하셨습니다.재시작(1), 종료(0)중에 입력하세요.");
				}
			}//작은while문
		}//큰while문
	}//main문
}//class문