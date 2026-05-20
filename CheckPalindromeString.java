import java.util.Scanner;

public class CheckPalindromeString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    boolean palindrome = true;
    for(int i=0;i<str.length()/2;i++){
      if(str.charAt(i)!=str.charAt(str.length()-1-i)){ palindrome=false; break; }
    }
    System.out.println(palindrome);
  }
}
