import java.util.*;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "aditya";
        Map<Character, Integer> map = new HashMap<>();

        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map);
    }
}

