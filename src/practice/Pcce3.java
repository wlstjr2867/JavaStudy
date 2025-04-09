package practice;

import java.util.Scanner;

public class Pcce3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;
        
        while(number>0){
            answer += number % 100; //number=4859, answer=59
            number /= 100; //number =48
        }

        System.out.println(answer);
	}

}

