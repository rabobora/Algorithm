import java.io.*;
import java.util.*;

class Solution {
    public int solution(int a, int b) {
        
        int sum1 = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int sum2 = Integer.parseInt(String.valueOf(b)+String.valueOf(a));
        int max = Math.max(sum1,sum2);
        return max;
    }
}