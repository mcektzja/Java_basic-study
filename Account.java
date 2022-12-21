
//클래스 공부 03_
//문제: 은행 계좌 객체인 Account 객체는 잔고(balance) 필드를 가지고 있다.
//	   balance 필드는 음수값이 될 수 없고, 최대 백만원까지만 저장할 수 있다.
//	   Account 클래스를 작성하시오.
//	   <조건1> 외부에서 balance 필드를 마음대로 변경하지 못하도록
//	   <조건2> 0<= balance <= 1,000,000 범위의 값만 가지도록 
//	   <조건3> setter와 getter 사용
//	   <조건4> 0과 1,000,000은 상수 선언
//	   <조건5> setter의 값이 음수이거나 백만원을 초과하면 현재 balance 값을 유지
//출처: 이것이 자바다(2022)

package study_basic_classTest;

public class Account {

	//상수 선언
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	//필드 선언
	private int balance;

	public int getBalance() {						//필드의 값을 받아 리턴
		return balance;
	}

	public void setBalance(int balance) {			//외부에서 값을 받아 저장
		if((balance < Account.MIN_BALANCE) || (Account.MAX_BALANCE < balance)) {
			return;
		} else{ 
			this.balance = balance;
		}
	}
	
	
}
