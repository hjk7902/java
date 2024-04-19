package inner;

public class ButtonActionExample2 {
	public static void main(String[] args) {
		Button btn1 = new Button("Red");

		Button.OnClickListener listener = new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("버튼을 클릭했습니다.");	
			}
		};		
		
		btn1.setOnClickListener(listener);
		
		btn1.actionClick(); //버튼을 클릭함
	}
}