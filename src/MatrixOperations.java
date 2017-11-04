
public class MatrixOperations {

	public static void main(String[] args) {
		MatrixCalculator mc = new MatrixCalculator();
		
		
		int [][]matrixA = {{3,1,2}, 
						   {-2,0,5}};
		int [][]matrixB = {{-1,3}, 
						   {0,5}, 
						   {2,5}};
		
		int [][]result = mc.multiply(matrixA, matrixB);
		//int [][]result = mc.subtract(matrixA, matrixB);
		//int [][]result = mc.add(matrixA, matrixB);
		
		int resultRow = result.length;
		int resultCol = result[0].length;
		
		for(int row = 0 ; row < resultRow; row++) {
			for(int col = 0; col < resultCol; col++) {
				System.out.print(result[row][col] + "\t" );
			}
			System.out.println();
		}

	}
}
