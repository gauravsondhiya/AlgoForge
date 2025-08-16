// bubble sort/

// public class sorting {
//     public static void sortt(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] < arr[j]) {
//                     System.out.print(arr[i]);
//                 } else {
//                     System.out.print(arr[i]);
//                 }
//             }
//         }
//     }

//     public static void main(String args[]) {
//         int arr[] = { 5, 4, 3, 2, 1 };
//         sortt(arr);

//     }
// }

public class sorting{
    public static int table(int n){
        for(int i=1; i<=10; i++){
            return n*i;
        }

    }
    public static void main(String args[]){
        System.out.print(table(9));
    }
}