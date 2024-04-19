package inner;

import java.awt.*;
import java.awt.event.*;

public class AnonyClassVarExample {
	private Frame f;

	public AnonyClassVarExample() {
		f = new Frame("Anonymous Class");
	}
	
	WindowListener handler = new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	};
	
	public void launchFrame() {
		f.addWindowListener(handler);
		f.setSize(300, 200);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		AnonyClassVarExample ae = new AnonyClassVarExample();
		ae.launchFrame();
	}
}