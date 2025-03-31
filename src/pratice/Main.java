package pratice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int sum =0;
		int i = 1;
		for(i=1; i<=100; i++) {
			if(i%3==0 && i%7==0)
				continue;
			else if(i%3==0 || i%7==0)
				sum += i;
		}
		System.out.println("1~100까지의 숫자중 3의배수,7의배수의 합:"+ sum);
		
		
	}

}
