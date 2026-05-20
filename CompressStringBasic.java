import java.util.Scanner;

public class CompressStringBasic {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String result = "";
    for(int i=0;i<str.length();i++){
      char c = str.charAt(i);
      int count = 1;
      while(i<str.length()-1 && str.charAt(i+1)==c){
        count++;
        i++;
      }
      result += c;
      result += count;
    }
    System.out.println(result);
  }
}
