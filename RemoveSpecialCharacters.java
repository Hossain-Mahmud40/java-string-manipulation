import java.util.Scanner;

public class RemoveSpecialCharacters {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String result = "";
    for(int i=0;i<str.length();i++){
      char c = str.charAt(i);
      if((c>='A'&&c<='Z') || (c>='a'&&c<='z') || (c>='0'&&c<='9') || c==' '){
        result += c;
      }
    }
    System.out.println(result);
  }
}
