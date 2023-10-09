import java.util.ArrayList;

public class ConcatPositiveNumbersProblem {
    public static ArrayList<Integer> concatPositiveNumbers(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> returnList = new ArrayList<>();

        l1.forEach(n -> {
            if (n > 0) {
                returnList.add(n);
            }
        });

        l2.forEach(n -> {
            if (n > 0) {
                returnList.add(n);
            }
        });

        return returnList;
    }

    // short solution
    /*
        l1.addAll(l2);
        l1.removeIf(el -> el < 0);
        return l1;
     */
}
