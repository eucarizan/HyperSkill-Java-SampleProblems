public class Main {
    public static void main(String[] args) {
        String regex = "[a-zA-Z]{" + 4 + "}";
        System.out.println(regex);
        String regex1 = "[a-zA-Z]{1}";
        System.out.println("Ga@/,!?Taa!$[],aRaE,-+=!YaEaQ==_".matches(regex1));
    }
}