package quiz;

import java.util.Random;
import java.util.Scanner;

/*
1. 컴퓨터는 1~100사이의 숫자 하나를 생성한다.
2. 총 시도횟수는 7번을 부여한다.
3. 사용자는 7번의 시도안에 숫자를 맞춰야 한다. 결과값인것
4. 사용자가 숫자를 입력했을때 컴퓨터는 높은지/낮은지 알려준다. up/down
5. 7번안에 맞추면 성공, 맞추지 못하면 실패라고 출력한다.  
6. 성공/실패 후 계속 할지를 물어보고 1이면 게임 재시작, 0이면 프로그램을 종료한다.
7. 메서드를 사용하여 구현한다.
실행결과]
생성된난수:36
1~100사이의 정수를 입력하세요:99
Down입니다.
1~100사이의 정수를 입력하세요:11
Up입니다.
1~100사이의 정수를 입력하세요:36
정답입니다.
승리하셨습니다.
게임을 다시 시작할까요?
1.게임재시작, 0:게임종료
0
감사합니다. 프로그램을 종료합니다.
import java.util.Random;
import java.util.Scanner;
*/
public class QuUpDownGame {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // 스케너 생성자로 스케너 인스턴스를 만들었다. 생성자의 매개변수로 system.in을 받았다.
		Random random = new Random();			 //랜덤 생성자로 랜덤 인스턴스를 만들었다.
		
		int user; //user 정수형으로 선언하고
		int computer; //computer를 정수형으로 선언한다.
		int restart;
		
		while(true) {
			computer = random.nextInt(100)+1; // random인스턴스를 통해 Random클래스에있는  nextInt메서드를 호출한다. 메서드에 100을 넣으면 0~99까지 난수를 하나 생성해서 반환한다. 
			//컴퓨터 부터 게임시작				 //	이 반환한 값에 1을 더하여 computer에 저장한다.
			//155 1111
			boolean bn = false; // false :
			System.out.println("생성된 난수:"+ computer);
			for(int i =1; i<=7; i++) {// 
				System.out.print("1~100사이의 정수를 입력하세요:");
				user = scanner.nextInt(); // scanner인스턴스를 통해 Scanner클래스에 있는 nextInt를 호출하여 사용자가 입력한 정수값을 반환한다. 이후에 반환한 값을 user에 저장한다.
				if(user > computer) { //유저변수는 유저말하는 값을 저장하는변수 / 컴퓨터는 생각하는 정수를 저장하는변수) // if가 트루이면 프린트문실행 elseif, else무시하고 while문으로 다시 들어감
					System.out.println("Down입니다");
				}
				else if(user < computer) {//if문이 false이고 else if문이 true이면 else문을 무시하고 while문으로 들어감
					System.out.println("Up입니다");
				}
				else {//if문과 else if문이 false이면 프린트문 실행하고 break를 만나서 for문으로 들어간다 ->n번째실행
					System.out.println("정답입니다");
					bn = true;
					break;
				}//if문
			}//for문 
			if(bn) { //true 이면 승리
				System.out.println("승리하셨습니다.");
			}
			else { //false 이면 패배 (bn값이 false이기 때문에 else를 만난다.)
				System.out.println("패배하셨습니다.");
			}
			System.out.println("게임을 계속하시겠습니까? 재시작(1), 종료(0)");
			while(true) {
				restart = scanner.nextInt(); // 스케너인스턴스를 통해
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
				}//if문
			}//작은while문	
		}//큰 while문	
	}//main문
}//class문


