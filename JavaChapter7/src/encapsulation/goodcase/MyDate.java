package encapsulation.goodcase;

public class MyDate {

	private int day;
	private int month;
	private int year;

	public void setDay(int d) {
		if( (d<1) || (d>31) ) {
			throw new RuntimeException("잘못된 날짜 입력됨");
		} else {
			day = d;
		}
	}
	
	public int getDay() {
		return day;
	}

	//month와 year필드의 set/get 메서드를 정의해 보세요.
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

}
