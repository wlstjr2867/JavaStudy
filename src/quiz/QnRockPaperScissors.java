package quiz;

import java.util.Random;
import java.util.Scanner;

public class QnRockPaperScissors {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int computer = random.nextInt(3) +1;
		System.out.println("컴퓨터"+ computer);
		
		final int Scissors;
		final int Rock;
		final int Paper;
		
		int user;
		
		System.out.print("무엇을 내겠습니까?(1: 가위, 2:바위, 3:보):");	
		user = scanner.nextInt();
			if(user==1 && computer==3) {
				System.out.println("사용자 : 가위, 컴퓨터 : 보");
				System.out.println("이겼습니다");
			}
			else if(user==1 && computer==1) {
				System.out.println("사용자 : 가위, 컴퓨터 : 가위");
				System.out.println("비겼습니다");
			}
			else if(user==1 && computer==2) {
				System.out.println("사용자 : 가위, 컴퓨터 : 바위");
				System.out.println("졌습니다");
			}
			else if(user==2 && computer==1) {
				System.out.println("사용자 : 바위, 컴퓨터 : 가위");
				System.out.println("이겼습니다");
			}
			else if(user==2 && computer==2) {
				System.out.println("사용자 : 바위, 컴퓨터 : 바위");
				System.out.println("비겼습니다");
			}
			else if(user==2 && computer==3) {
				System.out.println("사용자 : 바위, 컴퓨터 : 보");
				System.out.println("졌습니다");
			}
			else if(user==3 && computer==1) {
				System.out.println("사용자 : 보, 컴퓨터 : 가위");
				System.out.println("졌습니다");
			}
			else if(user==3 && computer==2) {
				System.out.println("사용자 : 보, 컴퓨터 : 바위");
				System.out.println("이겼습니다");
			}
			else if(user==3 && computer==3) {
				System.out.println("사용자 :	보, 컴퓨터 : 보");
				System.out.println("비겼습니다");
			}
			else {
				System.out.println("가위바위보 할줄 모르세요? 제대로 내세요^^;");
			}
			
			
	}
}
