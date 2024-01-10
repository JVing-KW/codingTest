class Solution {
        public int solution(int[] a, int[] b) {
        int answer = 0; 
        int count =0;    
            
            for(int arr : a){
                count++;
            }
        for(int i =0 ; i < count ;i++){
         answer +=  a[i] * b[i];
        }
            
            
        return answer;
    }
}