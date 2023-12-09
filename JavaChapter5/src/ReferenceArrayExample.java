import java.awt.Point;

public class ReferenceArrayExample {

	public static void main(String[] args) {
		Point[] pArr = {
				new Point(0,1),
				new java.awt.Point(7,6),
				new Point(9,6), new Point(0,8), new Point(2,3)
		};
		for(int i=0; i<pArr.length; i++) {
			System.out.println(pArr[i].toString());
		}
		for(Point p: pArr) {
			System.out.println(p.toString());
		}
		Pen[] penArr = {new Pen(), new Pen()};
		for(Pen p : penArr) {
			System.out.println(p);
		}
	}//end main
}//end class

class Pen { }
