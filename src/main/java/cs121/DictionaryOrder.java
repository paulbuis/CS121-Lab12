package cs121;

import java.util.Comparator;

class DictionaryOrder implements Comparator<String> {
    private static Comparator<String> natural = Comparator.naturalOrder();
    public int compare(String s1, String s2) {

        if (s1.isEmpty() && s2.isEmpty()) {
            return 0;
        }

        int result = String.CASE_INSENSITIVE_ORDER.compare(s1, s2);
        if (result == 0) {
            return natural.compare(s1, s2);
        }
        return result;
    }
}

