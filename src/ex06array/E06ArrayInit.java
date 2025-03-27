package ex06array;

public class E06ArrayInit {
	
	public static void main(String[] args) {
		
		System.out.println("배열 선언후 초기화 하지 않은상태");
		int[] arr = new int[3];
		System.out.println("arr[0]="+ arr[0]);//0출력
		
		int[][] arr2 = new int[3][4];
		System.out.println("arr2[0][0]="+ arr2[0][0]);//0출력
		
		System.out.println("배열 선언과 동시에 초기화 한 상태");
		int[] arrDim = {1, 2, 3};
		System.out.println("arrDim[0]="+ arrDim[0]);//1출력
		
		int[][] arr2Dim = {
				{1},
				{2,3}
		};
		System.out.println("arr2Dim[0][0]="+ arr2Dim[0][0]);
		System.out.println("arr2Dim[0][1]="+ arr2Dim[0][1]);
	}

}
