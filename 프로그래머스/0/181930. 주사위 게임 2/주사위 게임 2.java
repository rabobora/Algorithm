import java.util.*; 
import java.io.*;

class Solution {
    public int solution(int a, int b, int c) {
        
        int result = 0;
        
        if(a!=b && a!=c && b!=c){
            result = a+b+c;
        }else if (a==b && a==c && b==c){
            result = (a+b+c)*(int)(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2))*(int)(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3));
        }else{
            result =  (a+b+c)*(int)(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));
        }
        
        return result;
    }
}