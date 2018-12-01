public class Test1{
   //  public static void main(String[] args) {
    // for(int i=1;i<10;i++){
        //  for (int j=1;j<=i;j++){
                   // System.out.print(i);
                   // System.out.print('*');
                   // System.out.print(j);
                   // System.out.print('=');
                   // System.out.print(i*j);
                  //  System.out.print(i+"*"+j+"="+i*j+"\t");
        //   }
      //   System.out.println("\n");
      // }
  //  }
//}

  public static void main(String[] args){
    System.out.println(numRecur(5));
  }
    public static long numRecur(int k){
         if (k>1){
         return (k*numRecur(k-1));
       }
       else {
       return 1;
       }
  }
} 