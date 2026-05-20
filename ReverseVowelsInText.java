import java.util.Scanner;
public class ReverseVowelsInText {
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  String str = sc.nextLine();
  String vowels="";
  for(int i=0; i<=str.length()-1;i++){
    char c = str.charAt(i);

    if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
    vowels += c;
}
  }
//  System.out.print(vowels);
  int j = vowels.length()-1;
  String result ="";
  for(int i=0; i<=str.length()-1;i++){
    char c = str.charAt(i);
   if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
    result+=vowels.charAt(j);
    j--;
   }else{
     result+=c;
   }
  }
  System.out.println(result);
  }
}
