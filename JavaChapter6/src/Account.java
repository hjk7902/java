
public class Account {
	// 필드, 멤버변수, 객체의 명사적 특징
	public String name;
	public String accountNumber;
	public String passwd;
	public long balance;
	public float interest;
	
	// 객체의 동사적 특징
	public void saveMoney(long amount) {
		balance = balance + amount;
	}
	
	public void withdrawMoney(long amount) {
		balance = balance - amount;
	}
	
	public long getBalance() {
		return balance;
	}
}
