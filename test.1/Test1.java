public class Test1{
    public static void main(String[] args){
    for (int i=0;i<args.length;i++){                   
       System.out.println(args[i]);  
      }

      for(String str: args){
        System.out.println(str); //for_each循环：用于数组输出，不可修改
      }    // for（数据类型 临时变量名称：数组名程） 
  
    fun(6);
    prossce ();  
   }
    public static void fun(int d){
       if(d==2){
         return;     //当方法以void作为返回类型时，直接用return，就表示奇数方法调用
       }
        System.out.println(d);
      }  
   public static void prossce(){
    int[] x = null;
    int[] temp = null;
    x = new int[3];
    System.out.println(x.length);
    x[0]=1;
    x[1]=2;
    x[2]=3;
    for (int k: x){
      System.out.println(k);
    }
    temp=x;     //引用传递，多个栈内存指向相同的堆内存
    temp[0]=20;
    System.out.println(x[0]);
     }
 }
 