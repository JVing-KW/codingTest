import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
     
        int count = 0;       
       
        int[] ans = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(i < arr.length -1){
                            
            if(arr[i] != arr[i+1]){
                ans[count]=arr[i];
                count++;
            }
                }else {
                ans[count]=arr[i];
                count++;
            }
        }
        
        int[] answer = new int[count];
            for(int i=0;i < count;i++){
            answer[i]=ans[i];
            }
        return answer;
    }
}