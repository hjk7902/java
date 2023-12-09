
public class Test4 {
	public static void main(String[] args) {
		int featureStatus = 12;  // 자동차의 기능 상태

		int thirdFeature = (featureStatus >> 2) & 1;

		if (thirdFeature == 1) {
		    System.out.println("세 번째 기능이 활성화되어 있습니다.");
		} else {
		    System.out.println("세 번째 기능이 비활성화되어 있습니다.");
		}
	}
}
