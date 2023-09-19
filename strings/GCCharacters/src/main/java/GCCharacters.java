public class GCCharacters {
    public static double gcPercent(String genome) {
        if (genome.isEmpty()) {
            return 0.0;
        }

        return 100.0 * genome.toLowerCase().chars()
                .filter(ch -> ch == 'c' || ch == 'g')
                .count() / genome.length();
    }

    public static double gcPercentArray(String genome) {
        int count = 0;

        for (char ch : genome.toLowerCase().toCharArray()) {
            if (ch == 'g' || ch == 'c') {
                count++;
            }
        }

        return count * 1.0 / genome.length();
    }
}
