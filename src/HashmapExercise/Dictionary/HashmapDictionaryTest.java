package HashmapExercise.Dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashmapDictionaryTest {
    public static void main(String[] args) {
        Map<String, String> mapDictionary = new HashMap<>();
        DictionaryManage dictionary = new DictionaryManage(mapDictionary);
        Scanner scanner = new Scanner(System.in);
        Word word1 = new Word("i", "tôi");
        mapDictionary.put(word1.getKeyWord(), word1.getWordMeaning());
        Word word2 = new Word("love", "yêu");
        mapDictionary.put(word2.getKeyWord(), word2.getWordMeaning());
        Word word3 = new Word("tester", "kẻ hủy diệt");
        mapDictionary.put(word3.getKeyWord(), word3.getWordMeaning());
        Word word4 = new Word("coder", "trái tim tội nghiệp");
        mapDictionary.put(word4.getKeyWord(), word4.getWordMeaning());
        displayMenu(mapDictionary, dictionary);
    }

    public static void displayMenu(Map<String, String> mapDictionary, DictionaryManage dictionary) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%-15s%-30s\n", "WORD", "MEAN");
        System.out.printf("%-15s%-30s\n", "-------------", "------------------------");
        dictionary.displayWord();
        System.out.printf("%-15s%-30s\n", "-------------", "------------------------");
        System.out.printf("1.Add word\n2.Change word/mean\n3.Remove word\n4.Search word\n5.Remove All\n6.Sort Word\n");
        System.out.printf("-----------------------------------\n");
        System.out.print("choose: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                dictionary.addWord();
                break;
            case 2:
                dictionary.changeWord();
                break;
            case 3:
                dictionary.removeWord();
                break;
            case 4:
                dictionary.searchWord();
                System.out.println("input 'y' to back to home or 'n' to exit: ");
                String submit = scanner.next();
                if (!submit.equals(String.valueOf('y'))) {
                    return;
                }
            case 5:
                dictionary.removeAll();
                break;
            case 6:
                dictionary.sortWord();
                return;
        }
        displayMenu(mapDictionary, dictionary);

    }

}
