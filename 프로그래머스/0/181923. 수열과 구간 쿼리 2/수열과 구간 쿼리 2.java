import java.util.*;
import java.io.*;
import java.lang.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] result = new int[queries.length];
        
        for(int i=0;i<queries.length;i++){
            
            int min = 1000001;
            
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for(int j=s;j<=e;j++){
                if(arr[j]>k && min>arr[j]){
                    min=arr[j];
                }
            }
            
            if(min==1000001){
                result[i]=-1;
            }else{
                result[i]=min;
            }
        }
        return result;
    }
}