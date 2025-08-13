// function 
// public class day2 {
//     public static void hello(){
//         System.out.print("Hello");
//     }
//     public static void main (String args[]){
//           hello();
//     }
// }

// function with return

// public class day2{
//     public static String hello(){
//         return "Hello";
//     }
//     public static void main (String args[]){
//          String a= hello();
//          System.out.print(hello());
//     }
// }

// parameter and argument

// public class day2 {
//       public static int sum(int a,int b){
//         int ans = a+b;
//         return ans;
//       }
//     public static void main (String args[]){
//         int ans = sum(1,4);
//         System.out.print(ans);
//     }
// }

//   find factorial 
// import java.util.*;
// public class day2{
//     public static int factor(int a){
//         int out=1;
//         for(int i=1;i<=a; i++){
//            out =out*i;
//         }
//         return out;
//     }
//     public static void main (String args[]){
//      Scanner sc = new Scanner(System.in);
//      int a = sc.nextInt();
//      System.out.print(factor(a));
//     }
// }

// find binomial coffiencnt

// public class day2{

   
//     public static int factorial(int n){
//         int a = 1;
//         for(int i=1; i<=n; i++){
//            a= a*i; 
//         }
//         return a;
//     }
    
//     public static void main (String args[]){
//         int n=5;
//         int r= 2;
//         int nvalue = factorial(n);
//         int rvalue =factorial(r);
//         int down = n-r;
//         int downfactorial = factorial(down);
//         int ans = nvalue /(rvalue * downfactorial); 
//         System.out.print(ans);
//     }
// }

// public class day2{
//     public static String prime(int a){
//         if(a%2==0 || a%3==0){
//             return "not prime";
//         }else{
//             return "Prime";
//         }
//     }
//     public static void main (String args[]){
//         System.out.print(prime(2));
//     }
// }