public class Squirrel {
    public static int nutsLeft(int squirrel, int nuts) {
        if (squirrel == 0) {
            return 0;
        }
        return nuts % squirrel;
    }
}
