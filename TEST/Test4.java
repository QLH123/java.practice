
// // class Farther{
// //      private String name="zhangjun";
// //      class Child {
// //         public void introFather(){
// //         System.out.println(name);
// //         }
// //     }
// // }
// // public class Test4{
// //     public static void main(String[] args){
// //         Farther.Child child=new Farther().new Child();
// //          child.introFather();
// //     }
// // }


// // class A{ 
// //     public A(){ 
// //     System.out.println("A"); 
// //     } 
// // }     
// // class B extends A{ 
// //     public B(){ 
// //         super();
// //     System.out.println("B"); 
// //     } 
// // }
// //  public class Test4{
// //      public static void main(String[] args){
// //         B b=new B();
// //     }
// //  }
    

// // public class Test4{
// //     public static void main (String[] args){
// //         isShuiXianHua(999);
// //     }
// //     public static void isShuiXianHua(int i){
// //         if(i<100&&i>1000)
// //         {
// //             return;
// //         }
// //         int j=100;
// //           while(j<=i)
// //           {
// //             int g=j%10;
// //             int s=(j/10)%10;
// //             int b=j/100;
// //               if((g*g*g+s*s*s+b*b*b)==j)
// //                     System.out.print(j+",");
// //             j++;
// //           }
// //     }
// // }



// abstract class Role{
//     private String name;
//     private int age;
//     private String sex;
//     public abstract void play();
//     public Role(String name, int age,String sex) {
//      this.name = name;
//      this.age = age;
//      this.sex = sex;
//    }
//    public Role(String name, int age) {
//      this.name = name;
//      this.age= age;
//    }
//    public String getName() {
//      return name;
//    }
//    public void setName(String name) {
//      this.name = name;
//    }
//   public int getAge() {
//      return age;
//    }
//     public void setAge(int age) {
//      this.age = age;
//    }
//     public String getSex() {
//      return sex;
//    }
//     public void setSex(String sex) {
//      this.sex = sex;
//    }
//  }
//  class Employee extends Role{
//     private int salary;
//     private static final int ID=10;
//     public Employee(String name, int age, int salary) {
//          super(name, age);
//          this.salary = salary;
//      }
//      public Employee(String name, int age, String sex,int salary) {
//          super(name, age,sex);
//          this.salary = salary;
//      }
//      public void play() {
//          System.out.println(this.salary);
//      }
//      public final void Sing() {
//          System.out.println("我是final");
//      }
//  }
//  class Manager extends Employee{
//     public final int vehicle=10;
//     public Manager(String name, int age, int vehicle) {
//      super(name, age,vehicle);
//     }
//  }
//  public class Test4{
//      public static void main(String[] args){
//          Employee employee=new Employee("zhouyun",89,10000);
//          employee.play();
//          Manager manager=new Manager("zhouyun",25,365);
//          manager.play();
//      }
//  }