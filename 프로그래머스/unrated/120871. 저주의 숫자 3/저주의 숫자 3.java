import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
class Solution {
  	 public static int solution(int n) {
		   
         int answer = 0;
         int a= 0;	   
         String str = "";
         String[] strArr = {};
        for(int i =1; i < n+1; i++){
            answer++;   
            a++;  
            if(answer % 3 == 0){
             answer++;  
             if(answer % 10 == 3) {
             	answer++;                
             }
            }     
            if(answer % 10 == 3) {
            	answer++;  
            	if(answer % 3 == 0){
            		answer++; 
            	}
            }            
                        while(answer / 10 == 3  ) {
            	answer++;	           	
            }
            while((answer-100)/ 10 == 3){
                answer++;
            }
        
       
    }        	           			            		            		              	 
        return answer;
}
}