
public class AccountMain {

	public static void main(String[] args) {
		Account myAccount = new Account();
		myAccount.name = "홍길동";
		myAccount.passwd = "1234";
		myAccount.balance = 3800000;
		myAccount.interest = 6.0F;
		
		myAccount.saveMoney(50000);
		System.out.println(myAccount.balance);
		myAccount.withdrawMoney(80000);
		long myBalance = myAccount.getBalance();
		System.out.println(myBalance);
	}

}
