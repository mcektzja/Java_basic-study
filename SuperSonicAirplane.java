//메소드 공부 09_ 오버라이딩 연습
//출처: 이것이 자바다(2022)


package Method;

public class SuperSonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행입니다");
		} else {
			super.fly();
		}

	}
	
}
