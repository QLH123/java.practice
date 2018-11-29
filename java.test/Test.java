public class Test{
   public static void main(String[] args){
       int maxValue=Integer.MAX_VALUE;    //2147483647
       int minValue=Integer.MIN_VALUE;   //-2147483648
       long num1=maxValue+2;
       long num2=maxValue+2l;
       long num3=minValue-2;
       long num4=minValue-2l;
       long num=2147483648l;
       int result1=(int) num;   
      // int result2=num;     //不兼容的类型，数据丢失，编译报错
       System.out.println(num1);      //-2147483647
       System.out.println(num2);     //2147483649
       System.out.println(num3);     //2147483646
       System.out.println(num4);     //-2147483650
       System.out.println(result1);  //-2147483648
     //  System.out.println(result2);
      }
   }