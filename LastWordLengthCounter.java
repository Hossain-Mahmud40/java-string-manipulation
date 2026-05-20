import java.util.Scanner;
public class LastWordLengthCounter{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  String line = sc.nextLine();
  int i = line.length()-1;
  while(i>=0 && line.charAt(i)==' '){
  i--;
  }
  int count = 0;
  while(i>=0 && line.charAt(i)!=' '){
  count++;
  i--;
  }
  System.out.println(count);
  }
}
