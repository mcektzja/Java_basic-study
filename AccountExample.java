package study_basic_classTest;

public class AccountExample {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.setBalance(10000);  // 저장함
		System.out.println("잔고: " + account.getBalance());

		account.setBalance(1100000); // 받아들일 수 있는 최댓값을 넘어 저장하지 않음
		System.out.println("잔고: " + account.getBalance());

		account.setBalance(-6000);  // 음수라 저장하지 않음
		System.out.println("잔고: " + account.getBalance());
		
		
		

	}

}
