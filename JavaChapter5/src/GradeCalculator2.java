import java.util.Scanner;

public class GradeCalculator2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 학생 수와 과목 수를 입력받음
        System.out.print("학생 수를 입력하세요: ");
        int studentCount = scanner.nextInt();
        System.out.print("과목 수를 입력하세요: ");
        int subjectCount = scanner.nextInt();

        // 성적을 저장할 이차원 배열 선언
        int[][] grades = new int[studentCount][subjectCount];

        // 각 학생의 각 과목 성적을 입력받아 배열에 저장
        for (int i = 0; i < studentCount; i++) {
            System.out.println("학생 " + (i + 1) + "의 성적을 입력하세요:");
            for (int j = 0; j < subjectCount; j++) {
                System.out.print("과목 " + (j + 1) + ": ");
                grades[i][j] = scanner.nextInt();
            }
        }

        // 배열의 성적을 출력
        System.out.println("\n입력된 성적:");
        for (int i = 0; i < studentCount; i++) {
            System.out.print("학생 " + (i + 1) + ": ");
            for (int j = 0; j < subjectCount; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }

        // 각 과목의 평균 계산 및 출력
        System.out.println("\n각 과목의 평균 성적:");
        for (int j = 0; j < subjectCount; j++) {
            double sum = 0;
            for (int i = 0; i < studentCount; i++) {
                sum += grades[i][j];
            }
            double average = sum / studentCount;
            System.out.println("과목 " + (j + 1) + ": " + average);
        }

        // 스캐너 닫기
        scanner.close();
    }
}
