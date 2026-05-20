import java.util.Scanner;

public class AnagramCheckerPractice {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine().toLowerCase();
    String b = sc.nextLine().toLowerCase();
    if(a.length()!=b.length()){ System.out.println(false); return; }
    boolean anagram = true;
    for(int i=0;i<a.length();i++){
      char c = a.charAt(i);
      int countA = 0, countB = 0;
      for(int j=0;j<a.length();j++){
        if(a.charAt(j)==c){ countA++; }
        if(b.charAt(j)==c){ countB++; }
      }
      if(countA!=countB){ anagram=false; break; }
    }
    System.out.println(anagram);
  }
}
