public class spiralMatrix {
    public static void Matricses(int matrix[][]){
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCOl = 0;
        int endCOl = matrix[0].length-1;
        while(startRow<=endRow && startCOl<=endCOl){
        
            //top boundary
        for(int j=startCOl;j<=endCOl;j++){
            System.out.print(matrix[startRow][j]+" ");
        }
        
        //right boundary
        for(int i=startRow+1;i<=endRow;i++){
            System.out.print(matrix[i][endCOl]+" ");
        }

       //bottom boundary
       for(int j=endCOl-1;j>=startCOl;j--){
        if(startRow==endRow){
        break;
          } System.out.print(matrix[endRow][j]+" ");
       }

       //left boundary 
       for(int i=endRow-1;i>=startRow+1;i--){
        if(startCOl==endCOl){
            break;
        }
        System.out.print(matrix[i][startCOl]+" ");
      }

      startCOl++;
      startRow++;
      endCOl--;
      endRow--;
    }
    System.out.println();
}
    

    public static void main(String[] args) {
        int matrix [][] = {{1, 2, 3, 4},
                           {5, 6, 7, 8},
                           {9, 10, 11, 12},
                           {13, 14, 15, 16}};
       Matricses(matrix);            
    }
    
}
