import java.util.Scanner;
import java.util.*;

public class twoDarray {
    public static boolean Search(int matrix[][], int key){
        for(int i=0; i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==key){
            System.out.println("Found element at index:("+i+","+j+")");
            return true;
           }
         }
      }
      System.out.println("no element found");
      return false;
    }
    public static void main(String[] args) {
        int matrix [][]= new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        System.out.println("Enter the elements:");
        //input
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n;i++){
            for(int j=0;j<m;j++){
            matrix[i][j]=sc.nextInt();
            }
        }
    
    //output
    for(int i=0; i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(matrix[i][j]+" ");
       
        }
        System.out.println();
      }
      Search(matrix, 7);
    }
   // Search(int matrix[][],5);
}
