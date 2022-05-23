package datastructure.array.SetMatrixZeroes;

public class SetMatrixZeroes {
	public void setZeroes(int[][] mat) {
		boolean row = false, col = false;
		int rlen = mat.length, clen = mat[0].length;
		for (int i = 0; i < rlen; i++) {
			if (mat[0][i] == 0)
				row = true;
		}
		for (int j = 0; j < clen; j++) {
			if (mat[j][0] == 0)
				col = true;
		}
		for (int i = 1; i < rlen; i++) {
			for (int j = 1; j < clen; j++) {
				if (mat[i][j] == 0) {
					mat[i][0] = 0;
					mat[0][j] = 0;
				}
			}
		}
		for (int i = 1; i < rlen; i++) {
			if (mat[i][0] == 0)
				for (int j = 0; j < clen; j++) {
					mat[i][j] = 0;
				}
		}
		for (int j = 1; j < clen; j++) {
			if (mat[0][j] == 0)
				for (int i = 0; i < rlen; i++) {
					mat[i][j] = 0;
				}
		}
		if (row)
			for (int i = 0; i < rlen; i++) {
				mat[0][i] = 0;
			}
		if (col)
			for (int j = 0; j < clen; j++) {
				mat[j][0] = 0;
			}
	}

	public static void main(String args[]) {
		int[][] mat = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		SetMatrixZeroes SMZ = new SetMatrixZeroes();
		SMZ.printAsMatrix(mat);
		SMZ.setZeroes(mat);
		System.out.println("*******");
		SMZ.printAsMatrix(mat);
	}

	public void printAsMatrix(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}

/*Output
1 1 1 
1 0 1 
1 1 1 
*******
1 0 1 
0 0 0 
1 0 1 
*/
