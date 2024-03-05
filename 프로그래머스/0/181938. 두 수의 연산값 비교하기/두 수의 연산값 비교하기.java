import java.io.*;
import java.util.*;

class Solution {
    public int solution(int a, int b) {
        
        int res1 = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int res2 = 2*a*b;
        
        int max = Math.max(res1,res2);
        
        return max;
    }
    
}