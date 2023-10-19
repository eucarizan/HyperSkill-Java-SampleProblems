import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int num = scanner.nextInt();
            int max = num;
            while (num != 0) {
                max = Math.max(num, max);
                num = scanner.nextInt();
            }
            System.out.println(max);
        }
    }
}
