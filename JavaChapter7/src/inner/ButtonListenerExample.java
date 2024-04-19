package inner;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;

public class ButtonListenerExample{
	JFrame frame = new JFrame();
	
	public void init(){
		JButton btn = new JButton("Click");
		btn.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e){
				JButton btn = (JButton) e.getSource();
				if(btn.getText().equals("Click"))
					btn.setText("Hello");
				else 
					btn.setText("Click");
			}
		});
		frame.add(btn); //컨테이너에 배치
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X 종료
		frame.setVisible(true); // 프레임이 화면에 보이도록 설정
	}

	public static void main(String[] args){
		new ButtonListenerExample().init();
	}
}