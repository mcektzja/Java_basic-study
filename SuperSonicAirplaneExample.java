

package Method;

public class SuperSonicAirplaneExample {

	public static void main(String[] args) {
		SuperSonicAirplane sa = new SuperSonicAirplane();
		sa.takeOff();
		sa.fly(); //재정의
		sa.flyMode = SuperSonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SuperSonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
