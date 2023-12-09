public class LogicalExample {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        boolean condition1 = x > 0 && y < 20;    // true
        boolean condition2 = x > 0 || y > 20;    // true
        boolean condition3 = !(x < 0) && (y != 10);  // true

        System.out.println("Condition 1: " + condition1);
        System.out.println("Condition 2: " + condition2);
        System.out.println("Condition 3: " + condition3);

        boolean Condition4 = (x > 0 && y < 20) || !(x < 0) && (y != 10);

        System.out.println("Condition 4: " + Condition4);
        
//        System.out.println(!(x & y)); // x & y는 0이고 0에 논리연산자 사용 못함
//        System.out.println( (x & y) && (x | y)); // 0 && 15는 0과 15가 
    }
}
