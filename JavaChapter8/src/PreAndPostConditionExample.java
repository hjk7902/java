public class PreAndPostConditionExample {
	public static void main(String[] args) {
		Account myAccount = new Account("홍길동", 100);
//		myAccount.save(-10);
		System.out.println(myAccount);
		myAccount.withdraw(10);
		System.out.println(myAccount);
	}
}

class Account {
	String user;
	int balance;
	
	public Account(String user, int balance) {
		super();
		this.user = user;
		this.balance = balance;
	}

	public void save(int amount) {
		if(amount<=0) {
			//선행 조건은 확실하게 체크해야 합니다.
			throw new IllegalArgumentException("입금액 오류 - " + amount);
		}
		int preBalance = balance;
		System.out.println(amount + "원이 입급되었습니다.");
		this.balance = this.balance + amount;
		
		assert (this.balance == preBalance + amount);
	}
	public void withdraw(int amount) {
		if(amount<=0) {
			//선행 조건은 확실하게 체크해야 합니다.
			throw new IllegalArgumentException("출금액 오류 - " + amount);
		}
		int preBalance = balance;
		System.out.println(amount + "원이 출금되었습니다.");
		this.balance = this.balance + amount;
		
		assert (this.balance == preBalance + amount);
	}
	
	public String toString() {
		return user +"님의 잔고는 " + balance + "입니다.";
	}
}