public class Solution {
    public static String hogwartsHouses(String house) {
        switch (house.toLowerCase()) {
            case "gryffindor":
                return "bravery";
            case "hufflepuff":
                return "loyalty";
            case "slytherin":
                return "cunning";
            case "ravenclaw":
                return "intellect";
            default:
                return "not a valid house";
        }
    }
}
