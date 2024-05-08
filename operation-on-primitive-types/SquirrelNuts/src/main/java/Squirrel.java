public class Squirrel {
    public static int nutsForEach(int squirrels, int nuts) {
        if (squirrels == 0) {
            return 0;
        }

        return nuts / squirrels;
    }
}
