public class MatrixCalculator {
	public int[][] add(int [][]ma , int [][]mb) {
		int rowsA = ma.length;
		int colsA = ma[0].length;
		
		int rowsB = mb.length;
		int colsB = mb[0].length;
		
		try {
			if(rowsA != rowsB ||  colsA != colsB) {
				throw new MatrixException("Size of matrix is not the same!");
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		int [][]result = new int[rowsA][colsA];
		
		for(int row = 0 ; row < rowsA; row++) {
			for(int col = 0; col < colsA; col++) {
				result[row][col] = ma[row][col] + mb[row][col];
			}
		}
		
		return result;

	}
	
	public int[][] subtract(int [][]ma , int [][]mb) {
		int rowsA = ma.length;
		int colsA = ma[0].length;
		
		int rowsB = mb.length;
		int colsB = mb[0].length;
		
		try {
			if(rowsA != rowsB ||  colsA != colsB) {
				throw new MatrixException("Size of matrix is not the same!");
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		int [][]result = new int[rowsA][colsA];
		
		for(int row = 0 ; row < rowsA; row++) {
			for(int col = 0; col < colsA; col++) {
				result[row][col] = ma[row][col] + (mb[row][col] * -1);
			}
		}
		
		return result;

	}
	

	public int[][] multiply(int [][]ma , int [][]mb) {
		int rowsA = ma.length;
		int colsA = ma[0].length;
		
		int rowsB = mb.length;
		int colsB = mb[0].length;
		
		try {
			if(colsA != rowsB) {
				throw new MatrixException("Size of matrix is not valid!");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		int [][]result = new int[rowsA][colsB];
		
		for(int row = 0 ; row < rowsA; row++) {
			for(int col = 0; col < colsB; col++) {
				for(int k = 0; k < colsA; k++) {
					result[row][col] += ma[row][k] * mb[k][col];	
				}
			}
		}		
		return result;
	}

	class MatrixException extends Exception
	{
	      public MatrixException() {}
	      public MatrixException(String message)
	      {
	         super(message);
	      }
	 }
	
	
}
