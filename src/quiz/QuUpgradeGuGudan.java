package quiz;

public class QuUpgradeGuGudan {

	public static void main(String[] args) {
		for (int base = 2; base <= 9; base++) {
            System.out.println("\n[" + base + "단 출력]");
            int result = 1;
            for (int exp = 1; exp <= 9; exp++) {
                result *= base;

                // 곱셈 표현을 문자열로 직접 만들기
                String expression = "";
                for (int i = 0; i < exp; i++) {
                    expression += base;
                    if (i < exp - 1) {
                        expression += " X ";
                    }
                }

                System.out.println(expression + " = " + result);
            }
        }
    

		long totalSum = 0;

        for (int dan = 2; dan <= 9; dan++) {
            long danSum = 0;
            System.out.println();
            long result = 1;

            for (int exp = 1; exp <= 9; exp++) {
                result *= dan;  // 거듭제곱 계산
                System.out.printf("%d^%d = %d\n", dan, exp, result);
                danSum += result;
            }

            System.out.println();
            totalSum += danSum;
        }

        System.out.println("전체 구구단 제곱 합계: " + totalSum);
    }
}