class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int a = 0;
        
        if(common[1] - common[0] == common[2]-common[1]){
           a  = common[common.length-1] - common[common.length-2];
            answer = common[common.length-1] + a;  
        }else {
            a  = common[common.length-1] / common[common.length-2];
            answer = common[common.length-1] * a;       
        }
        return answer;
    }
}