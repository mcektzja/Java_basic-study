package study_basic;

public class MethodTest06 {
	//메소드 공부 06_
	//: 주사위를 던저 나오는 눈의 수 만큼 달러를 획득하는 게임이 있다.
	//주사위를 총 3번 던져 얻은 달러를 환전한 결과를 출력하세요.
	//출력 예) 획득 금액: $12.00(12987원)
	
	//요구사항 -1) Math.random() 1과 6사이의 숫자를 반환하는 dice() 메소드를 구현할 것
	//        2) 1달러의 환율을 1082.25108원으로 할 것
	//출처: 유튜브 홍팍- 연습문제:메소드

	public static void main(String[] args) {
		
		double dollar = dice() + dice() + dice();
		 
		double won = 1082.25108 * dollar;
		
		System.out.printf("획득 금액:$%.2f(%.0f원)", dollar, won);
	}
	 
	public static int dice() {
		return (int)(Math.random() * 5) + 1;
	}

}
    // 이 문제는 현 수준으로는 어려우니 또 복습하자!