class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String num3 = Integer.toString(n,3);
    
          
       
         String reverse = "";        
            for (int i = num3.length() - 1; i >= 0; i--) 
            {
                reverse = reverse + num3.charAt(i);    
            }
        
        answer = Integer.parseInt(reverse,3);
        
        return answer;
    }
}