
public class EnhancedForExample {

	public static void main(String[] args) {
		String[] weekArray = {"Sunday", "Monday", "Tuesday", "Thursday",
				"Wednesday", "Friday", "Saturday"};
		for(String day : weekArray) {
			System.out.println(day);
		}
		System.out.println();
		for(int i=0; i<weekArray.length; i++) {
			System.out.println(weekArray[i]);
		}
	}

}
