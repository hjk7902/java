public class BasicSwitchExample {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        char b;

        switch (a) {
            case 9:
            case 8:
                b = 'A';
                break;
            case 7:
            case 6:
            case 5:
                System.out.println("7, 6, 5 입니다.");
                b = 'B';
                break;
            default:
                b = 'C';
        }

        System.out.println(b);
    }
}
