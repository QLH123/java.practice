 class Test{
    // public char a;
    // public int b;
    // public void fun(){
    //     System.out.print(a+"---"+b);
    // }
     
    public static int a;
    public Test(int a){
        this.a=a;
    }
    public void fun1(){
        System.out.print((a+11));
    }
}
public class Test3{
    public static void main(String[] args){
       Test test=new Test(10);
    //  test.fun();

       test.fun1();
    }
}


public class Test3{
    public static void main(String[] args){
        for (int i = 0; i <5 ; i++) {
            System.out.print(Fibonacci(i)+",");
        }
    }
    public static int Fibonacci(int a){
        if(a<2) 
            return 1;
        return Fibonacci(a-1)+Fibonacci(a-2);
    }
}



class Test{
    public Test(){
        System.out.println("Hello Constructor");
    }
    public Test(String n){
        this();
        System.out.println(n);
    }
}
public class Test3{
    public static void main (String[] arg){
     Test test=new Test("holle");
   
    }
}





           