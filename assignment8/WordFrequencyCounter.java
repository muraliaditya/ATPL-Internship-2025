import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

            List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCount.entrySet());
            sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("word_frequencies.txt"))) {
                for (Map.Entry<String, Integer> entry : sortedList) {
                    writer.write(entry.getKey() + ": " + entry.getValue());
                    writer.newLine();
                }
            }

        } catch (IOException e) {
            System.err.println("File error: " + e.getMessage());
        }
    }
}
