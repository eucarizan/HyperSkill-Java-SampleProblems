public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.println();
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println("{\n\t\"row\":" + i + ",\n\t\"column\":" + j + "\n},");
            }
            
        }
    }
}