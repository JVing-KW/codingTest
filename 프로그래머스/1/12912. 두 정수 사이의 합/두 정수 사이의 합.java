class Solution {
    public long solution(int a, int b) {
        
        long answer = 0;
        int c = 0;
        if(a > b){
            c = b;
            b = a;
            a = c;      
        }else if(a == b){
            return a;
        }
        for(int i = a; i <= b; i++){
            answer += (long)i ;
        }
        return answer;
    }
}