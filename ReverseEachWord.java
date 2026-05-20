import java.util.Scanner;

public class ReverseEachWord {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String[] words = line.split(" ");
    for(int i=0;i<words.length;i++){
      for(int j=words[i].length()-1;j>=0;j--){ System.out.print(words[i].charAt(j)); }
      if(i<words.length-1){ System.out.print(" "); }
    }
  }
}
