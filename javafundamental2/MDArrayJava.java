package javafundamental2;

/**
 *
 * @author Fardan
 */
public class MDArrayJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte arrIdx, rowIdx, colIdx;
        //One Dimensional Arrays
        int[] fisrtArray = {2, 5, 3}; 
        int[] secondArray = {9, 5, 3}; 
        int[] thirdArray = {2, 4, 9}; 
        int[] fourthArray = {10, 11, 12}; 
        int[] fifthArray = {13, 14, 15}; 
        int[] sixthArray = {16, 17, 18}; 
        int[] seventhArray = {19, 20, 21}; 
        int[] eighthArray = {22, 23, 24}; 
        int[] ninthArray = {25, 26, 27};
        
        //Two Dimensional Arrays
        int[][] twoDimensionalArray1 = {fisrtArray, secondArray, thirdArray}; 
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};
        
        //Three Dimensional Array
        int[][][] threeDimensionalArray = {twoDimensionalArray1, 
        twoDimensionalArray2, twoDimensionalArray3};
        
        for (arrIdx=0; arrIdx<3; arrIdx++) {
            for (rowIdx=0; rowIdx<3; rowIdx++) {
                if (rowIdx == 1 || rowIdx == 2) {
                    System.out.printf(" ");
                }
                for (colIdx=0; colIdx<3; colIdx++) {
                    if (colIdx == 1 || colIdx == 2) {
                        System.out.printf(" ");
                    }
                    if (rowIdx == 0 && colIdx == 0) {
                        System.out.printf("{{");
                    } else if (rowIdx == 1 && colIdx == 0) {
                        System.out.printf("{");
                    } else if (rowIdx == 2 && colIdx == 0) {
                        System.out.printf("{");
                    }
                    System.out.printf("%d", threeDimensionalArray[arrIdx][rowIdx][colIdx]);
                    if (rowIdx == 0 && colIdx == 2) {
                        System.out.printf(" }");
                    } else if (rowIdx == 1 && colIdx == 2) {
                        System.out.printf(" }");
                    } else if (rowIdx == 2 && colIdx == 2) {
                        System.out.printf(" } }\n");
                    }
                }
            }
        }
    }
    
}
