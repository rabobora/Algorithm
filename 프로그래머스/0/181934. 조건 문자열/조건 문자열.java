class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        
        int result = 0;
        if(ineq.equals("<")&&eq.equals("=")){
            if(n<=m){
                result = 1;
            }
        }else if(ineq.equals("<")&&eq.equals("!")){
            if(n < m){
                result = 1;
            }
        }else if(ineq.equals(">")&&eq.equals("=")){
            if(n>=m){
                result =1;
            }
        } else if(ineq.equals(">")&&eq.equals("!")){
            if(n>m){
                result =1;
            }
        }
        
        return result;
        }
    }