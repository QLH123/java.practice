public class Test5{
  public static void main(String[] args){
    //字符复制
    String str=repeat('d',5);
    System.out.println(str);
    //给定字符串，且给定目标长度，设置字符在其之前
    String str1=fillBefore("uqo",'a',5);
    System.out.println(str1);
    //给定字符串，且给定目标长度，设置字符在其之后
    String str2=fillAfter("yt",'f',5);
    System.out.println(str2);
   //给定字符串，去掉中间特定部分
    String str3=removeAll("aa-bb-cc-dd-ee-ff", "-") ;
    System.out.println(str3);
   //字符串逆置
    String str4=reverse("student");
    System.out.println(str4);
  }
   public static String repeat(char c, int count) { 
    if(count<=0){ 
          return " ";
      }
      else{
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<count;i++){
           sb.append(c);
        }
        return sb.toString();
      }    
   }
    public static String fillBefore(String str, char filledChar, int len) {
     if(len<str.length()){
       return str;
     }
     else{
       int length=len-str.length();
      StringBuilder sb=new StringBuilder();
      for (int i=0;i<length;i++){
        sb.append( filledChar);
     }
     sb.append(str);
     return sb.toString();
    }  
  }  
   public static String fillAfter(String str, char filledChar, int len) {
    if(len<str.length()){
      return str;
    }
    else{
      StringBuilder sb=new StringBuilder();
      sb.append(str);
      for (int i=str.length();i<len;i++){
        sb.append( filledChar);
     }
     return sb.toString();
    }
  } 
  public static String removeAll(String str, String strToRemove) {
     if(!str.contains(strToRemove)){
        return str;
      } 
  else{
   return str.replaceAll(strToRemove,"");
   }
  }
  public static String reverse(String str) {
    char[] date=str.toCharArray();
    char[] result=new char[str.length()];
    int flag=0;
  for(int i=str.length()-1;0<=i;i--){
    result[flag]=date[i];
    flag++;
  }
    return String.valueOf(result);
 } 
}
   

  