import java.util.Scanner;
public class SpellPowerAnalyzer{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Names of the spells: ");
  String longest = "";
  while(true){
  String spell = sc.nextLine();
  if(spell.equals("stop")==true){
  break;
  }
  String cleaned = "";
  for(int i=0; i<spell.length();i++){
    char c = spell.charAt(i);
    if(c>='A'&& c<='Z' || c>='a' && c<='z'){
    cleaned +=c;
    }
  }
  if(cleaned.length()>longest.length()){
  longest = cleaned;
  }

   
  }
  
    String upper =  longest.toUpperCase();
    int power =0;
    for(int i =0; i<upper.length();i++){
    power+=(int) upper.charAt(i);    
    }
    System.out.println("Largest Spell : " + upper);
    System.out.println("Power Level : " + power);
  }
}
