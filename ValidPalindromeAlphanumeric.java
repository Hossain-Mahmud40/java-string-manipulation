import java.util.Scanner;

public class ValidPalindromeAlphanumeric {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine().toLowerCase();
    String cleaned = "";
    for(int i=0;i<line.length();i++){
      char c = line.charAt(i);
      if((c>='a'&&c<='z') || (c>='0'&&c<='9')){ cleaned += c; }
    }
    boolean ok = true;
    for(int i=0;i<cleaned.length()/2;i++){
      if(cleaned.charAt(i)!=cleaned.charAt(cleaned.length()-1-i)){ ok=false; break; }
    }
    System.out.println(ok);
  }
}
