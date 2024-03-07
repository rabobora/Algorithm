class Solution {
    public int solution(int[] num_list) {
        
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        
        for(int i = 0 ; i < num_list.length ; i++){
            if(num_list[i]%2==0){
                even.append(String.valueOf(num_list[i]));
            }else {
                odd.append(String.valueOf(num_list[i]));
            }
        }
        
        return Integer.parseInt(String.valueOf(odd))+Integer.parseInt(String.valueOf(even));
    }
}