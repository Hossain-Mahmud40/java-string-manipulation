import java.util.Scanner;
public class FootballFanMessageAnalyzer{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  int madrid=0,bayern=0,destroy=0,close=0;
  System.out.print("Fan Message: ");
  String line = sc.nextLine();
  String[] words = line.split(" ");
  for(int i=0; i<words.length;i++){
    String w = "";
    for(int j=0; j<words[i].length(); j++){
      char c = words[i].charAt(j);
      if(c>='A' && c<='Z' || c>='a' && c<='z'){
        w += c;
      }
    }
    if(w.equalsIgnoreCase("Madrid")){
    madrid++;
    }
    else if(w.equalsIgnoreCase("Bayern")){
    bayern++;
    }
    else if(w.equalsIgnoreCase("close")){
    close++;
    }
    else if(w.equalsIgnoreCase("destroy")){
    destroy++;
    }
    else{
    continue;
    }
  }
  if(madrid>bayern){
    System.out.println("Madrid Supporter");
  }
  else if(bayern>madrid){
    System.out.println("Bayern Supporter");
  }
  else{
    System.out.println("Neutral");
  }
  if(close>0){
    System.out.println("Fan expect a close match");
  }
  else if(destroy>0){
    System.out.println("Fan expects a dominating victory!");
  }
  else{
    System.out.println("Hard to read the fan sentiment");
  }
  
  }
}
