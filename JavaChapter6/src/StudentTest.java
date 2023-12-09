public class StudentTest {
    public static void main(String[] args) {
        // 생성자를 이용하여 학생 객체 생성
        Student student1 = new Student("홍길동", 20, "컴퓨터 공학");
        Student student2 = new Student("김철수", 22, "전자 공학");

        // 학생 정보 출력
        System.out.println("첫 번째 학생 정보:");
        student1.displayStudentInfo();

        System.out.println("\n두 번째 학생 정보:");
        student2.displayStudentInfo();
    }
}

class Student {

    private String name;
    private int age;
    private String major;

    // 생성자: 이름(name), 나이(age), 전공(major)을 인자로 받아 초기화
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    // 학생 정보를 출력하는 메서드
    public void displayStudentInfo() {
        System.out.printf("이름: %s, 나이: %d, 전공: %s\n", name, age, major);
    }
}
