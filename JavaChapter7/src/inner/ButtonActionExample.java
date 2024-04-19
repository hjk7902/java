package inner;

public class ButtonActionExample {
	public static void main(String[] args) {
		Button btn1 = new Button("Red");

		class ButtonClickListener implements Button.OnClickListener {
			@Override
			public void onClick() {
				System.out.println("버튼을 클릭했습니다.");	
			}
		}
		ButtonClickListener listener = new ButtonClickListener();
		btn1.setOnClickListener(listener);
		
		btn1.actionClick(); //버튼을 클릭함

	}
}