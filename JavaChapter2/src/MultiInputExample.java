import java.util.Scanner;

public class MultiInputExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder lines = new StringBuilder();
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if("".equals(line.trim())) {
				break;
			}else {
				lines.append(line + "\n");
			}
		}
		System.out.println(lines);
		scanner.close();
	}

}
