package datastructure.array;

/*
https://www.youtube.com/watch?v=zgaOU5aInOc
https://www.youtube.com/watch?v=djt9mwch-Xo
Brute : If the elements are +ve int only then for each mat[i][j]==0 make the entire column that is non 0 to a negative int say -1.
Then traverse the mat again and set all -1 to 0         
Time complexity = O (nxm) x (n+m) nxm for linerly traversing in the array & for every traversal you have to traverse for the entire 
row + entire column so n+m time. Space complexity is O(1) 

Better : Take 2 arrays onr row[] and other col[] and if mat[i][j]==0 then set row[i]=0 and col[j]=0 and at last for mat[i][j] if row[i]==0 or col[j]==0 
then set mat[i][j] to 0
Time complexity is O (nxm + nxm) because we linerly traverse the array twice.
Space complexity is O (N) + o(M) for taking 2 dummy arrays.

Best : Take 1st row of mat as col[] and 1st col of mat as row[].
Time complexity is O 2x(nxm) because we traverse the matrix twice.
Space complexity is O (1) because we are changing in the given matrix itself.
*/

/*
 * Solution
1 traverse First row if any element is 0 then set boolean row as true.
2 traverse First col if any element is 0 then set boolean col as true.
3 traverse matrix starting index 1 for each element if any element 0 then make corresponding 0th index i.e. fst row & col 0.
4 traverse matrix again starting index 1, if it is 0 in any row, then make the whole row 0. Remember don't touce 0th index.
5 Similarly traverse matrix again starting index 1, if index 0 is 0 in any col, then make the whole col 0. Remember don't touce 0th index.
6 Finally, if row is true then , make 0th row complely 0
7  & IF col is true then, make the 0th col completely 0
*/

public class SetMatrixZeroes {
	public void setZeroes(int[][] mat) {
		boolean row = false, col = false;
        int rlen = mat.length, clen = mat[0].length;
        for(int i = 0; i < rlen; i++){ if(mat[0][i] == 0) row = true;}
        for(int j = 0; j < clen; j++){ if(mat[j][0] == 0) col = true;}
        for(int i = 1; i < rlen; i++){
            for(int j = 1; j < clen; j++){
                if(mat[i][j]==0){
                    mat[i][0]=0;mat[0][j]=0;
                }
            }
        }
        for(int i = 1; i < rlen; i++){
            if(mat[i][0] == 0)
            for(int j = 0; j < clen; j++){
                mat[i][j]=0;
            }
        }
        for(int j = 1; j < clen; j++){
            if(mat[0][j] == 0)
            for(int i = 0; i < rlen; i++){
                mat[i][j]=0;
            }
        }
        if(row)
           for(int i = 0; i < rlen; i++){ mat[0][i] = 0;}
        if(col)
           for(int j = 0; j < clen; j++){ mat[j][0] = 0;} 
    }
	
	public static void main (String args []) {
		int[][] mat = { {1,1,1}, {1,0,1}, {1,1,1} };
		SetMatrixZeroes SMZ = new SetMatrixZeroes();
		SMZ.printAsMatrix(mat);
		SMZ.setZeroes(mat);
		System.out.println("*******");
		SMZ.printAsMatrix(mat);
	}
	
	public void printAsMatrix(int[][] mat){
		for (int i = 0; i < mat.length; i++) {
		    for (int j = 0; j < mat[i].length; j++) {
		        System.out.print(mat[i][j] + " ");
		    }
		    System.out.println();
		}
	}
}
