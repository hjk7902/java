import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 학생 수를 입력받음
        System.out.print("학생 수를 입력하세요: ");
        int studentCount = scanner.nextInt();

        // 성적을 저장할 배열 선언
        int[] grades = new int[studentCount];

        // 각 학생의 성적을 입력받아 배열에 저장
        for (int i = 0; i < studentCount; i++) {
            System.out.print("학생 " + (i + 1) + "의 성적을 입력하세요: ");
            grades[i] = scanner.nextInt();
        }

        // 배열의 성적을 출력
        System.out.println("입력된 성적:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("학생 " + (i + 1) + ": " + grades[i]);
        }

        // 평균 계산
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = sum / studentCount;

        // 평균 출력
        System.out.println("평균 성적: " + average);

        // 스캐너 닫기
        scanner.close();
    }
}

