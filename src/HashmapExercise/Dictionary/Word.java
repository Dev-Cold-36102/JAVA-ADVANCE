package HashmapExercise.Dictionary;

public class Word {
 private String keyWord;
 private String wordMeaning;

 public Word(String keyWord, String wordMeaning) {
  this.keyWord = keyWord;
  this.wordMeaning = wordMeaning;
 }

 public String getKeyWord() {
  return this.keyWord;
 }

 public void setKeyWord(String keyWord) {
  this.keyWord = keyWord;
 }

 public String getWordMeaning() {
  return this.wordMeaning;
 }

 public void setWordMeaning(String wordMeaning) {
  this.wordMeaning = wordMeaning;
 }


}
