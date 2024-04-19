package inner;

public class ButtonActionExample3 {
	public static void main(String[] args) {
		Button btn1 = new Button("Red");

		btn1.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("버튼을 클릭했습니다.");	
			}
		});

		btn1.actionClick(); //버튼을 클릭함
	}
}