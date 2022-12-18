package study_basic;

public class ConditionalTest02 {

	public static void main(String[] args) {
		//조건문 공부 04_ 
		//: 중첩된 반복문을 사용하여 구구단을 출력해 봅시다.
		//출처: 유튜브 홍팍- 연습문제 반복문과 배열1

		
		for(int i=2; i<=9; i++) {
			System.out.println(i + "단");
			for(int j=1; j<=9; j++) {
				System.out.println("\t" + i + "x" + j + "=" + i*j);
				//System.out.printf("\t %dx%d=%d", i, j, i*j);  이것도 사용가능하다.
			}

		}		
				
	}

}
