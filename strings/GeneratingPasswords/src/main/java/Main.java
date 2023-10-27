public class Main {
    public static void main(String[] args) {
        System.out.println("AX".equals(Solution.shortcut(1, 0, 0, 2)));
        System.out.println("aX".equals(Solution.shortcut(0, 1, 0, 2)));
        System.out.println("1X".equals(Solution.shortcut(0, 0, 1, 2)));
    }
}