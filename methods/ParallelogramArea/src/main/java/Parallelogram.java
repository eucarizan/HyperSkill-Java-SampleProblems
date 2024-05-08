public class Parallelogram {
    public static int area(int b, int h) {
        if (b < 1 || h < 1) {
            return 0;
        }

        return b * h;
    }
}
