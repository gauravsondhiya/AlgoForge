
public class day3{
    public static void swap(int a,int b){
       int temp =a ;
       a = b ;
       b = temp ;
       System.out.print(a+" "+b);
    }
    public static void main(String args[]){
        int a=4 ;
        int b=5  ;
         swap(a,b);
    }
}