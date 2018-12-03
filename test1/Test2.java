public class Test2{
    public static int arrayMaxElement(int[] data){
        int max=data[0];        
         for (int i=1;i<data.length;i++){    
             if(data[i]>max){
               max=data[i];
             }
         }
         return max;
    }                         
    public static int arrayMinElement(int[] data){
        int min=data[0];
        for (int i=1;i<data.length;i++){
            if(data[i]<min){
             min=data[i];
            }  
        }
        return min;
    } 
    public static int arrayElementSum(int[] data){
        int sum=0;
        for (int i=0;i<data.length;i++){    
            sum+=data[i];                 
            }
            return sum;
        }
    public static int[] arrayJoin(int[] a, int[] b){
        int [] str=new int[a.length+b.length];
         for(int i=0;i<a.length;i++){
             str[i]=a[i];
         }
         int j=0;
         for(int i=0;i<b.length;i++){
             str[a.length+i]=b[j];
             j++;
         }
       return str; 
    } 
    public static int[] arraySub(int[] data, int start , int end){
        int[] k=new int[end-start];
        int j=0;
        for (int i=start;i<end;i++){
                k[j]=data[i];
                j++;
            }
            return k;
        }    
    public static void printArray(int[] data){
        for (int i=0;i<data.length;i++){    //for (int i : data){
           System.out.print(data[i]+",");    //System.out.print(i);
            }  
        }
    public static void printReversal(int[] data){
        int temp=0;
        int i=0;
        int j=data.length;
        while(i<j){
            temp=data[i];
            data[i]=data[j-1];     //从后边输出
            data[j-1]=temp;
            j--;
            i++;
            }   
            printArray(data);     
        }
    public static void main(String[] args){
        int[] arr=new int[]{5,6,12,4,11,3,8,11};
        int[] num=new int[]{5,7,6,3,9,7,15,12};
        int[] s=new int[arr.length+num.length];
        int[] m=new int[4];
        int max= arrayMaxElement(arr);
        System.out.print(max+"\n");     //合成  
        int min=arrayMinElement(arr); 
        System.out.print(min+"\n");
        int sum1=arrayElementSum(arr);
        System.out.print(sum1+"\n");
        s=arrayJoin(arr,num);
        printArray(s);
        System.out.print("\n");
        m=arraySub(arr,3,7);
        printArray(m);
        System.out.print("\n");
        printReversal(arr);
    }
}
