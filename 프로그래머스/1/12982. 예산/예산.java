import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
                int[] arr  = Arrays.stream(d).sorted().toArray();
          
        
        for(int a : arr){
        if(budget < a){
            return answer;
        }    
        budget = budget - a ;                    
        answer ++;
        }
        
        
        return answer;
    }
}