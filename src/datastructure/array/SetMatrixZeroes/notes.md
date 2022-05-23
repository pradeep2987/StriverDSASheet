![image](https://user-images.githubusercontent.com/29567227/169740400-74aa199f-b193-4f8f-9523-5179b83a0ee0.png)
<br>
https://www.youtube.com/watch?v=zgaOU5aInOc
<br>
https://www.youtube.com/watch?v=djt9mwch-Xo
<br><br>
**Brute** : If the elements are +ve int only then for each mat[i][j]==0 make the entire column that is non 0 to a negative int say -1.
Then traverse the mat again and set all -1 to 0         
Time complexity = O (nxm) x (n+m) nxm for linerly traversing in the array & for every traversal you have to traverse for the entire 
row + entire column so n+m time. Space complexity is O(1)
<br><br>
**Better** : Take 2 arrays onr row[] and other col[] and if mat[i][j]==0 then set row[i]=0 and col[j]=0 and at last for mat[i][j] if row[i]==0 or col[j]==0 
then set mat[i][j] to 0
Time complexity is O (nxm + nxm) because we linerly traverse the array twice.
Space complexity is O (N) + o(M) for taking 2 dummy arrays.
<br><br>
**Best** : Take 1st row of mat as col[] and 1st col of mat as row[].
Time complexity is O 2x(nxm) because we traverse the matrix twice.
Space complexity is O (1) because we are changing in the given matrix itself.

<br>**Solution**<br>
1. traverse First row if any element is 0 then set boolean row as true.<br>
2. traverse First col if any element is 0 then set boolean col as true.<br>
3. traverse matrix starting index 1 for each element if any element 0 then make corresponding 0th index i.e. fst row & col 0.<br>
4. traverse matrix again starting index 1, if it is 0 in any row, then make the whole row 0. Remember don't touce 0th index.<br>
5. Similarly traverse matrix again starting index 1, if index 0 is 0 in any col, then make the whole col 0. Remember don't touce 0th index.<br>
6. Finally, if row is true then , make 0th row complely 0<br>
7.  & IF col is true then, make the 0th col completely 0<br>

![image](https://user-images.githubusercontent.com/29567227/169740332-a471e158-3c04-48e1-b624-8bfd19997988.png)
