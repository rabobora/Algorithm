class Solution {
    public int solution(int a, int d, boolean[] included) {
        
        int n = included.length;
        int sum = 0;
        
        for(int i=0;i<n;i++){
            if(included[i]==true){
                sum += a + i*d;
            }
        }
        
        return sum;
    }
}