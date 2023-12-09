import java.util.Scanner;

public class ShapeDrawer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("도형을 선택하세요:");
        System.out.println("1. 정사각형");
        System.out.println("2. 직사각형");
        System.out.println("3. 삼각형");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                drawSquare();
                break;
            case 2:
                drawRectangle();
                break;
            case 3:
                drawTriangle();
                break;
            default:
                System.out.println("올바른 선택이 아닙니다.");
        }

        scanner.close();
    }

    // 정사각형 그리기
    private static void drawSquare() {
        System.out.println("정사각형을 그립니다.");
        System.out.println("****");
        System.out.println("****");
        System.out.println("****");
        System.out.println("****");
    }

    // 직사각형 그리기
    private static void drawRectangle() {
        System.out.println("직사각형을 그립니다.");
        System.out.println("********");
        System.out.println("********");
    }

    // 삼각형 그리기
    private static void drawTriangle() {
        System.out.println("삼각형을 그립니다.");
        System.out.println("  *  ");
        System.out.println(" *** ");
        System.out.println("*****");
    }
}
