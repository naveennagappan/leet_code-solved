class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans =new ArrayList<>();
       int rowtop=0;
       int rowbottom=matrix.length-1;
       int colleft=0;
       int colright=matrix[0].length-1;
       while(rowtop<=rowbottom&&colleft<=colright){
        // go to right --->
        for(int i=colleft;i<=colright;i++){
         ans.add(matrix[rowtop][i]);
        }
        rowtop++;
        //go to bottom
        for(int i=rowtop;i<=rowbottom;i++){
            ans.add(matrix[i][colright]);
        }
        colright--;
        //go to left <----
        if(rowtop<=rowbottom){
            for(int i=colright;i>=colleft;i--){
                ans.add(matrix[rowbottom][i]);
            }
            rowbottom--;
        }
        // go to up ^
        if(colleft<=colright){
            for(int i=rowbottom;i>=rowtop;i--){
                ans.add(matrix[i][colleft]);
            }
            colleft++;
        }
       }
       return ans; 
    }
}