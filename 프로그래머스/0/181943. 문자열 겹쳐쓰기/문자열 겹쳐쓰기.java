import java.io.*;
import java.util.*;

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
       
        StringBuilder sb = new StringBuilder();
        
        sb.append(my_string);
        sb.replace(s,s+overwrite_string.length(),overwrite_string);
        
        return sb.toString();
    }
}