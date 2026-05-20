import java.util.Scanner;

public class CountWordsInSentence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int count = 0;
    boolean inWord = false;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)!=' ' && !inWord){
        count++;
        inWord = true;
      }
      else if(str.charAt(i)==' '){
        inWord = false;
      }
    }
    System.out.println(count);
  }
}
