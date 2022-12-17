package study_basic;

public class MethodTest04 {
	//메소드 공부 04_기초
	//: 한 걸음을 걸을 때마다 0.02 kcal가 소모된다고 합니다. 하루 동안 5000걸음을 걸었다고 할 때, 이를 통해 소모된 칼로리량을 메소드로 계산해주세요.
	// 출력 예) 소모 칼로리: 100.0kcal
	//출처: 유튜브 홍팍- 연습문제:메소드

	public static void main(String[] args) {
		// 0.02x = 5000 * 0.02
		double kcal = walk(5000);

		System.out.println("소모 칼로리:" + kcal + "kcal");
	}
	
	public static double walk(int i) {
		return 0.02 * i;
	}	 
	


}
