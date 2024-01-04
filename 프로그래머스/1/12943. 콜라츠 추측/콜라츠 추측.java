class Solution {
    public int solution(int num) {
        
        long num2 = num;
        int answer =0;
        if(num == 1){
            return 0;
        }
        
        while(num2 != 1 ){
        if(answer == 500){
                         
            return -1;
        }
        if(num2 % 2 == 0){
            num2 = num2 / 2;         
        }
        else {
          num2 = (num2 * 3)+1;
        }
          answer++;
        }
        return answer;
    }
}