import java.util.Scanner;

public class LargestTwoDigitNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int max = -1;
    for(int i=0;i<str.length()-1;i++){
      char a = str.charAt(i);
      char b = str.charAt(i+1);
      if(a>='0'&&a<='9'&&b>='0'&&b<='9'){
        int num = (a-'0')*10 + (b-'0');
        if(num>max){ max=num; }
      }
    }
    System.out.println(max);
  }
}
