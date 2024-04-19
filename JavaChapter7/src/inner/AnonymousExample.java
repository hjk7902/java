package inner;

import java.awt.*;
import java.awt.event.*;

public class AnonymousExample {
	private Frame f;

	public AnonymousExample() {
		f = new Frame("Anonymous Class 예제");
	}

	public void launchFrame() {
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		f.setSize(300, 200);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		AnonymousExample ae = new AnonymousExample();
		ae.launchFrame();
	}
}