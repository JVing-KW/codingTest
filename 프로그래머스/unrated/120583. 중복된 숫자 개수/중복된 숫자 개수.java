class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int num = 0;
        
        for(int arr : array){
            if(n == arr){
                num ++;
            }
        }
        answer = num;
        return answer;
    }
}