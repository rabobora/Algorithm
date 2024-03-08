class Solution {
    public int[] solution(int[] arr, int[][] queries) {
         
        for(int a=0;a<queries.length;a++){
            int i = queries[a][0];
            int j = queries[a][1];
            
            int k = arr[i];
            arr[i]=arr[j];
            arr[j]=k;
        }
        
        return arr;
    }
}