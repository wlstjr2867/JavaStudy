package ex04controlstatement;

public class QuPyramid04 {

	public static void main(String[] args) {
		
		final int MAX_NUM = 5;
		int repeatNum = MAX_NUM*2 -1;
		int descNum = -1;
		
		for(int i=1 ; i<=repeatNum ; i++) {
			if(i<=MAX_NUM) {
				for(int j=1 ; j<=i ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				descNum = MAX_NUM - (i-MAX_NUM);
				for(int j=1 ; j<=descNum ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
