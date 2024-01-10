class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long charge = 0;
        
        
        
        for(int i = 1; i < count + 1; i++){
        charge += price * i ;
        
        }
        if(charge <= money){
            return 0;
        }
       answer =charge -  money ;
        
        
        return answer;
    }
}