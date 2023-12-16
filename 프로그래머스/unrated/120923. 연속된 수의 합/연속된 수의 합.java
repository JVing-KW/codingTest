class Solution {
    public int[] solution(int num, int total) {
        int a= 0;
        int idx =0 ;
        int start=0;
        int[]  answer = new int[num];
        if(num % 2 != 0){
               a =  total / num;   
            idx = num / 2;
            start = a  - idx ;
            for(int i = 0; i < num;i++ ){
                answer[i] = start; 
                start++;
            }
                }else {
                a =  total / num;   
                    idx = (num / 2)-1;
                    start= a - idx;
                for(int i = 0; i < num; i++){
                
             answer[i] = start; 
                start++;
                
            }
        }
        return answer;
    }
}