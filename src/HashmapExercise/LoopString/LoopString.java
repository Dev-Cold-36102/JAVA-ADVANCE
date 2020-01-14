package HashmapExercise.LoopString;

import java.util.*;
import java.util.Map.Entry;

public class LoopString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> hashStringCount = new HashMap<>();
        System.out.print("please input the string : ");
        String stringInput = scanner.nextLine();
        String[] arrayWord = stringInput.split(" ");
        for (int i = 0; i < arrayWord.length; i++) {
            if (!hashStringCount.containsKey(arrayWord[i])) {
                hashStringCount.put(arrayWord[i], 1);
            } else {
                int newCount = hashStringCount.get(arrayWord[i]) + 1;
                hashStringCount.put(arrayWord[i], newCount);
            }
        }

        sortAmout(hashStringCount);

    }

//sap xep so lan xuat hien theo thu tu tang dan

    public static void sortAmout(HashMap<String, Integer> hashStringCount) {
        Set<Entry<String, Integer>> entries = hashStringCount.entrySet();
        Comparator<Entry<String, Integer>> comparator = new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> Word1, Entry<String, Integer> Word2) {
                Integer amoutOfWord1 = Word1.getValue();
                Integer amoutOfWord2 = Word2.getValue();
                return amoutOfWord1 - amoutOfWord2;
            }
        };
        List<Entry<String, Integer>> listEntries = new ArrayList<>(entries);
        Collections.sort(listEntries, comparator);
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>(listEntries.size());
        for (Entry<String, Integer> entry : listEntries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        System.out.printf("%-15s%-10s\n", "word", "amout");
        for (String key : sortedMap.keySet()) {
            System.out.printf("%-15s", key);
            System.out.printf("%-10s\n", sortedMap.get(key));
        }

    }
}
