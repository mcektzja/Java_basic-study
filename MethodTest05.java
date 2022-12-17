package study_basic;

public class MethodTest05 {
	//메소드 공부 05_다중 파라미터
	//: 가솔린 8.68L를 충전한 A자동차는 총 182.736km를 운행할 수 있었다고 합니다. 이차의 연비를 메소드를 사용해서 계산해주세요.
	// 출력 예) 연비: 20.62	km/L
	//출처: 유튜브 홍팍- 연습문제:메소드
	
	public static void main(String[] args) {
	//연비 = 이동거리 / 충전량	
		double fuel=8.68;
		double distance = 182.736;
		
		double efficiency =  Calculation(fuel, distance);
		System.out.printf("연비:%.2f km/L", efficiency );
	}
	
	public static double Calculation(double fuel, double distance) {
		return distance/fuel;
	}

}
