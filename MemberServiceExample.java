package study_basic;

//public class ClessTest02 {
		//조건문 공부 02_
	    //MemberService 클래스에서 login(), logout()메소드를 선언해보세요
      //<조건 1> login()메소드는 매개값 id가 "hong", 매개값 password가 "12345"일 경우에만 true로 리턴 
      //<조건 2> logout()메소드는 id + "님이 로그아웃 되었습니다"가 출력되도록 할 것
	    //출처: 이것이 자바다(2022)	
	
//}


public class MemberServiceExample {

	public static void main(String[] args) {
		
		MemberService input = new MemberService();
		
		boolean result = input.login("hong", "12345");
		
		if(result) {
			input.login("hong");
			input.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다");
		}

	}

}
