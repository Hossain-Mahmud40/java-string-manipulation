import java.util.Scanner;

public class CapitalizeFirstLetter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String result = "";
    boolean newWord = true;
    for(int i=0;i<line.length();i++){
      char c = line.charAt(i);
      if(c==' '){
        result += c;
        newWord = true;
      }
      else if(newWord && c>='a'&&c<='z'){
        result += (char)(c-32);
        newWord = false;
      }
      else{
        result += c;
        newWord = false;
      }
    }
    System.out.println(result);
  }
}
