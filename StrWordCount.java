public class StrWordCount{
  
  public static void main(String[] args){
    String str="hi hello world good morning";
    int count=0;
    String arr[]=str.split(" ");
    for(String a: arr){
      count++;
    }
    System.out.println(count);
    
  }
}