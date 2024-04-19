package inner;

import java.awt.*;
import java.awt.event.*;

public class InnerExample {
	private Frame f;
	
	public InnerExample() {
		f = new Frame("Inner 클래스 예제");
	}
	public void launchFrame() {
		f.addWindowListener(new MyWindowAdapter());
		f.setSize(300, 200);
		f.setVisible(true);
	}
	public static void main (String[] args) {
		InnerExample ie = new InnerExample();
		ie.launchFrame();
	}
	private class MyWindowAdapter extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}//end inner class
}//end class