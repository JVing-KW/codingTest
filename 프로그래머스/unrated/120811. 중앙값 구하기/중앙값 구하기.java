import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        
    	Arrays.sort(array);
    	
        int a = (array.length-1) / 2;
         int answer =   array[a];;
         return answer;
    }
}