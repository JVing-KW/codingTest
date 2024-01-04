class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int y = x;
        int a = 0;
        boolean answer = false;
        while(y !=0){
            a = y % 10;
            y = y / 10;
            sum += a;
        }
      
        if(x % sum == 0){
            answer = true;
        }
        return answer;
    }
}