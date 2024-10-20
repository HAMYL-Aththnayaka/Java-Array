
import java.util.*;
class Array{

    public static void main(String args[]){
     

         System.out.println("Enter value for array");
         Scanner read =new Scanner(System.in);
         int num = read.nextInt();
         int []Array = new int[num];

         for(int i = 0 ; i < num; i++ ){
            
            System.out.println(" Enter value of array "+i+" : " );
            Array[i] = read.nextInt();
         }

         System.out.println("Your Array is :\n");

         for(int i = 0 ; i < num; i++ ){
            System.out.println(Array[i] );
            
         }
    }
}