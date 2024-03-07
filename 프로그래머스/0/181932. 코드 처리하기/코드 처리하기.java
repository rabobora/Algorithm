import java.io.*;
import java.util.*;

class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;
        
        for(int i=0; i<code.length() ;i++){
            
            if(mode==0){
                if(code.charAt(i) != '1' && i%2 == 0){
                    ret.append(code.charAt(i));
                } else if (code.charAt(i)=='1'){
                    mode = 1;
                }
            } else {
                if(code.charAt(i) != '1' && i % 2 != 0){
                    ret.append(code.charAt(i));
                } else if (code.charAt(i)=='1'){
                    mode = 0;
                }
            }
        }
        
        if(ret.length()==0){
            return "EMPTY";
        }else{
            return String.valueOf(ret);
        }
    }
}