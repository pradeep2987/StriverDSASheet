![image](https://user-images.githubusercontent.com/29567227/169739047-3ad089f5-6699-4142-9075-7245ad18b8b1.png)

<br>
https://www.youtube.com/watch?v=zgaOU5aInOc
<br>
https://www.youtube.com/watch?v=djt9mwch-Xo
<br><br>
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

![image](https://user-images.githubusercontent.com/29567227/169738633-a6c69708-cfef-4c42-8ae2-e7b3e8e3a8dc.png)
<br><br>
![image](https://user-images.githubusercontent.com/29567227/169738693-4f761fd7-41fb-4e9b-a95d-8fbe934d04c2.png)