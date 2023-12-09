public class ComparisonExample {
    public static void main(String[] args) {
        // 등호(==) 비교 연산자 예제
        int a = 5;
        int b = 5;
        boolean isEqual = (a == b);
        System.out.println("Equal: " + isEqual);

        // 부등호(!=) 비교 연산자 예제
        int x = 10;
        int y = 20;
        boolean notEqual = (x != y);
        System.out.println("Not Equal: " + notEqual);

        // 크다(>) 비교 연산자 예제
        int m = 15;
        int n = 10;
        boolean isGreater = (m > n);
        System.out.println("Greater: " + isGreater);

        // 작다(<) 비교 연산자 예제
        double p = 3.14;
        double q = 4.0;
        boolean isLess = (p < q);
        System.out.println("Less: " + isLess);

        // 크거나 같다(>=) 비교 연산자 예제
        int r = 8;
        int s = 8;
        boolean isGreaterOrEqual = (r >= s);
        System.out.println("Greater or Equal: " + isGreaterOrEqual);

        // 작거나 같다(<=) 비교 연산자 예제
        int t = 12;
        int u = 15;
        boolean isLessOrEqual = (t <= u);
        System.out.println("Less or Equal: " + isLessOrEqual);
    }
}
