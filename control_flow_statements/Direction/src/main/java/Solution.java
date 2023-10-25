public class Solution {
    public static String move(int n) {
        String out;

        switch (n) {
            case 1:
                out = "move up";
                break;
            case 2:
                out = "move down";
                break;
            case 3:
                out = "move left";
                break;
            case 4:
                out = "move right";
                break;
            case 0:
                out = "do not move";
                break;
            default:
                out = "error!";
        }
        return out;
    }
}
