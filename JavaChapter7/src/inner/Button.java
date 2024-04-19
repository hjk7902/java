package inner;

public class Button {
	private String label;
	
	public Button(String label) {
		this.label = label;
	}
	
	public void action(final int data) {
		class EventHandler {
			void callback() {
				System.out.println(label +"버튼의 이벤트 처리");
				System.out.println("이벤트핸들러에 전달된 값 : " + data);
			}
		}
		new EventHandler().callback();
	}//end click()
	
	private OnClickListener onClickListener;
	
	// 클릭 이벤트리스너 객체를 전달받기 위한 get 메서드
	public void setOnClickListener(OnClickListener listener) {
		this.onClickListener = listener;
	}
	
	// 이벤트가 발생할 경우 실행하는 콜백메서드를 정의한 인터페이스
	public static interface OnClickListener {
		void onClick(); // 버튼의 click이벤트가 발생하면 호출
	}
	
	public void actionClick() {
		System.out.println(label+"버튼의 이벤트를 처리합니다.");
		onClickListener.onClick();
	}
}//end class