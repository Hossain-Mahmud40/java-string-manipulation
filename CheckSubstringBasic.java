import java.util.Scanner;

public class CheckSubstringBasic {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String sub = sc.nextLine();
    boolean found = false;
    for(int i=0;i<=str.length()-sub.length();i++){
      boolean match = true;
      for(int j=0;j<sub.length();j++){
        if(str.charAt(i+j)!=sub.charAt(j)){ match=false; break; }
      }
      if(match){ found=true; break; }
    }
    System.out.println(found);
  }
}
