public class Point {
    private int x;
    private int y;

    // 좌표를 받는 생성자
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // x만을 받는 생성자 (y는 기본값으로 초기화)
    public Point(int x) {
        this(x, 0); // 다른 생성자 호출
    }

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
    
}
