class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        if(A==null || A.length==0){
            return A;
        }
        for(int i=0;i<A.length;i++){
            int count=0;int k=A[i].length-1;int j=0;
            while(k>=0  && j<=k){
                int temp=A[i][k];
                A[i][k]=(A[i][j]==1)?0:1;
                A[i][j]=(temp==1)?0:1;
                k--;j++;
            }
            j=count;
        }
        return A;
    }
}