package question4;


import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final Map<String, Integer> permutations = new HashMap<>();

    public static void main(String[] args) {
        permutation("", "ABC");
        System.out.println(permutations.keySet());
    }

    private static void permutation(String prefix, String text) {
        int length = text.length();
        if (length == 0) permutations.putIfAbsent(prefix, prefix.length());
        else {
            for (int i = 0; i < length; i++)
                permutation(prefix + text.charAt(i), text.substring(0, i) + text.substring(i + 1, length));
        }
    }
}