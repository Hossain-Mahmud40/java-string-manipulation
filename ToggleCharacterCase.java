import java.util.Scanner;

public class ToggleCharacterCase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String result = "";
    for(int i=0;i<str.length();i++){
      char c = str.charAt(i);
      if(c>='A'&&c<='Z'){ result += (char)(c+32); }
      else if(c>='a'&&c<='z'){ result += (char)(c-32); }
      else{ result += c; }
    }
    System.out.println(result);
  }
}
