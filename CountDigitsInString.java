import java.util.Scanner;

public class CountDigitsInString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int count = 0;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)>='0' && str.charAt(i)<='9'){ count++; }
    }
    System.out.println(count);
  }
}
