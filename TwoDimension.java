public class TwoDimension{
    static int rowCount=4;
    static int ColCount=4;
    static int value=10;
    public static void main(String[] args) {
        
        int twoDimensionalArray[][]=new int[rowCount][ColCount];

       populateArray(twoDimensionalArray);
       printArray(twoDimensionalArray);
            
        }
        
    

private static void populateArray(int[][] twoDimensionalArray){

    for (int row = 0; row < rowCount; row++) {
        for (int col = 0; col < ColCount; col++) {
            twoDimensionalArray[row][col]=value++;
            
        }
}
}
private static void printArray(int [][] twoDimensionalArray)
{
    for (int row = 0; row < rowCount; row++) {
        for (int col = 0; col < ColCount; col++) {
            System.out.print(twoDimensionalArray[row][col]+"\t");
            
        }System.out.println();
        
    }

}
}