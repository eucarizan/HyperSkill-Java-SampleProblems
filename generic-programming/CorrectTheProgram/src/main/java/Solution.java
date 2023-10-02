public class Solution {
    public static String method(String value) {
        Printer<String> printer = new Printer<>();
        printer.set(value);
        return printer.print();
    }
}

class Printer<T> {
    private T value;

    void set(T value) {
        this.value = value;
    }

    String print() {
        return "Passed value: " + value;
    }
}
