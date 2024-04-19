package interface_;

public class Something implements ISomething {
	public void run() { //재정의해야 함
//		MY_INT  = 33; //Error - ISomething 인터페이스의 final 변수임
		System.out.println("run() : " + ISomething.DEFAULT_SALARY); 
	}
}