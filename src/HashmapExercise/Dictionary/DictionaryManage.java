package HashmapExercise.Dictionary;

import java.util.*;

public class DictionaryManage {
    private Map<String, String> mapDictionary = new HashMap<>();
    public Scanner scanner = new Scanner(System.in);

    public DictionaryManage(Map<String, String> mapDictionary) {
        this.mapDictionary = mapDictionary;
    }

    public Map<String, String> getMapDictionary() {
        return this.mapDictionary;
    }

    public void setMapDictionary(Map<String, String> mapDictionary) {
        this.mapDictionary = mapDictionary;
    }

    public void addWord() {
        System.out.print("input the Word: ");
        String keyWord = scanner.nextLine();
        System.out.print("input the Meaning: ");
        String wordMeaning = scanner.nextLine();
        Word newWord = new Word(keyWord, wordMeaning);
        this.mapDictionary.put(newWord.getKeyWord(), newWord.getWordMeaning());

    }


    public void removeWord() {
        System.out.print("input the word you want to remove: ");
        String keyWordRemove = scanner.nextLine();
        this.mapDictionary.remove(keyWordRemove);
    }

    public void changeWord() {
        System.out.println("1.Change word\n2.change meaning");
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.print("input the word you want to change: ");
        String keyWordChange = scanner.nextLine();
        if (choice == 1) {
            System.out.print("new word: ");
            String newKeyWord = scanner.nextLine();
            String oldValue = this.mapDictionary.get(keyWordChange);
            this.mapDictionary.remove(keyWordChange);

            this.mapDictionary.put(newKeyWord, oldValue);
        } else {
            System.out.print("input new mean: ");
            String newMeaning = scanner.nextLine();
            this.mapDictionary.replace(keyWordChange, this.mapDictionary.get(keyWordChange), newMeaning);
        }
    }

    public void searchWord() {
        int count = 0;
        System.out.print("word want to search meaning: ");
        String searchWord = scanner.nextLine();
        for (String key : this.mapDictionary.keySet()) {
            if (key.equals(searchWord)) {
                if (count == 0) {
                    System.out.printf("%-15s%-30s\n", "WORD", "MEAN");
                    System.out.printf("%-15s%-30s\n", "-------------", "------------------------");
                    count++;
                }
                System.out.printf("%-15s", key);
                System.out.printf("%-30s\n", mapDictionary.get(key));
            }
        }
        if (count == 0) {
            System.out.println("NOT FOUND");
        }

    }

    public void removeAll() {
        System.out.print("Are you sure? (y/n) : ");
        String submit = scanner.nextLine();
        if (submit.equals(String.valueOf('y'))) {
            this.mapDictionary.clear();
        }
    }

    public void sortWord() {
       TreeMap<String,String> TreemapSorted=new TreeMap<>(this.mapDictionary);
       Set<Map.Entry<String,String>> newMapSorted=TreemapSorted.entrySet();
       for (Map.Entry<String, String> newMap : newMapSorted){
           System.out.printf("%-15s", newMap.getKey());
           System.out.printf("%-30s\n", newMap.getValue());
       }
    }

    public void displayWord() {
        for (String key : this.mapDictionary.keySet()) {
            System.out.printf("%-15s", key);
            System.out.printf("%-30s\n", mapDictionary.get(key));
        }
    }

}
