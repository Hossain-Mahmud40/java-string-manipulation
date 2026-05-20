import java.util.Scanner;
public class MaxTwoDigitPinExtractor{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Message: ");
  String str = sc.nextLine();
  int max = 0;
  for(int i =0;i<str.length()-1;i++){
  char c1 = str.charAt(i);
  char c2 = str.charAt(i+1);
  if(Character.isDigit(c1)==true && Character.isDigit(c2)==true){
  int num = (c1-'0')*10+(c2-'0');
  if(num>max){
  max=num;
  }
  }
  }
  if(max==0){
  System.out.println("2-Digit PIN: "+max);
  }else{
  System.out.println("2-Digit PIN: "+max);
  }
  
  
  }
}
